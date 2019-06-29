package gradle.cucumber;

import com.makingdevs.codebreaker.model.CodeBreaker;
import com.makingdevs.codebreaker.services.GameService;

import cucumber.api.java.en.*; // paquete en ingles tambien existe en spañol

public class CodeBreakerSteps {

    private GameService service  = new GameService();

    @Given("a mistery number {int}")
    public void a_mistery_number(Integer int1) {
        CodeBreaker game = service.initGameWith(int1);
        assert(game.getSecret() == 4351);
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