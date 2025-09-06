package Strings;

public class AlphabetCharCount {
	
	public static void main(String[] args) {
		String s="#fdgfb dfgvsd $52 fdggv";
		s=s.toLowerCase();
		
		int[] count=new int[128];
		
		for(int i=0;i<s.length();i++) {
			
			char ch=s.charAt(i);
			int $rice=90;
			int D=9;
			int _d=0;
			
			
			if((ch>='a' &&  ch<='z')){
				count[ch]++;
			}
			
			
			}
		
		for(int i=0;i<count.length;i++) {
			if(count[i]>1) {
				System.out.println((char)i +" "+ count[i]);
				
			}
			
		}
	}

}
