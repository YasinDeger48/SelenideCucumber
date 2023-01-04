package com.virgosol.qa.stepImpl;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class testStepImp {

    @Given("{string} sitesini aç.")
    public void sitesini_aç(String website) {
        open(website);
    }
    @When("Login syfasında olduğunu doğrula.")
    public void login_syfasında_olduğunu_doğrula() {
        $(By.xpath("//h5[.='Login']")).shouldBe(visible);
    }
    @When("Enter username as {string}")
    public void enter_username_as(String username) {
        $(By.xpath("//input[@name='username']")).setValue(username);
    }
    @When("Enter password as {string}")
    public void enter_password_as(String password) {
        $(By.xpath("//input[@name='password']")).setValue(password);

    }
    @When("Click Login button")
    public void click_login_button() {
        $(By.cssSelector("button[type='submit']")).click();
    }
    @Then("Verify on login page")
    public void verify_on_login_page() {
      //  $("title").shouldHave(attribute("text", "Dashboard"));
        $(By.xpath("//h6[.='Dashboard']")).shouldHave(attribute("textContent","Dashboard"));
    }

    //-----------------------


    @When("Login linkine tıkla.")
    public void login_linkine_tıkla() {
        $(By.xpath("//span[contains(@class,'login')]//a")).click();
    }
    @Then("Giriş sayfasında olduğunu doğrula.")
    public void giriş_sayfasında_olduğunu_doğrula() {
        $("#loginbtn").shouldBe(visible);
    }
    @Then("{string} username gir.")
    public void username_gir(String username) {
        $(By.xpath("//input[@id='username']")).setValue(username);

    }
    @Then("{string} password gir.")
    public void password_gir(String password) {
        $(By.xpath("//input[@id='password']")).setValue(password);
    }
    @Then("Login butonuna tıkla.")
    public void login_butonuna_tıkla() {
        $(By.xpath("//button[@id='loginbtn']")).click();
    }
    @Then("{string} title'ın görüldüğünü doğrula.")
    public void title_ın_görüldüğünü_doğrula(String title) {
        boolean contains = $(By.xpath("(//h2)[1]")).getText().contains(title);
        Assert.assertTrue(contains);
    }

}
