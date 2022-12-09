package code;

import java.util.Scanner;

public class ZOO {

	/*
	  Problem You are required to enter a word that consists of and that denote the
	  number of Zs and Os respectively. The input word is considered similar to
	  word zoo if .
	  
	  Determine if the entered word is similar to word zoo.
	  
	  For example, words such as zzoooo and zzzoooooo are similar to word zoo but
	  not the words such as zzooo and zzzooooo.
	  
	  Input format
	  
	  First line: A word that starts with several Zs and continues by several Os.
	  Note: The maximum length of this word must be . Output format
	  
	  Print Yes if the input word can be considered as the string zoo otherwise,
	  print No.
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a palavra");
		String word = sc.next();
		char arrayWord[] = word.toCharArray();
		int quantityZ = 0, quantityO = 0;
		for (char s : arrayWord) {
			if (s == 'z') {
				quantityZ++;
			} else {
				quantityO++;
			}
		}

		if ((quantityZ * 2) == quantityO)
			System.out.println("Yes");
		else
			System.out.println("No");
		sc.close();
	}
}
