package guru.qa;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static org.openqa.selenium.remote.tracing.EventAttribute.setValue;

public class CssXpathExamples {

    void cssXpathExamples(){
        $("[data-testid=email]").setValue("1");
        $("input[data-testid=email]").setValue("1");
        $(by("data-testid", "email")).setValue("1");

        $x("//*[@data-testid='email']").setValue("1");
        $x("//input[@data-testid='email']").setValue("1");


        $("[id=email]").setValue("1");
        $("[#email]").setValue("1");
        $("[input#email]").setValue("1");

        $("[name=email]").setValue("1");
        $(byName("email")).setValue("1");

        $("[class=inputtext][class=login_form_input_box]").setValue("1");
        $(".inputtext.login_form_input_box").setValue("1");
        $(".login_form_input_box").setValue("1");

        $x("//input[@class='inputtext'][@class='login_form_input_box']").setValue("1");

        $(".inputtext .login_form_input_box").setValue("1");
        $("div.inputtext .login_form_input_box").setValue("1");
        $("div.inputtext").$("input.login_form_input_box").setValue("1");

        $x("//div[text()='Hello, qa.guru!']").click();
        $(byText("Hello, qa.guru!")).click();
        $(withText("llo, qa.g")).click();
    }
}
