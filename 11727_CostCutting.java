import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		for(int i = 1;i <= testCase;i++){
			int firstEmp = scan.nextInt();
			int secondEmp = scan.nextInt();
			int thirdEmp = scan.nextInt();
			System.out.print("Case " + i + ": ");
			if((firstEmp > secondEmp && secondEmp > thirdEmp) || (thirdEmp > secondEmp && secondEmp > firstEmp)){
				System.out.println(secondEmp);
			}
			else if((secondEmp > firstEmp && firstEmp > thirdEmp) || (thirdEmp > firstEmp && firstEmp > secondEmp)){
				System.out.println(firstEmp);
			}
			else if((thirdEmp < firstEmp && secondEmp < thirdEmp) || (thirdEmp < secondEmp && firstEmp < thirdEmp)){
				System.out.println(thirdEmp);
			}
			else if(firstEmp == secondEmp && secondEmp == thirdEmp){
				System.out.println(thirdEmp);
			}
		}
	}
}