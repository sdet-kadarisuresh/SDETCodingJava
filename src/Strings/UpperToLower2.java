package Strings;

public class UpperToLower2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="aaaa BBB ccC DDd";
		
		String res="";
		
		for(int i=-0;i<s.length();i++) {
			
			char ch=s.charAt(i);
			
			if(ch>='A' && ch<='Z') {
				
				res+=(char)(ch+32);
				
			}else if(ch>='a' && ch<='z') {
				res+=(char)(ch-32);
			}
			else {
				res+=ch;
			}
		}
		
		System.out.println(res);
	}

}
