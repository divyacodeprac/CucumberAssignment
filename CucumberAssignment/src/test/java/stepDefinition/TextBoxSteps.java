package stepDefinition;

import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.util.List;

import org.testng.Assert;

import com.pages.TextBoxPage;
import com.utilities.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TextBoxSteps {

	TextBoxPage textBoxPage = new TextBoxPage(DriverFactory.getDriver());

@Given("Page is launched {string}")
public void page_is_launched(String expectedTitle) {
    // Write code here that turns the phrase above into concrete actions
	String actualPageTitle =textBoxPage.getPageTitle();
	System.out.println("Page Title"+actualPageTitle);
	Assert.assertEquals(actualPageTitle, expectedTitle);
}

@Then("Labels on right side of textboxes {int}")
public void labels_on_right_side_of_textboxes(int labels) {
    // Write code here that turns the phrase above into concrete actions
	Assert.assertEquals(textBoxPage.getLabels(), labels);
}

@Then("TextBoxes has values")
public void text_boxes_has_values(DataTable dataTable) {
    // Write code here that turns the phrase above into concrete actions
	List<String> values = dataTable.asList(String.class);
	for (int i = 0; i < values.size(); i++) {
		textBoxPage.textBoxes().get(i).sendKeys(values.get(i));
	}
}

@Then("Total has sum of values in textbox {int}" )
public void total_has_sum_of_values_in_textbox(int amount) throws ParseException {
    // Write code here that turns the phrase above into concrete actions
	 Assert.assertEquals(textBoxPage.verifyCurrencyFormat().longValue(), amount);
}

}
