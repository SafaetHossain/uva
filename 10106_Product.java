import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		BigInteger  number1;
		BigInteger  number2;
		while(scan.hasNext()){
			number1 = scan.nextBigInteger ();
			number2 = scan.nextBigInteger ();
			System.out.println(number1.multiply(number2));
		}
	}
}