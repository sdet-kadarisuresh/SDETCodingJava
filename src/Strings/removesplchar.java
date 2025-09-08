package Strings;

public class removesplchar {

	public static void main(String[] args) {
		 String s = "AAAccc@44#$ #6$ Yy";
		 int[] arr=new int[128];
		 
		 for(int i=0;i<s.length();i++) {
			 
			 char ch=s.charAt(i);
			 
			 if((ch>='a' && ch<='z') | (ch>='A' && ch<='Z'))
			 {
				// System.out.println();
				 arr[ch]++;
			 }
		 }
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]>0) {
				 System.out.print((char)i+""+arr[i]);
			 }
		 }

	}
}
