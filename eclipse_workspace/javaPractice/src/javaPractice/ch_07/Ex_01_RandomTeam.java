package javaPractice.ch_07;

import java.util.Arrays;
import java.util.Random;

public class Ex_01_RandomTeam {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ·£´ýÀ¸·Î Á¶Æí¼ºÇÏ±â
		 * ÇÑ Á¶ÀÇ ÀÎ¿øÀº 3¸í
		 * */
		String[] students = { // ÃÑ 27¸í
				"±è´ëÈ¯", "±èÁ¤¿ø", "±èÁØÇõ", "±èÁöÇý", "±èÇýÇö",
				"¹Ú±âÈÆ", "¹Ú¼º¹Î", "¹Ú¼ÒÈñ", "¹ÚÁ¤Çý", "¹ÚÁØÈÖ",
				"¹è±Ô", "¼ÕÇÏ´Ã", "½Å¿ëÈ­", "¿À¹ü¼ö", "¿À¿øÅÃ",
				"¿ÀÇØÁØ", "À¯¼öÇö", "À°½Â¹Î", "ÀÌ±âÇà", "ÀÌ¼ºÈ£",
				"ÀÌ½ÂÀç", "ÀÌ¿µÁÖ", "Àå¸í±Ô", "ÀåÀ±¿µ", "ÁÖ¹Î¼®",
				"ÃÖÇöÁö", "È²ÈñÀ±"};
//		String student = students[0];
		String[][] team = new String[9][3];
		Random random = new Random();
		int range = 9;
		int range2 = 3;
		while(range > 0 && range2 > 0) {
			int randomNum = random.nextInt(students.length);
//			System.out.println(randomNum);
			boolean state = true;
			// Áßº¹Ã¼Å©
			for(int i=0; i<9; i++) {
				for(int j=0; j<3; j++) {
					if(students[randomNum] == team[i][j]) {
						state = false;
					}
				}
			}
			
			// Áßº¹ ¾øÀ» ½Ã
			if(state == true) {
				team[range-1][range2-1] = students[randomNum];
				range2 --;
				if(range2 == 0 && range != 0) {
					range2 = 3;
					range --;
				}
			}
		}
		for(int i=0; i<team.length; i++) {
			System.out.println(Arrays.toString(team[i]));
		}
	}
}
