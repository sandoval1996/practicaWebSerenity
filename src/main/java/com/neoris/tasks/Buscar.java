package com.neoris.tasks;

import com.neoris.ui.BuscarUir;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

public class Buscar {

public  static Performable producto(String nombreproducto)
{
    return Task.where(actor ->

            actor.attemptsTo(Enter.theValue(nombreproducto).into(BuscarUir.BUSCADOR)));
}







}
