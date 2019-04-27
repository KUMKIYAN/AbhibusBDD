package StepDefinition;

import PageObject.BookATicketPage;
import PageObject.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static StepDefinition.Hooks.driver;

public class abhiSteps {

    HomePage homePage;
    BookATicketPage bookATicketPage;

    @Given("^I visit Abhibus website$")
    public void iAbhibusWebsite(){
        driver.get("https://www.abhibus.com/");
        homePage = new HomePage(driver);
    }

    @When("^I enter soure as \"([^\"]*)\" and Destination as \"([^\"]*)\"$")
    public void iEnterSoureAsSomethingAndDestinationAsSomething(String source, String destination) {
        homePage.setTravelingFrom(source);
        homePage.setTravelingTo(destination);

    }

    @When("^I select a random traveller and seat from departure$")
    public void iSelectARandomTravellerAndSeatFromDeparture() {
        bookATicketPage.selectATraveller();
        bookATicketPage.selectASeat();
    }

    @Then("^I verify abhibus banner logo tooltip is \"([^\"]*)\"$")
    public void iVerifyAbhibusBannerLogoTooltipIsSomething(String exptectedToolTip) {
        Assert.assertEquals("Banner tooltip is not correct", exptectedToolTip, homePage.getMainBannerToolTip());
    }

    @Then("^I should be ticket booking page$")
    public void iShouldBeTicketBookingPage() throws Throwable {
        bookATicketPage = new BookATicketPage(driver);
    }

    @And("^I enter from date \"([^\"]*)\" and retrun date as \"([^\"]*)\"$")
    public void iEnterFromDateSomethingAndRetrunDateAsSomething(String journeyDate, String returnDate){
        homePage.setTravelingDates(journeyDate, returnDate);
    }

    @And("^I click search button$")
    public void iClickSearchButton(){
        homePage.search();
    }

    @And("^I select a random traveller and seat during return$")
    public void iSelectARandomTravellerAndSeatDuringReturn(){
        bookATicketPage.selectDepartureBoardingPoint();
        bookATicketPage.bookTheSeat();
    }

    @And("^click on proceed to payment button$")
    public void clickOnProceedToPaymentButton(){
        bookATicketPage.selectContinuePayment();
    }
}