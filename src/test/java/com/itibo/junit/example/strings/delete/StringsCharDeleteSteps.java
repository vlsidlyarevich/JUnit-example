package com.itibo.junit.example.strings.delete;

import com.itibo.junit.example.StringUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static org.hamcrest.CoreMatchers.is;

/**
 * Created by vlad on 01.05.16.
 */
public class StringsCharDeleteSteps {

    private String str;
    private int pos;
    private String result;
    private StringUtil stringUtil = new StringUtil();

    @Given("^a string with value \"([^\"]*)\"$")
    public void aStringWithValue(String str1) {
        this.str = str1;
    }

    @And("^a position of char to delete: (\\d+)$")
    public void aPositionOfCharToDelete(int arg0) {
        this.pos = arg0;
    }

    @When("^we delete char with number (\\d+) from itiibo string$")
    public void weDeleteCharWithNumberFromString(int arg0) throws Throwable {
        result = stringUtil.deleteChar(str,pos);
    }

    @Then("^the result must be \"([^\"]*)\"$")
    public void theResultMustBe(String result) {
        Assert.assertThat(result,is(this.result));
    }
}
