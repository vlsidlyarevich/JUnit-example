package com.itibo.junit.example.maths.factorial;

import com.itibo.junit.example.Maths;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static org.hamcrest.CoreMatchers.is;

/**
 * Created by vlad on 01.05.16.
 */
public class MathsFactorialSteps {

    private int a;
    private int result;
    private Maths maths = new Maths();


    @Given("^a number with value (\\d+)$")
    public void numberWithValue(int a){
        this.a = a;
    }

    @When("^we find factorial of the number (\\d+)$")
    public void multiply(int a){
        result = maths.factorial(a);
    }

    @Then("the result must be (\\d+)$")
    public void verifyResult(final int result){
        Assert.assertThat(result,is(this.result));
    }

}
