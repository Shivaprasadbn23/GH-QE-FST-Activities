package steps;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseClass {

    @Given("the user is on the login page")
    public void openPage() {
        driver.get("https://training-support.net/webelements/login-form");
        Assertions.assertEquals("Selenium: Login Form", driver.getTitle());
    }

    // ✅ STATIC step (already correct)
    @When("the user enters username and password")
    public void enterCredentials() {
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
    }

    // ✅ ADD THIS (dynamic step)
    @When("the user enters {string} and {string}")
    public void the_user_enters_and(String username, String password) {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @And("clicks the submit button")
    public void clickSubmit() {
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
    }

    // ✅ STATIC validation
    @Then("get the confirmation message and verify it")
    public void confirmMessage() {
        wait.until(ExpectedConditions.textToBePresentInElementLocated(
            By.cssSelector("h2.mt-5"), "Welcome"));
        String message = driver.findElement(By.cssSelector("h2.mt-5")).getText();
        Assertions.assertEquals("Welcome Back, Admin!", message);
    }

    // ✅ ADD THIS (dynamic validation)
    @Then("get the confirmation text and verify message as {string}")
    public void get_the_confirmation_text_and_verify_message_as(String expectedMessage) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h2.mt-5")));
        String message = driver.findElement(By.cssSelector("h2.mt-5")).getText();
        Assertions.assertEquals(expectedMessage, message);
    }
}