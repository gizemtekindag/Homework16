package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebTablesPage {

    private SelenideElement addButton = $("#addNewRecordButton");
    private SelenideElement firstNameInput = $("#firstName");
    private SelenideElement lastNameInput = $("#lastName");
    private SelenideElement submitButton = $("#submit");
    private SelenideElement editButton = $(".rt-tbody .rt-tr-group:last-child .action-buttons span:first-child"); // Son eklenen kaydı düzenlemek için


    public void openPage() {
        open("https://demoqa.com/webtables");
    }

    public void clickAddButton() {
        addButton.click();
    }

    public void enterFirstName(String firstName) {
        firstNameInput.setValue(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameInput.setValue(lastName);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public void clickEditButton() {
        editButton.click();
    }
}
