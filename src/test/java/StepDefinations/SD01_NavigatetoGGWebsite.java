package StepDefinations;

import SeleniumCucumberCode.AT01_NavigateToGGwebsite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class SD01_NavigatetoGGWebsite {

    @Given("open browser and enter url and navigate to GG website")
    public void open_browser_and_enter_url_and_navigate_to_gg_website() throws IOException {
        AT01_NavigateToGGwebsite.NavToGG();
    }
    @Then("get title and assert")
    public void get_title_and_assert() {
        AT01_NavigateToGGwebsite.AssertTitle();
    }
}
