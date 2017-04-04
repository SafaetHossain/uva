import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			long ownArmy = scan.nextLong();
			long opponentArmy = scan.nextLong();
			if(ownArmy < opponentArmy){
				Long sum = opponentArmy - ownArmy;
				System.out.println(sum);
			}
			else{
				Long sum = ownArmy - opponentArmy;
				System.out.println(sum);
			}
		}
	}
}