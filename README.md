# TDD and BDD usage example

##Building

####Build

To build the project, type in your terminal `mvn clean install`

___

####Cucumber report

If you want a visual report in `.html format`, go to `target/html`.
Then open `index.html` in your favourite browser.
The output will look something like this:
![cucumber output image]

___

####JaCoCo report

If you want a visual report about test coverage of project, go to `target/site`, and open 
`index.html` in your favourite browser.
The example of the output:
![jacoco output image]

___




##Description

####Cucumber
[Cucumber](https://cucumber.io/) is a testing tool based on [BDD](https://en.wikipedia.org/wiki/Behavior-driven_development). It means that testing via [cucumber](https://cucumber.io/) includes writing `.features` files, and implementing their steps in java classes.


#####Getting started
To get started add [cucumber](https://cucumber.io/) dependencies into your [pom.xml](https://github.com/vlsidlyarevich/JUnit-example/blob/master/pom.xml#L71-L82) like this:
```xml
  <dependency>
    <groupId>info.cukes</groupId>
    <artifactId>cucumber-java</artifactId>
    <version>${cucumber.version}</version>
    <scope>test</scope>
  </dependency>
  <dependency>
    <groupId>info.cukes</groupId>
    <artifactId>cucumber-junit</artifactId>
    <version>${cucumber.version}</version>
    <scope>test</scope>
  </dependency>
```
Then implement some `.features` extension files like this [maths_factorial.feature](https://github.com/vlsidlyarevich/JUnit-example/blob/master/src/test/java/com/github/junit/example/maths/factorial/maths_factorial.feature):
```java
Feature: Factorial of number

  Scenario: Find the product of two numbers
    Given a number with value 3
    When we find factorial of the number 3
    Then the result must be 6
```
So, we have provided scenario for our test. Then we need to implement test runner java class like this:
[MathsUtilFactorialTest.java](https://github.com/vlsidlyarevich/JUnit-example/blob/master/src/test/java/com/github/junit/example/maths/factorial/MathUtilFactorialTest.java)
```java
 @RunWith(Cucumber.class)
 @CucumberOptions(
 format = {"pretty", "html:target/html/"},
 features = "src/test/java/com/github/junit/example/maths/factorial/"
)
 public class MathUtilFactorialTest {
 }
```
It is simply a test runner, all that we need is to provide `Cucumber.class` and some options like `format` and `features` for creation html based reports and designation of `.features` format files.
The final step is to implement a java class with test steps. We described them in `features` format class. This class will contain some annotations like `@Given`,`@When` and `@Then`. 
Annotation `@Given` means that method should take some parameters for test.
For example:
[StringConcatSteps.java](https://github.com/vlsidlyarevich/JUnit-example/blob/master/src/test/java/com/github/junit/example/strings/concat/StringsConcatSteps.java#L21-L24)
```java
  @Given("^a string with value \"([^\"]*)\"$")
  public void aStringWithValue(String str1) {
      this.str1 = str1;
  }
```
The string in this annotation is linking with `.features` file strings, so it can take some values from `.features` file.
Next annotation is `@When`. This annotation is using for making some conditions, in our example we using it in the following form: `@When` (our methods calling) `@Then` (expected result). The following code is the example of using `@When` annotation:
[StringConcatSteps.java](https://github.com/vlsidlyarevich/JUnit-example/blob/master/src/test/java/com/github/junit/example/strings/concat/StringsConcatSteps.java#L26-L29)
```java
  @When("^we concatenate \"([^\"]*)\" and \"([^\"]*)\"$")
  public void weConcatenateAnd(String str1, String str2) {
      result = stringUtil.concat(str1, str2);
  }
```
And the final step is to make method with annotation `@Then`. It is our expected results, like this:
[StringConcatSteps.java](https://github.com/vlsidlyarevich/JUnit-example/blob/master/src/test/java/com/github/junit/example/strings/concat/StringsConcatSteps.java#L31-L34)
```java
  @Then("^the result must be \"([^\"]*)\"$")
  public void theResultMustBe(String result) {
    Assert.assertThat(result,is(this.result));
  }
```
As we can see this tests are very easy to understand but they takes a little more time that TDD tests like JUnit.

___

####JUnit
[JUnit](http://junit.org/junit4/) is a simple framework to write repeatable tests. It is an instance of the xUnit architecture for unit testing frameworks. It is an adept of  [TDD](https://en.wikipedia.org/wiki/Test-driven_development). It is easier to implement than [Cucumber](https://cucumber.io/) because there is no need to write `.features` files. There is only one java class which coontains test methods. 

#####Getting started
To get started add [JUnit](http://junit.org/junit4/) dependencies into your [pom.xml](https://github.com/vlsidlyarevich/JUnit-example/blob/master/pom.xml#L65-L70) like this:
```xml
  <dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>${junit.version}</version>
    <scope>test</scope>
  </dependency>
```
After dependencies injection we are ready to write some tests. First thing is to implement some setting up. Use `@Before` annotation for setting up before every test or `@BeforeClass` for single setting up.
[MathUtilTest.java](https://github.com/vlsidlyarevich/JUnit-example/blob/master/src/test/java/com/github/junit/example/MathUtilTest.java#L12-L17)
```java
  @Before
  public void setUp(){
    logger.info("********* SETTING UP *********");
    mathUtil = new MathUtil();
    logger.info("********* SETTING UP SUCCESSFUL *********");
  }
```
