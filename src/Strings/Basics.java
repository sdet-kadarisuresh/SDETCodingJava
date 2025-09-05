package Strings;

public class Basics {
	
	public static void main(String[] args) {
		String s="Hello";
		String s2="Hello";
		
		String s1=new String("Hello");
		
		System.out.println(s==s2);  //t
		System.out.println(s==s1);  //f
		System.out.println(s.equals(s1)); //t
		
		int string_length=s.length();
		System.out.println(string_length); //5
		
		String s3=s1+s;
		
		System.out.println(s3);
		
//		System.out.println(s.hashCode());
//		System.out.println(s2.hashCode());
//		System.out.println(s1.hashCode());
//		System.out.println(s3.hashCode());

		System.out.println(s.charAt(1)); //e
		String a="A";
		String b="B";
		System.out.println(a.compareTo(b)); // -1 -- B is less  then A
		System.out.println(b.compareTo(b)); // 0 -- A=B
		System.out.println(b.compareTo(a)); // 1 -- A is greater then B


		System.out.println(a.concat(b)); //AB
		System.out.println(a.equals(b));//False
		String A="a";
		System.out.println(A.equals(a)); //f
		System.out.println(A.equalsIgnoreCase(a)); //t
		
		String t="  Hey   How   ";
		
		System.out.println(t.trim()); //Hey   How
		System.out.println(s.toUpperCase());
		
		System.out.println(s.toLowerCase());
		System.out.println(s.toString());
		
		
	}
	
	

}
