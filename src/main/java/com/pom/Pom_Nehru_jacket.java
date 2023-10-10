package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseelime.New_Baselime.Base_class;

public class Pom_Nehru_jacket extends Base_class{
	public Pom_Nehru_jacket() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[text()='Nehru Jackets'])[1]")
	private WebElement nehru_jackets ;

	public WebElement getnehru_jackets() {
		return nehru_jackets;
	}
	
	@FindBy(xpath="(//img[@class='dB h412 w310 mA pR prdI gtm-p an-ll o0'])[1]")
	private WebElement third_product ;

	public WebElement getthird_product() {
		return third_product;
	}
 
}

