package domain;

public class Mobile implements Product 
{

	@Override
	public void productType()
	{
System.out.println("product type: Mobile");
	}

	@Override
	public void productCost(double price) 
	{
     double actualPrice=price+((price*10)/100);
     System.out.println("Actual Price: "+actualPrice);
	}

}
