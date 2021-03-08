package org.jdiai;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.*;
import com.epam.jdi.light.elements.common.*;
import com.epam.jdi.light.elements.complex.*;
import com.epam.jdi.light.elements.composite.*;

@Url("https://jdi-testing.github.io/jdi-light/index.html")
@Title("$PAGE_TITLE")
public class JdiHomePage extends WebPage {
    @UI("#user-icon")
    public UIElement usericonImg;
    @UI("#name")
    public UIElement nameInput;
    @UI("#password")
    public UIElement passwordInput;
    @ByText("Enter")
    public UIElement elementSpan;
    @UI("[name='jdi-text']")
    public UIElement jditextP;
}
