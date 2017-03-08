package pagecontrols;

import java.util.logging.Logger;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

import com.provar.core.testapi.annotations.*;

@PageControl( title="My Page Control"                                
     , summary=""
     , remarks=""
     )             
public class MyPageControl {

	private WebDriver driver;
	private WebElement element;
	
	@TestLogger
	private Logger logger;
	
	public MyPageControl(WebDriver driver, WebElement element) {
		this.driver = driver;
		this.element = element;
	}
	
	@PageOperation
	public String testMethodForControl(String param1) {
		
		return "";
	}
}
