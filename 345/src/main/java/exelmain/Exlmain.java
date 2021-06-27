package exelmain;

import java.io.IOException;

import exel.Excel1;

public class Exlmain {
	public static void main(String[] args) throws IOException
	{
		String a=Excel1 .readStringData(0,0);
		System.out.println("value  of a is " +a);
		String b=Excel1.readIntrgerData(0,1);
		System.out.println("value of b "+b);
	
	}
	

}
