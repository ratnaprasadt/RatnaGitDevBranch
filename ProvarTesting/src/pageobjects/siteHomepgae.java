package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="siteHomepgae"                                
     , summary=""
     , relativeUrl=""
     , connection="UI"
     )             
public class siteHomepgae {

	@LinkType()
	@FindBy(xpath = "//li[contains(@class, \"menuLeft\")]//a")
	public WebElement sport;
			
}
