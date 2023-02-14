package com.neoris.stepdefinitions;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class configuracion {

    @Managed
    WebDriver elNavegador;

    @Before
    public void init()
    {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActor("Comprador");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(elNavegador));
        OnStage.theActorInTheSpotlight().attemptsTo(Open.url("https://www.amazon.com"));
    }




}
