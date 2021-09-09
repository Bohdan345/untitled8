import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class Yop {

    @Test
    public void tes() {
        open("https://www.google.com/");
        $x("//input[@name='q']").click();
        closeWebDriver();
    }
}
