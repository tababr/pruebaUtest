package pruebaUtest.stepdefinitions;

import pruebaUtest.model.Udatos;
import pruebaUtest.questions.R;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import pruebaUtest.tasks.*;

import java.util.List;

public class UtestStepDefinition {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());

    }
    @Given("^Se desea registrar a un usuario en la pagina$")
    public void seDeseaRegistrarAUnUsuarioEnLaPagina() {
        OnStage.theActorCalled("Brayan").wasAbleTo(Abrir.laPagina());
    }

    @When("^Se diligenciara un formulario con los datos del usuario solicitados por el sistema$")
    public void seDiligenciaraUnFormularioConLosDatosDelUsuarioSolicitadosPorElSistema(List<Udatos> datos) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Llenar.lapagina(datos), LlenarUbicacion.lapagina(datos),
                LlenarDis.laPagina(datos), Llenarf.laPagina(datos)
        );
    }

    @Then("^posteriormente se debe dar click en el boton de registro para finalizar el mismo$")
    public void posteriormenteSeDebeDarClickEnElBotonDeRegistroParaFinalizarElMismo(List<Udatos> datos) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(R.aLos(datos)));

    }
}
