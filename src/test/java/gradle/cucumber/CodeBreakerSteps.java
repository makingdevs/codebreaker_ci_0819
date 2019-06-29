package gradle.cucumber;

import com.makingdevs.codebreaker.services.GameService;
import com.makingdevs.codebreaker.model.CodeBreaker;
import com.makingdevs.codebreaker.services.GameService;
import geb.junit4.GebTest;

import cucumber.api.java.en.*;

public class CodeBreakerSteps extends GebTest {

    private GameService gameService = new GameService();

    @Given("a mistery number {int}")
    public void a_mistery_number(Integer number) {
        CodeBreaker game = gameService.initGameWith(4351);
		assert(game.getSecret() == 4351);
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