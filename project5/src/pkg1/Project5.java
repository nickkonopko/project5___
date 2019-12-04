
/**
 *  In this class I used the BinTree class to organize and manipulate the data in the countries4.csv file.
 * I needed to take in the file using a scanner, then take that information in the scanner and insert it onto
 * my tree. Next, I called various methods in the BinTree class to organize and reprint the tree in the console.
 * 
 * 
 * @author<Nick Konopko>
 * @version<11/16/19>
 * */

package pkg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Project5
{
	public static void main(String[] args) throws FileNotFoundException
	{

		int count = 0;

		Scanner in = new Scanner(new File("Countries5.csv")); // file scanner
		Hashtable theTable = new Hashtable(311);
		in.useDelimiter(",|\\n");
		for (int i = 0; i <= 155; i++)
		{
			
			if (i == 0)
			{
				in.nextLine();
				continue;
			} // end if statement
			Country newCountryy = new Country(in.next(), in.next(), in.next(), in.nextDouble(), in.nextDouble(), 
					in.nextDouble());
			
			theTable.insert(newCountryy.getcountryName(), (newCountryy.getcountryGDP() / newCountryy.getcountryPopulation()));
			count++;
			}

		in.close(); //close scanner
		in.close();
		
		System.out.printf("%nThere were %d country records put on to the table. %n%n", count);
		System.out.println("Table contents: ");
		theTable.displayTable(); //prints the tree inOrder

		/*
		 * these methods are calls from the tree to delete print and find different countries and orders  
		 */
		theTable.delete("Australia");
		theTable.delete("Tunisia");
		theTable.delete("Norway");
		theTable.find("Sri Lanka");
		theTable.find("North Cyprus");
		theTable.find("Tunisia");
		theTable.delete("Germany");
		theTable.delete("Somalia");
		theTable.delete("Ireland");
		theTable.delete("Greece");
		theTable.delete("Bolivia");
		System.out.println("Table contents: ");
		theTable.displayTable();
		theTable.printFreeAndCollisions();
		
	}// end of program
}