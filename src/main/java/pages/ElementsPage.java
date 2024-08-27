package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ElementsPage {

    private SelenideElement buttonsOption = $("#item-4"); // "Buttons" seçeneği
    private SelenideElement clickMeButton = $("#button"); // "Click Me" düğmesi
    private SelenideElement message = $("#dynamicClickMessage"); // Sonuç mesajı


    public void openPage() {
        open("https://demoqa.com/elements");
    }

    public void clickButtonsOption() {
        buttonsOption.click();
    }

    public void clickClickMeButton() {
        clickMeButton.click();
    }

    public String getMessage() {
        return message.getText();
    }
}
