package wallet.homework;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import wallet.Wallet;

public class WalletSteps1 {

    private Wallet wallet;
    private String message;

    @Given("there is ${int} in my wallet")
    public void there_is_amount_in_my_wallet(int amount) {
        wallet = new Wallet(amount);
    }

    @When("I withdraw ${int}")
    public void i_withdraw_amount(int amount) {
        message = wallet.withdraw(amount);
    }

    @Then("nothing should be dispensed")
    public void nothing_should_be_dispensed() {
        Assertions.assertEquals(0, wallet.getDispensedAmount());
    }

    @Then("I should be told that I don't have enough money in my wallet")
    public void i_should_be_told_that_i_dont_have_enough_money_in_my_wallet() {
        Assertions.assertEquals("Not enough money in the wallet.", message);
    }

    @When("I check the balance of my wallet")
    public void i_check_the_balance_of_my_wallet() {
        // No action needed, just access the wallet balance
    }

    @Then("I should see that the balance is ${int}")
    public void i_should_see_that_the_balance_is(int expectedBalance) {
        Assertions.assertEquals(expectedBalance, wallet.getBalance());
    }
}