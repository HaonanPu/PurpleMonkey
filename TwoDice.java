package unit3;
import java.util.Arrays;
public class TwoDice {

	public static void main(String[] args) {
		int[]totals = new int[13];
		
		for(int i=0; i < 200; i++) {
			int dice1 = (int)(Math.random()*6)+1;
			int dice2 = (int)(Math.random()*6)+1;
			
			int sum = dice1 + dice2;
			totals[sum]++;
		}
//print out results
		for(int j=2; j<=12; j++) {
			System.out.println(j + " = " + totals[j]);
		}
	    System.out.println(Arrays.toString(totals));
	}

}
