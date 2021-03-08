package org.jdiai.example;

import org.jdiai.SeleniumHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SeleniumLoginTests {
    WebDriver driver;
    SeleniumHomePage homePage = new SeleniumHomePage(driver());
    String welcomeText = "LOREM IPSUM DOLOR SIT AMET, CONSECTETUR ADIPISICING ELIT, SED DO EIUSMOD TEMPOR INCIDIDUNT UT LABORE ET DOLORE MAGNA ALIQUA. UT ENIM AD MINIM VENIAM, QUIS NOSTRUD EXERCITATION ULLAMCO LABORIS NISI UT ALIQUIP EX EA COMMODO CONSEQUAT DUIS AUTE IRURE DOLOR IN REPREHENDERIT IN VOLUPTATE VELIT ESSE CILLUM DOLORE EU FUGIAT NULLA PARIATUR.";
    @Test
    public void loginTest() {
        driver().get("https://jdi-testing.github.io/jdi-light/index.html");
        homePage.usericonImg.click();
        homePage.nameInput.sendKeys("Roman");
        homePage.passwordInput.sendKeys("Jdi1234");
        homePage.elementSpan.click();
        assertEquals(homePage.jditextP.getText(), welcomeText);
    }

    public WebDriver driver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }
}
