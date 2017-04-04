import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			double number = scan.nextDouble();
			if(number == 0){
				break;
			}
			else{
				double result = Math.pow((int)Math.sqrt(number), 2);
			if(result == number){
				System.out.println("yes");
			}
			else{
				System.out.println("no");
			}	
			}
		}
	}
}