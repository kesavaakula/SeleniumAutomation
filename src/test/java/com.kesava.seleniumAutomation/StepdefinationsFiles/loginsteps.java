package StepdefinationsFiles;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.dataTable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginsteps {



    @Given("I launch chrome browser")
    public void i_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\kesav\\Interview\\Selenium SetUp Docs\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver webdriver = new ChromeDriver();
        //  webdriver.get("https://tutorialsninja.com/demo");
        webdriver.get("http://omayo.blogspot.com");
        webdriver.manage().window().maximize();
        WebElement webelement= webdriver.findElement(By.id("alert1"));
        webelement.click();
    }


    @When("User opens Urls {string}")
    public void user_opens_urls(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User enters Email as {string} and password as {string}")
    public void user_enters_email_as_and_password_as(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Click on Login")
    public void click_on_login() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User click on logout link")
    public void user_click_on_logout_link() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Page Title should be {string}")
    public void page_title_should_be(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
