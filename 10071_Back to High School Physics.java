import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			long velocity = scan.nextLong();
			long time = scan.nextLong();
			System.out.println(velocity*time*2);
		}
	}
}