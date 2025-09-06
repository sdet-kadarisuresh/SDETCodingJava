package Strings;

public class occurrences1 {
	public static void main(String[] args) {
		
		String s="abc abc efd";
		
		int[] count=new int[128];
		for(int i=0;i<s.length();i++) {
			
			char ch=s.charAt(i);
			
			if(ch!=' ') {
				count[ch]++;
			}
			
		}
		
		for(int i=0;i<count.length;i++) {
			if(count[i]>0) {
				System.out.print((char)i+""+count[i]);
			}
		}
		
		
	}

}
