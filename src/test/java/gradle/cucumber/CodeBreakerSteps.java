package gradle.cucumber;

import com.makingdevs.codebreaker.model.CodeBreaker;
import com.makingdevs.codebreaker.services.GameService;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.GebTest;
import cucumber.api.java.en.*; // paquete en ingles tambien existe en spañol

// @RunWith(SpringRunner.class)
// @SpringBootTest
public class CodeBreakerSteps extends GebTest {

    private GameService service  = new GameService();

    @Given("a mistery number {int}")
    public void a_mistery_number(Integer int1) {
        browser.go("/");
    }

    @When("we start gamethen")
    public void we_start_gamethen() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("game must be initialezed")
    public void game_must_be_initialezed() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}