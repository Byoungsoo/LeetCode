package com.leetcode.easy;

public class ReverseIntegerSol {

	public int reverse(int x) {

//		step1: Positive or Negative: Add Minus or Not
//		step2: When X value is negative then change X to Absolute Value
		int reverse = 0;
		while (x != 0) {
			int pop = x % 10;
			x = x / 10;
			if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && pop > 7))
				return 0;
			if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && pop < -8))
				return 0;
			reverse = reverse * 10 + pop;

		}
		return reverse;

	}
}
