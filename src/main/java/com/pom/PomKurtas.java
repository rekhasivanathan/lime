package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseelime.New_Baselime.Base_class;

public class PomKurtas extends Base_class {
	
	public PomKurtas() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[text()='kurtas'])[1]")    
	private WebElement kurtas ;

	public WebElement getkurtas() {
		
		return kurtas;
	}
	
	 
	@FindBy(xpath="(//img[@class='dB h412 w310 mA pR prdI gtm-p an-ll o0'])[1]")
	private WebElement product ;

	public WebElement getproduct() {
	
		return product;
	}
	 

	@FindBy(xpath="//span[text()=' M ']")
	private WebElement size ;

	public WebElement getsize() {
		
		return size;
	}
	
	@FindBy(xpath="//div[@class='h48 bs avail  bgL br4 p12 cF taC fwB gtm-atc bxs hbxs']")
	private WebElement addtocart ;

	public WebElement getaddtocart() {
		return addtocart;
	}
	
}
