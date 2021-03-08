package org.jdiai;

import com.epam.jdi.light.elements.common.UIElement;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;

import static com.epam.jdi.light.elements.init.UIFactory.$;

@Url("https://jdi-testing.github.io/jdi-light/index.html")
@Title("$PAGE_TITLE")
public class CustomHomePage extends WebPage {
    public UIElement usericonImg = $("#user-icon");
    public UIElement nameInput = $("#name");
    public UIElement passwordInput = $("#password");
    public UIElement elementSpan = $("['Enter']");
    public UIElement jditextP = $("[name=jdi-text]");
}
