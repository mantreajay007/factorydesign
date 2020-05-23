package factory;

import domain.Laptop;
import domain.Mobile;
import domain.Product;

public class ProductFactory {

	public Product getProductFactory(String productType)
	{
		Product p1=null;
		if(productType.equalsIgnoreCase("mobile"))
		{
		p1=new Mobile();
		
		}
		else if(productType.equalsIgnoreCase("laptop"))
		{
        p1=new Laptop();
       
		}
		
        return p1;
	}
}
