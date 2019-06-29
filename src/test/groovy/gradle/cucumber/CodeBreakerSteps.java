package gradle.cucumber;

import com.makingdevs.codebreaker.services.GameService;
import com.makingdevs.codebreaker.model.CodeBreaker;
import com.makingdevs.codebreaker.services.GameService;
import geb.junit4.GebTest;

import cucumber.api.java.en.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


//@RunWith(SpringRunner.class)
//@SpringBootTest
public class CodeBreakerSteps extends GebTest {

    private GameService gameService = new GameService();

    @Given("a mistery number {int}")
    public void a_mistery_number(Integer number) {
        browser.go("/");
    }

    @When("we start the game")
    public void we_start_the_game() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("the game must be initialized")
    public void the_game_must_be_initialized() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}