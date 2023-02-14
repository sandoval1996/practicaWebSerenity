package com.neoris.stepdefinitions;

import com.neoris.tasks.Buscar;
import com.neoris.tasks.Buscarl;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class BuscarStepdefinitions {



    @Dado("Navego a la pagina de amazon")
    public void navegoALaPaginaDeAmazon() {

    }

    @Cuando("busco un {string}")
    public void buscoUn(String nombreproducto) {
        OnStage.theActorInTheSpotlight().attemptsTo(Buscar.producto(nombreproducto));
    }
    @Entonces("valido que se realice la busqueda")
    public void validoQueSeRealiceLaBusqueda() {

    }



}
