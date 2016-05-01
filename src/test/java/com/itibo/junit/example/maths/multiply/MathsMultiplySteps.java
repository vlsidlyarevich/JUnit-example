package com.itibo.junit.example.maths.multiply;

import com.itibo.junit.example.Maths;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static org.hamcrest.CoreMatchers.is;

/**
 * Created by vlad on 01.05.16.
 */
public class MathsMultiplySteps {

    private int a,b;
    private int result;
    private Maths maths = new Maths();


    @Given("^a number with value (\\d+)$")
    public void numberWithValue(int a){
        this.a = a;
    }

    @And("^another number with value (\\d+)$")
    public void anotherNumberWithValue(int b) {
        this.b = b;
    }

    @When("^we multiply two numbers: (\\d+) and (\\d+)$")
    public void multiply(int a,int b){
        result = maths.multiply(a,b);
    }

    @Then("the result must be (\\d+)$")
    public void verifyResult(final int result){
        Assert.assertThat(result,is(this.result));
    }

}
