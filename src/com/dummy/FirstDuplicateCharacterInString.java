package com.dummy;



public class FirstDuplicateCharacterInString {

	public static void main(String[] args) {
		String str = "I love I hate";
		char c = ' ';
		for (int i = 0; i < str.length(); i++) {
			int asci = str.charAt(i);

			for (int j = 0; j < str.length(); j++) {
				if (i != j) {
					int asci2 = str.charAt(j);

					if (asci == asci2) {
						c = (char) asci;
						break;
					}
				} 
			}
			
			break;
		}
		System.out.println(c);
	}

}
