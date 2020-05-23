package test;

import java.util.Scanner;

import domain.Product;
import factory.ProductFactory;

public class MainProduct 
{
	public static void main(String[] args) 
	{
		Scanner sc1=new Scanner(System.in);
		
		System.out.println("SELECT PRODUCT TYPE");
		System.out.println("laptop");
		System.out.println("mobile");
		
		String choice=sc1.next();
         
		ProductFactory pf=new ProductFactory();
		
		Product v=pf.getProductFactory(choice);
		System.out.println("enter Product price:");
		double price=sc1.nextDouble();
		
		v.productType();
		v.productCost(price);
			}
}