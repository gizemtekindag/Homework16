package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.WebTablesPage;

import static com.codeborne.selenide.Selenide.$;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AddRecordTest {

    private WebTablesPage webTablesPage = new WebTablesPage();

    @BeforeAll
    public static void setUp() {
        Configuration.browserSize = "1920x1080";
    }

    @Test
    public void testAddAndEditRecord() {
        webTablesPage.openPage();
        webTablesPage.clickAddButton();
        webTablesPage.enterFirstName("Ali");
        webTablesPage.enterLastName("Veli");
        webTablesPage.clickSubmitButton();

        // Edit record
        webTablesPage.clickEditButton();
        webTablesPage.enterFirstName("Ayşe");
        webTablesPage.clickSubmitButton();


        assertTrue($(".rt-tbody .rt-tr-group:last-child .rt-td:nth-child(1)").getText().contains("Jane"));
    }
}
