package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.ElementsPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ButtonClickTest {

    private ElementsPage elementsPage = new ElementsPage();

    @BeforeAll
    public static void setUp() {
        Configuration.startMaximized = true;
    }

    @Test
    public void testClickMeButton() {
        elementsPage.openPage();
        elementsPage.clickButtonsOption();
        elementsPage.clickClickMeButton();

        // Assertion
        assertEquals("You have done a dynamic click", elementsPage.getMessage());
    }
}
