package domain;

public class Laptop implements Product 
{

	@Override
	public void productType()
	{
System.out.println("product type:Laptop");
	}

	@Override
	public void productCost(double price) 
	{
     double actualPrice=price+((price*5)/100);
     System.out.println("Actual Price: "+actualPrice);
	}

}
