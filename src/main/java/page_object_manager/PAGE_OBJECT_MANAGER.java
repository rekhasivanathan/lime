package page_object_manager;

import org.openqa.selenium.support.PageFactory;

import com.baseelime.New_Baselime.Base_class;
import com.pom.PomEthnic_wear;
import com.pom.PomKurtas;
import com.pom.Pom_Nehru_jacket;
import com.pom.Pomclass_Home;

public class PAGE_OBJECT_MANAGER extends Base_class {
	public PAGE_OBJECT_MANAGER() {
		
		PageFactory.initElements(driver, this);
	 
	}
	
	//common to all
	private Pomclass_Home ph;
  
	public Pomclass_Home getPh() {
		Pomclass_Home ph = new Pomclass_Home();
		return ph;
	}
	
	
	//kurtas
	private PomKurtas pk;
	
	public PomKurtas getPk() {
		PomKurtas pk=new PomKurtas();
		return pk;
	}
	
	
	//ethnic wear sets
	private PomEthnic_wear ew;
	
	public PomEthnic_wear getEw() {
		PomEthnic_wear ew=new PomEthnic_wear();
		return ew;
	}
	
	
	//nehru jackets
	private Pom_Nehru_jacket nj;
 
	public Pom_Nehru_jacket getNj() {
		Pom_Nehru_jacket nj=new Pom_Nehru_jacket();
		return nj;
	}
		

}
