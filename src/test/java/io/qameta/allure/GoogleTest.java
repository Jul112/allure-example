package io.qameta.allure;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Feature("Auth")
@Microservice("Auth")
@Owner("jul112")
public class GoogleTest {
    @Test
    @AllureId("3191")
    @JiraIssue("HOMEWORK")
    @Story("External Auth")
    @DisplayName("Auth via Google")
    @Tags({@Tag("critical"), @Tag("web")})
    public void testAuth() {
        step("Open main page");
        step("Authorize as user Random User", () -> {
            step("Enter login random_user");
            step("Enter password qwerty123");
            step("Press button Enter");
        });
        step("Verify user data updated from google", () -> {
            step("Expected name is Random User");
            step("Expected userpic from attach");
        });
    }
}
