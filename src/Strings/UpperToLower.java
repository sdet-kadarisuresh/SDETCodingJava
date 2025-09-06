package Strings;

import com.sun.net.httpserver.Authenticator.Result;

public class UpperToLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "HEllo AbcDeF";
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			if (Character.isUpperCase(ch)) {
				sb.append(Character.toLowerCase(ch));

			}
			else {
				sb.append(Character.toUpperCase(ch));
			}
		}
		System.out.println(sb);
	}

}
