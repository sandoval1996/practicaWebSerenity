package com.neoris.ui;

import net.serenitybdd.screenplay.targets.Target;

import java.time.Duration;

public class BuscarUir {

    public static final Target BUSCADOR = Target.the("Buscador").locatedBy("//input[@id='twotabsearchtextbox']").waitingForNoMoreThan(Duration.ofSeconds(15));

    public static final Target BOTON_BUSCADOR = Target.the("Buscador").locatedBy("//input[@id='twotabsearchtextbox']").waitingForNoMoreThan(Duration.ofSeconds(15));



}
