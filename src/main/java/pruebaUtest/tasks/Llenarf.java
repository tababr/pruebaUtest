package pruebaUtest.tasks;

import pruebaUtest.model.Udatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import static pruebaUtest.userinterface.Pfinal.*;

public class Llenarf implements Task {

    private List<Udatos> datos;

    public Llenarf(List<Udatos> datos) {
        this.datos = datos;
    }

    public static Llenarf laPagina(List<Udatos>datos) {
        return Tasks.instrumented(Llenarf.class,datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datos.get(0).getStrClave()).into(CL),
                Enter.theValue(datos.get(0).getStrClave()).into(CP),
                Click.on(CHEC1),
                Click.on(CHEC2),
                Click.on(CHEC3),
                Click.on(BOTON)
                );
    }
}
