package com.virgingames.CRUDTest;

import com.virgingames.testbase.TestBase;
import com.virgingames.virgingames.HomePageSteps;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.annotations.Title;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.hasItem;

@RunWith(SerenityRunner.class)
public class TestClass extends TestBase {

    @Steps
    HomePageSteps steps;

    @Title("Verify the Id to the application")
    @Test
    public void test_001(){
        ValidatableResponse response = steps.getJackpotDetail("GBP");
        response.body("data.pots.currency",hasItem("GBP"));
    }

}
