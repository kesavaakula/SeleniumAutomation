package StepdefinationsFiles;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMsteps {
    WebDriver webdriver;
    @Given("I launch chrome broswer")
    public void i_launch_chrome_broswer() {
        try {
             webdriver = new ChromeDriver();
        }
        catch (Exception e) {
            e.printStackTrace();

            throw new io.cucumber.java.PendingException();
        }
    }
    @When("I open Orange hrm homepage")
    public void i_open_orange_hrm_homepage() {
        // Write code here that turns the phrase above into concrete actions
          webdriver.get("https://opensource-demo.orangehrmlive.com/");

    }
    @Then("I verify  that the logo  present on page")
    public void i_verify_that_the_logo_present_on_page() {
        // Write code here that turns the phrase above into concrete actions
        boolean status=  webdriver.findElement(By.xpath("//[")).isDisplayed();
        throw new io.cucumber.java.PendingException();
    }
    @Then("close browser")
    public void close_browser() {
        // Write code here that turns the phrase above into concrete actions
        webdriver.close();
        throw new io.cucumber.java.PendingException();
    }

}
