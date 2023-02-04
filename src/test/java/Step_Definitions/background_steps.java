package Step_Definitions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class background_steps {
    @Given("I have navigated to the page")
    public void i_have_navigated_to_the_page() {
        System.out.println("Navigating to the page");
    }
    @When("I provide valid credentials after clicking on log in tab")
    public void i_provide_valid_credentials_after_clicking_on_log_in_tab() {
        System.out.println("Providing valid credentials");
    }
    @Then("I should be logged in")
    public void i_should_be_logged_in() {
        System.out.println("Log in successful!!!");
    }

    @When("I click on the {string} product")
    public void i_click_on_the_product(String string) {
        System.out.println("Clicking on " + string);
    }
    @Then("I should be redirected to the product details page")
    public void i_should_be_redirected_to_the_product_details_page() {
        System.out.println("Redirecting...");
    }
    @Then("I click on the {string} button")
    public void i_click_on_the_button(String string) {
        System.out.println("Clicking on the " + string);
    }
    @Then("I should see a {string} alert")
    public void an_alert_should_be_prompted(String string) {
        System.out.println(string + " Alert is visible");
    }

    @When("I have added a product")
    public void i_have_added_a_product() {
        System.out.println("Product added");
    }
    @Then("It should appear on the cart page")
    public void it_should_appear_on_the_cart_page() {
        System.out.println("Product is on the cart page");
    }

    @When("I complete the place order form")
    public void i_complete_the_place_order_form() {
        System.out.println("Completing order...!!!");
    }

    @Before
    public void setup() {
        System.out.println("Before Class");
    }

    @After
    public void teardown() {
        System.out.println(("After Class"));
    }

}
