package com.github.junit.example.strings.concat;

import com.github.junit.example.StringUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static org.hamcrest.CoreMatchers.is;

/**
 * Created by vlad on 01.05.16.
 */
public class StringsConcatSteps {

    private String str1;
    private String str2;
    private String result;
    private StringUtil stringUtil = new StringUtil();

    @Given("^a string with value \"([^\"]*)\"$")
    public void aStringWithValue(String str1) {
        this.str1 = str1;
    }

    @When("^we concatenate \"([^\"]*)\" and \"([^\"]*)\"$")
    public void weConcatenateAnd(String str1, String str2) {
        result = stringUtil.concat(str1, str2);
    }

    @Then("^the result must be \"([^\"]*)\"$")
    public void theResultMustBe(String result) {
        Assert.assertThat(result,is(this.result));
    }
}