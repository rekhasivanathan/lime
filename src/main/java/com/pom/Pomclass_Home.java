
package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseelime.New_Baselime.Base_class;

public class Pomclass_Home extends Base_class{
	
	
	public Pomclass_Home()  {
		
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//span[text()='SHOP MEN']")
	private WebElement shopmen;

	public WebElement getShopmen() {
		return shopmen;
	}
	
	@FindBy(xpath="//*[@id=\"men_category\"]/div")
	private WebElement men;

	public WebElement getMen() {
		return men;
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
	
//	@FindBy(xpath="(//a[text()='kurtas'])[1]")
//	private WebElement kurtas ;
//
//	public WebElement getkurtas() {
//		return kurtas;
//	}
//	
//	 
//	@FindBy(xpath="(//img[@class='dB h412 w310 mA pR prdI gtm-p an-ll o0'])[1]")
//	private WebElement product ;
//
//	public WebElement getproduct() {
//		return product;
//	}
//	 
//
	 
	
	//@FindBy(xpath="//a[text()='BUY NOW']")
	//private WebElement buytheproduct ;

	//public WebElement getbuytheproduct() {
		//return buytheproduct;
	//}
	
//	@FindBy(xpath="(//a[text()='ethnic wear sets'])[1]")
//	private WebElement ethnic_wear_sets ;
//
//	public WebElement getethnic_wear_sets() {
//		return ethnic_wear_sets;
//	}
//	
//	
//	@FindBy(xpath="(//img[@class='dB h412 w310 mA pR prdI gtm-p an-ll o0'])[1]")
//	private WebElement second_product ;
//
//	public WebElement getsecond_product() {
//		return second_product;
//	}
	
//	@FindBy(xpath="(//a[text()='Nehru Jackets'])[1]")
//	private WebElement nehru_jackets ;
//
//	public WebElement getnehru_jackets() {
//		return nehru_jackets;
//	}
//	
//	@FindBy(xpath="(//img[@class='dB h412 w310 mA pR prdI gtm-p an-ll o0'])[1]")
//	private WebElement third_product ;
//
//	public WebElement getthird_product() {
//		return third_product;
//	}

	 
	
	

}
