package steps;

import elementsFactory.mainNotepadElements;
import elementsFactory.printElements;
import driverFactory.driverFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.windows.WindowsDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;


public class printSteps {
    AndroidDriver driver;
    driverFactory browsers;

    private mainNotepadElements main = new mainNotepadElements(driverFactory.getdriver());

    private printElements printPage = new printElements(driverFactory.getdriver());
    

    @Given("I am on trello page")
    public void iAmOnTrelloPage() {
        driverFactory.getdriver().get("https://trello.com/login");
    }

    @When("user sees boards")
    public void userSeesBoards() {
        
    }

    @Then("user clicks board")
    public void userClicksBoard() {
    }


//    @When("user clicks on print")
//    public void user_clicks_on_print() throws InterruptedException {
//        main.print.click();
//    }
//    @And("user clicks on preferences")
//    public void user_clicks_on_preferences() throws InterruptedException {
//        printPage.pref.click();
//    }
//    @Then("default print orientation is {string}")
//    public void default_print_orientation_is(String wordCompare) throws InterruptedException {
//        printPage.portrait.wordCompare(wordCompare);
//    }
//
//    @Then("print tab opens")
//    public void print_tab_opens() {
//        printPage.general.isDisplayed();
//    }
}
