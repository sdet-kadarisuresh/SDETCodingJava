package Strings;

public class Occurrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="abcdabdjdsfaercaasdfaemfdekradfvcfadgsrtfgvgaerdc";
		
		int len=s.length();
		
		int[] count=new int[128];
		
		
		
		for(int i=0;i<len;i++) {
			
			char ch=s.charAt(i);
			
			if(ch!=' ')
			{
				count[ch]++;
			}
			
		}
		
		for(int i=0;i<count.length;i++) {
			if(count[i]>0) {
			System.out.println((char)i +"  : "+ count[i]);
			}
			
			
		}
		
		
				
		
		
	}

}
