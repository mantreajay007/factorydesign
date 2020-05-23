package PropertiesFile;



import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class EmployeeProperties 
{
	public static void main(String[] args) 
	{
		FileWriter fw=null;

		Properties prop=new Properties();

		try
		{
			fw=new FileWriter("D:\\propertiesfile\\EmpDetails.properties");

			prop.setProperty("EmpName", "Sachin");
			prop.setProperty("Age", "26");

			prop.store(fw, "EXTERNAL FILE");

			System.out.println("PROPERTIES FILE CREATED SUCCESSFULLY");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			
		try {
			fw.close();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
				
			}
		}
	}

