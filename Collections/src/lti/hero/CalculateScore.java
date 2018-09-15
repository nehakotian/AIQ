package lti.hero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// Sequence: SP-SM-IM-BM-DP-BP-HK
public class CalculateScore {
	private static int[] result=new int[7];
	//private static int[] resultclone=new int[7];

	public static void main(String[] args) {
		int max=0;
		ArrayList<String> score=new ArrayList<>();
		score.add("1011000");
		score.add("0000100");
		score.add("1010100");
		score.add("0000100");
		score.add("0000000");
		score.add("0011100");
		score.add("0001110");
		score.add("0101011");
		score.add("1000001");
		score.add("1111100");
		score.add("1100001");
		score.add("1000101");
		
		for (String value : score) {
			addString(value);
		}
		for (int i : result) {
			System.out.print(i);
		}
		
		for(int i=1;i < result.length;i++){
		    if(result[i] > max){
			  max = result[i];
			}
		  }
		
		for (int j = 0; j < 7; j++) {
			if(result[j]==max)
				System.out.println(j);
		}
		 
		/*resultclone=result.clone();
		Arrays.sort(resultclone);
		System.out.println();
		System.out.println(resultclone[6]);
		
		for (int j = 0; j < 7; j++) {
			if(result[j]==resultclone[6])
				System.out.println(j);
		}*/
	}
	
	private static void addString(String input) {
		String[] star=input.split("");
		for (int i = 0; i < star.length; i++) {
			result[i]+=Integer.parseInt(star[i]);
		}
	}

}
