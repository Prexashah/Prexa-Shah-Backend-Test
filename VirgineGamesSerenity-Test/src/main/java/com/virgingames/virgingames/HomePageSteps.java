package com.virgingames.virgingames;

import com.virgingames.constants.EndPoints;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;

import java.util.HashMap;

public class HomePageSteps {

    @Step("getting jackpot detail")
    public ValidatableResponse getJackpotDetail(String currency){

        HashMap<String, Object> qParam = new HashMap<>();
        qParam.put("currency", currency);
        return SerenityRest.given()
                .queryParams(qParam)
                .when()
                .get(EndPoints.GET_ALL_DATA)
                .then().log().all()
                .statusCode(200);
    }


}
