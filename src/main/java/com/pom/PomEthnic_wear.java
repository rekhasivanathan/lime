package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseelime.New_Baselime.Base_class;

public class PomEthnic_wear extends Base_class {
	
	public PomEthnic_wear() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[text()='ethnic wear sets'])[1]")
	private WebElement ethnic_wear_sets ;

	public WebElement getethnic_wear_sets() {
		return ethnic_wear_sets;
	}
	
	
	@FindBy(xpath="(//img[@class='dB h412 w310 mA pR prdI gtm-p an-ll o0'])[1]")
	private WebElement second_product ;

	public WebElement getsecond_product() {
		return second_product;
	}
}

