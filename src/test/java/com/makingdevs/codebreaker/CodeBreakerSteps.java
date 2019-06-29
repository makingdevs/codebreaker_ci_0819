package gradle.cucumber;

import com.makingdevs.codebreaker.services.GameService;
import com.makingdevs.codebreaker.model.CodeBreaker;

import cucumber.api.java.en.*;
import geb.junit4.GebTest;

public class CodeBreakerSteps extends GebTest {

  private GameService gameService = new GameService();
  
    @Given("a mistery number {int}")
    public void a_mistery_number(Integer number) {
      CodeBreaker game = gameService.initGameWith(4351);
      assert (game.getSecret()==4351);
    }

    @When("we strat the game")
    public void we_strat_the_game() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("the game must be initialize")
    public void the_game_must_be_initialize() {
        // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
    }
    
}