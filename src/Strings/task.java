package Strings;

public class task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="asdfa EEFE Ejesf#$ %$rfes d%$";
		
		int[] arr=new int[128];
		
		for(int i=0;i<s.length();i++) {
			
			char ch=s.charAt(i);
			
			if((ch>='a' && ch<='z') | (ch>='A' && ch<='Z') )
			{
				arr[ch]++;
			}
			
			
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				System.out.print((char)i+""+ arr[i]);
			}
		}
	}

}
