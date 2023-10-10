package com.Step_Definition;

import com.baseelime.New_Baselime.Base_class;
import com.pom.PomEthnic_wear;
import com.pom.PomKurtas;
import com.pom.Pom_Nehru_jacket;
import com.pom.Pomclass_Home;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.cucumber.java.en.When;
import page_object_manager.PAGE_OBJECT_MANAGER;

public class StepDefinition_class extends Base_class {

//	Pomclass_Home ph = new Pomclass_Home();
//	
//	PomKurtas pk=new PomKurtas();
//	PomEthnic_wear ew=new PomEthnic_wear();
//	Pom_Nehru_jacket nj=new Pom_Nehru_jacket();
	 
	PAGE_OBJECT_MANAGER pom1 = new PAGE_OBJECT_MANAGER();
	
	
	//kutas
	@When("user able to launch the url {string}")
	public void user_able_to_launch_the_url(String url) {
	    launchUrl(url);
	}
	
	
     
	@And("user able to click on shop men")
	public void user_able_to_click_on_shop_men() throws InterruptedException {
		//Thread.sleep(6000);
		//clickOnElement(ph.getShopmen());
		Thread.sleep(6000);
		clickOnElement(pom1.getPh().getShopmen());
	}
	
	@When("user able to mousehover men")
	public void user_able_to_mousehover_men() {
	//	explicitWait(ph.getMen());
	//	mouseHover(ph.getMen());
		
		explicitWait(pom1.getPh().getMen());
		mouseHover(pom1.getPh().getMen());
	     
	}

	@When("user able to click kurtas under ethnic wear section")
	public void user_able_to_click_kurtas_under_ethnic_wear_section() throws InterruptedException {
		//explicitWait(pk.getkurtas);
	//	clickOnElement(pk.getkurtas());
		explicitWait(pom1.getPk().getkurtas());
		clickOnElement(pom1.getPk().getkurtas());
	     
	}
	
	 
	@When("user able to click the first product")
	public void user_able_to_click_the_first_product() throws InterruptedException {
		//explicitWait(pk.getproduct());
		//clickOnElement(pk.getproduct());
		explicitWait(pom1.getPk().getproduct());
		clickOnElement(pom1.getPk().getproduct());
	     
	}

	@When("user able to select the size")
	public void user_able_to_select_the_size() throws InterruptedException {
//		explicitWait(pk.getsize());
//		clickOnElement(pk.getsize());
		explicitWait(pom1.getPk().getsize());
		clickOnElement(pom1.getPk().getsize());
	     
	}

	
	 
	@Then("user able to click on add to cart button")
	public void user_able_to_click_on_add_to_cart_button() throws InterruptedException {
//		explicitWait(pk.getaddtocart());
//		clickOnElement(pk.getaddtocart());
		explicitWait(pom1.getPh().getaddtocart());
		clickOnElement(pom1.getPh().getaddtocart());
	    
	}
	
//	@Then("user able to buy the product")
//	public void user_able_to_buy_the_product() throws InterruptedException {
//		explicitWait(ph.getbuytheproduct());
//		clickOnElement(ph.getbuytheproduct());
	    
	//}
	
	@Then("User able to close the browser")
	public void user_able_to_close_the_browser() {
	    exit1();
	}
	
	
	//ethnic_wear
	@When("user able to click ethnic wear sets under ethnic wear section")
	public void user_able_to_click_ethnic_wear_sets_under_ethnic_wear_section() throws InterruptedException {
//		explicitWait(ew.getethnic_wear_sets());
//		clickOnElement(ew.getethnic_wear_sets());
		explicitWait(pom1.getEw().getethnic_wear_sets());
		clickOnElement(pom1.getEw().getethnic_wear_sets());
	     
	}
	
	@Then("user able to click the second product")
	public void user_able_to_click_the_second_product() throws InterruptedException {
//		explicitWait(ew.getsecond_product());
//		clickOnElement(ew.getsecond_product());
		explicitWait(pom1.getEw().getsecond_product());
		clickOnElement(pom1.getEw().getsecond_product());
	     
	}

	
	//nehru jacket
	@When("user able to click nehru jackets under ethnic wear section")
	public void user_able_to_click_nehru_jackets_under_ethnic_wear_section() throws InterruptedException {
//		explicitWait(nj.getnehru_jackets());
//		clickOnElement(nj.getnehru_jackets());
		explicitWait(pom1.getNj().getnehru_jackets());
		clickOnElement(pom1.getNj().getnehru_jackets());
	}
	
	 

	@Then("user able to click the third product")
	public void user_able_to_click_the_third_product() throws InterruptedException {
//		explicitWait(nj.getthird_product());
//		clickOnElement(nj.getthird_product());
		explicitWait(pom1.getNj().getthird_product());
		clickOnElement(pom1.getNj().getthird_product());
	     
	}
	
	 
}
	     


