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
Then implement some `.features` extension files like this [maths_factorial.feature](https://github.com/vlsidlyarevich/JUnit-example/blob/master/src/test/java/com/itibo/junit/example/maths/factorial/maths_factorial.feature):
```java
Feature: Factorial of number

  Scenario: Find the product of two numbers
    Given a number with value 3
    When we find factorial of the number 3
    Then the result must be 6
```
So, we have provided scenario for our test. Then we need to implement test runner java class like this:
[MathsUtilFactorialTest.java](https://github.com/vlsidlyarevich/JUnit-example/blob/master/src/test/java/com/itibo/junit/example/maths/factorial/MathUtilFactorialTest.java)
```java
@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:target/html/"},
        features = "src/test/java/com/itibo/junit/example/maths/factorial/"
)
public class MathUtilFactorialTest {
}
```
It is simply a test runner, all that we need is to provide `Cucumber.class` and some options like `format` and `features` for creation html based reports and designation of `.features` format files.

