package com.neoris.tasks;

import com.neoris.ui.BuscarUir;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class Buscarl implements Task {


    private String nombreproducto;


    public Buscarl(String nombreproducto)
    {
        this.nombreproducto = nombreproducto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.keyValues(nombreproducto).into(BuscarUir.BUSCADOR));


    }

    public static Buscarl producto(String nombreproducto)
    {
        return Tasks.instrumented(Buscarl.class,nombreproducto);
    }

}
