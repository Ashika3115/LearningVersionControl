package com.dummy;

public class qq20 {

	public static void main(String[] args) {
		int s = method();
		System.out.println(s);

	}

	@SuppressWarnings("finally")
	public static int method() {
		try {
			return 3;
		} catch (Exception e) {
			return 2;
		} finally {
			return 1;
		}
	}

}
