package stepDefination;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import java.util.List;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class MyStepDefinitions {

    @Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
    	//code to login to url
    	System.out.println("kjhadsfjkh");
    }

    @When("^User login into application with valid user name and password$")
    public void user_login_into_application_with_valid_user_name_and_password() throws Throwable {
    	//code to provide username and password
    	System.out.println("kjhadsfjkh");
    }
    
    @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
    	System.out.println(strArg1);
    	System.out.println(strArg2);
    }
    
    @When("^User sign up with the following details$")
    public void user_sign_up_with_the_following_details(DataTable data) throws Throwable {
    	List<List<String>> obj=data.raw();
    	System.out.println(obj.get(0).get(0));
    	System.out.println(obj.get(0).get(1));
    	System.out.println(obj.get(0).get(2));
    	System.out.println(obj.get(0).get(3));    	

    }
    
    @When("^User login in to application with (.+) and password (.+)$")
    public void user_login_into_application_with_and_password(String username, String password) throws Throwable {
    	System.out.println(username);
    	System.out.println(password);
    }    

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	//home page validation
    	System.out.println("kjhadsfjkh");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    	//validating the cards
    	System.out.println("ggdfgdfg");
    }
    
    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1) throws Throwable {
    	System.out.println(strArg1);
    }
    
    @Given("^Validate the browser$")
    public void validate_the_browser() throws Throwable {
    	System.out.println("validate_the_browser");
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
    	System.out.println("browser_is_triggered");
    }

    @Then("^check if browser is started$")
    public void check_if_browser_is_started() throws Throwable {
    	System.out.println("check_if_browser_is_started");
    }

}