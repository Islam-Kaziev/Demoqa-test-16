import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Homework {

    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";

    }
    @Test
    void StudentRegistrationForm() {
       open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Islam");
        $("#lastName").setValue("Kaziev");
        $("#userEmail").setValue("Islam@Vasiya.com");

    }


}
