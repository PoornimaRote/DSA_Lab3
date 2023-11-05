package com.greatLearning.balancingBrackets;

import java.util.*;

public class Balanced_Brackets {
	public static String isBalanced(String input) {
		if (input == null || input.isEmpty()) {
			return "Empty input string";
		}

		Stack<Character> s = new Stack<>();
		for (char ch : input.toCharArray()) {
			if (ch == '(' || ch == '{' || ch == '[') {
				s.push(ch);
			} else if (ch == ')' || ch == '}' || ch == ']') {
				if (s.isEmpty()) {
					return "Unbalanced Brackets";
				}
				char top = s.pop();
				if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
					return "Unbalanced Brackets because Mismatched brackets";
				}
			} else {
				return "Invalid input";
			}
		}
		return s.isEmpty() ? "The entered String has Balanced Brackets" : "Unbalanced brackets";
	}
}
