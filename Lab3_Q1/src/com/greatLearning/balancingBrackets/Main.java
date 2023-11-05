package com.greatLearning.balancingBrackets;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a string with brackets: ");
		String input = scn.nextLine();
		String result = Balanced_Brackets.isBalanced(input);
		System.out.println(result);

		scn.close();
	}

}
