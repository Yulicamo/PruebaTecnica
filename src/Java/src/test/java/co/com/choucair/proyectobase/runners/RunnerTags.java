package co.com.choucair.proyectobase.runners;

import cucumber.api.SnippetType;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features",
        tags="@Regresion",
        glue="co.com.proyectobase.stepdefinitions",
        snippets=SnippetType.CAMELCASE
)
public class RunnerTags {

}

