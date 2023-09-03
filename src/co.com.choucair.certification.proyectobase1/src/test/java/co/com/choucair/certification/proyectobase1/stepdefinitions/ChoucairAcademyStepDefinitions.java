package co.com.choucair.certification.proyectobase1.stepdefinitions;

import co.com.choucair.certification.proyectobase1.questions.Answer;
import co.com.choucair.certification.proyectobase1.tasks.Login;
import co.com.choucair.certification.proyectobase1.tasks.OpenUp;
import co.com.choucair.certification.proyectobase1.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import javax.swing.*;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Miguel wants to learn automation at the academy Choucair$")
    public void thanMiguelWantsToLearnAutomationAtTheAcademyChoucair() {
         OnStage.theActorCalled( "Miguel").wasAbleTo(OpenUp.thePage(),
                 (Login.onThePage())
         );
    }

    @When("^the search for the course (.*)on the Choucair academy platform$")
    public void theSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(String course) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));
    }

    @Then("^he finds the course called resources (.*)$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia(String question) {
    OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}
