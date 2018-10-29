package TestScripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import BusinessFunctions.Admin;
import BusinessFunctions.Login;

public class TC3_AddLoc extends RootTest 
{
	
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		Login login=new Login(brow,locators,locfile);
		Admin admin=new Admin(brow,locators,locfile);
		//---------------------------------------------------------
	}
}
