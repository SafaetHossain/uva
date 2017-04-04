import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		int sum = 0;
		for(int i = 0;i < testCase;i++){
			int firstNumber = scan.nextInt();
			int secondNumber = scan.nextInt();
			for(int j = firstNumber;j <= secondNumber;j++){
				if(j%2 == 1){
					sum = sum +  j;
				}
			}
			System.out.println("Case " + (i+1) + ": " + sum);
			sum = 0;
		}
	}
}