package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="TeamRoleReorder"                                
     , summary=""
     , relativeUrl=""
     , connection="AutoRABIT_DE"
     )             
public class TeamRoleReorder {

	@ChoiceListType(values = { @ChoiceListValue(value = "Account Manager"), @ChoiceListValue(value = "Channel Manager"), @ChoiceListValue(value = "Executive Sponsor"), @ChoiceListValue(value = "Lead Qualifier"), @ChoiceListValue(value = "Pre-Sales Consultant"), @ChoiceListValue(value = "Sales Manager"), @ChoiceListValue(value = "Sales Rep") })
	@FindBy(xpath = "//option[4]")
	public WebElement values;
	@LinkType()
	@FindBy(xpath = "//td[contains(@class, \"zen-phs\")]/div[7]/a")
	public WebElement toBottom;
			
}
