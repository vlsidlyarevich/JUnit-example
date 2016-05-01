package com.itibo.junit.example.maths.sum;

import com.itibo.junit.example.MathUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static org.hamcrest.CoreMatchers.is;

/**
 * Created by vlad on 01.05.16.
 */
public class MathsSumSteps {

    private int a,b;
    private int result;
    private MathUtil mathUtil = new MathUtil();


    @Given("^a number with value (\\d+)$")
    public void numberWithValue(int a){
        this.a = a;
    }

    @And("^another number with value (\\d+)$")
    public void anotherNumberWithValue(int b) {
        this.b = b;
    }

    @When("^we sum two numbers: (\\d+) and (\\d+)$")
    public void sum(int a,int b){
        result = mathUtil.sum(a,b);
    }

    @Then("the result must be (\\d+)$")
    public void verifyResult(final int result){
        Assert.assertThat(result,is(this.result));
    }
}
