import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		for(int i = 0;i < testCase;i++){
			int firstNumber = scan.nextInt();
			int sceondNumber = scan.nextInt();
			
			if(firstNumber > sceondNumber){
				System.out.println(">");
			}
			else if(firstNumber < sceondNumber){
				System.out.println("<");
			}
			else{
				System.out.println("=");
			}
		}
	}
}