package org.jdiai;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// https://jdi-testing.github.io/jdi-light/index.html
public class SeleniumHomePage {

    @FindBy(id = "user-icon")
    public WebElement usericonImg;

    @FindBy(id = "name")
    public WebElement nameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//*[text() = 'Enter']")
    public WebElement elementSpan;

    @FindBy(name = "jdi-text")
    public WebElement jditextP;

    public SeleniumHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
