package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import util.BaseUtil;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import util.BaseUtil;
public class loginStepdefinition {
    //public WebDriver driver;
    BaseUtil baseUtil;
    public loginStepdefinition(BaseUtil baseUtil) {
     this.baseUtil=baseUtil;
    }

    @When("^i click on login$")
    public void i_click_on_login(){

        System.out.println("Accesed the application");


        baseUtil.driver.findElement(By.xpath("//span[contains (text(),'Join / Sign In')]")).click();

    }

    @Then("^home page is displayed$")
    public void home_page_is_displayed(){
        baseUtil.driver.close();


    }

    @And("^i entered email as '(.+)' and password as'(.+)'$")
    public void i_entered_email_as_and_password_as(String email, String password) {
        baseUtil.driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);         //driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
        baseUtil.driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);

        System.out.println(baseUtil.iamFromBaseUtilClass);


    }

    @And("^i clicked on sign in$")
    public void i_clicked_on_sign_in() {
        baseUtil.driver.findElement(By.xpath("//input[@id='signin']")).click();


    }

}
