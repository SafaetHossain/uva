import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int i = 0;
		while(scan.hasNext()){
			String word = scan.nextLine();
			i++;
			if(word.equals("*"))
			{
				break;
			}
			else
			{
				if(word.equals("Hajj"))
				{
					System.out.println("Case "+i+": Hajj-e-Akbar");
				}
				else if(word.equals("Umrah"))
				{
					System.out.println("Case "+i+": Hajj-e-Asghar");
				}
			}
		}
	}
}