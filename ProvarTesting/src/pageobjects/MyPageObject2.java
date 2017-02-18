package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="My Page Object 2"                                
               , summary="sasd"
               , connection="AutoRABIT_DE"
               , object="Account", recordType = "<default>"
     )             
public class MyPageObject2 {

	@TextType()
	@FindByLabel(label = "Quick Find")
	public WebElement quickFind;
	@LinkType()
	@FindBy(linkText = "Account Teams")
	public WebElement accountTeams;
	@LinkType()
	@FindBy(linkText = "Team Roles")
	public WebElement teamRoles;
	@ButtonType()
	@FindByLabel(label = "Reorder")
	public WebElement reorder;
	@ChoiceListType(values = { @ChoiceListValue(value = "Account Manager"), @ChoiceListValue(value = "Channel Manager"),
			@ChoiceListValue(value = "Executive Sponsor"), @ChoiceListValue(value = "Lead Qualifier"),
			@ChoiceListValue(value = "Pre-Sales Consultant"), @ChoiceListValue(value = "Sales Manager"),
			@ChoiceListValue(value = "Sales Rep") })
	@FindBy(xpath = "//option[5]")
	public WebElement values;
	@ChoiceListType(values = { @ChoiceListValue(value = "Account Manager"), @ChoiceListValue(value = "Channel Manager"),
			@ChoiceListValue(value = "Executive Sponsor"), @ChoiceListValue(value = "Lead Qualifier"),
			@ChoiceListValue(value = "Pre-Sales Consultant"), @ChoiceListValue(value = "Sales Manager"),
			@ChoiceListValue(value = "Sales Rep") })
	@FindBy(xpath = "//option[5]")
	public WebElement values1;
	@ChoiceListType(values = { @ChoiceListValue(value = "Account Manager"), @ChoiceListValue(value = "Channel Manager"),
			@ChoiceListValue(value = "Executive Sponsor"), @ChoiceListValue(value = "Lead Qualifier"),
			@ChoiceListValue(value = "Pre-Sales Consultant"), @ChoiceListValue(value = "Sales Manager"),
			@ChoiceListValue(value = "Sales Rep") })
	@FindBy(xpath = "//option[5]")
	public WebElement values2;
	@ChoiceListType(values = { @ChoiceListValue(value = "Account Manager"), @ChoiceListValue(value = "Channel Manager"),
			@ChoiceListValue(value = "Executive Sponsor"), @ChoiceListValue(value = "Lead Qualifier"),
			@ChoiceListValue(value = "Pre-Sales Consultant"), @ChoiceListValue(value = "Sales Manager"),
			@ChoiceListValue(value = "Sales Rep") })
	@FindBy(xpath = "//option[5]")
	public WebElement values3;
	@ChoiceListType(values = { @ChoiceListValue(value = "Account Manager"), @ChoiceListValue(value = "Channel Manager"),
			@ChoiceListValue(value = "Executive Sponsor"), @ChoiceListValue(value = "Lead Qualifier"),
			@ChoiceListValue(value = "Pre-Sales Consultant"), @ChoiceListValue(value = "Sales Manager"),
			@ChoiceListValue(value = "Sales Rep") })
	@FindBy(xpath = "//option[7]")
	public WebElement values4;
	@ChoiceListType(values = { @ChoiceListValue(value = "Account Manager"), @ChoiceListValue(value = "Channel Manager"),
			@ChoiceListValue(value = "Executive Sponsor"), @ChoiceListValue(value = "Lead Qualifier"),
			@ChoiceListValue(value = "Pre-Sales Consultant"), @ChoiceListValue(value = "Sales Manager"),
			@ChoiceListValue(value = "Sales Rep") })
	@FindBy(xpath = "//option[7]")
	public WebElement values5;
	@LinkType()
	@FindBy(xpath = "//td[contains(@class, \"zen-phs\")]/div[2]/a")
	public WebElement Top;
	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save;
	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save1;
	@ChoiceListType(values = { @ChoiceListValue(value = "Account Manager"), @ChoiceListValue(value = "Channel Manager"),
			@ChoiceListValue(value = "Executive Sponsor"), @ChoiceListValue(value = "Lead Qualifier"),
			@ChoiceListValue(value = "Pre-Sales Consultant"), @ChoiceListValue(value = "Sales Manager"),
			@ChoiceListValue(value = "Sales Rep") })
	@FindBy(xpath = "//option[7]")
	public WebElement values6;
	@ChoiceListType(values = { @ChoiceListValue(value = "Account Manager"), @ChoiceListValue(value = "Channel Manager"),
			@ChoiceListValue(value = "Executive Sponsor"), @ChoiceListValue(value = "Lead Qualifier"),
			@ChoiceListValue(value = "Pre-Sales Consultant"), @ChoiceListValue(value = "Sales Manager"),
			@ChoiceListValue(value = "Sales Rep") })
	@FindByLabel(label = "Values")
	public WebElement values7;
	@LinkType()
	@FindBy(linkText = "Contacts")
	public WebElement contacts;
	
}
