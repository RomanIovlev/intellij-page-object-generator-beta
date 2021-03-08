package org.jdiai.example;

import org.jdiai.JdiHomePage;
import org.testng.annotations.Test;

public class JdiLoginTests {
    JdiHomePage homePage = new JdiHomePage();
    String welcomeText = "LOREM IPSUM DOLOR SIT AMET, CONSECTETUR ADIPISICING ELIT, SED DO EIUSMOD TEMPOR INCIDIDUNT UT LABORE ET DOLORE MAGNA ALIQUA. UT ENIM AD MINIM VENIAM, QUIS NOSTRUD EXERCITATION ULLAMCO LABORIS NISI UT ALIQUIP EX EA COMMODO CONSEQUAT DUIS AUTE IRURE DOLOR IN REPREHENDERIT IN VOLUPTATE VELIT ESSE CILLUM DOLORE EU FUGIAT NULLA PARIATUR.";
    @Test
    public void loginTest() {
        homePage.open();
        homePage.usericonImg.click();
        homePage.nameInput.input("Roman");
        homePage.passwordInput.input("Jdi1234");
        homePage.elementSpan.click();
        homePage.jditextP.has().text(welcomeText);
    }
}
