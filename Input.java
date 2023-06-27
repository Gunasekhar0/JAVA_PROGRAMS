package string;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) throws UnsupportedEncodingException {
		Scanner sc=new Scanner(System.in);
		
		/*String str1=sc.nextLine();
		System.out.println(str1);
		String str2=sc.nextLine();
		System.out.println(str2);
		System.out.println("hello");
		String str3=sc.nextLine();
		System.out.println(str3);
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		String str1=sc.nextLine();*/
		String str1 = "hello";
		String str3="HELLO";
		
		/*System.out.println(str1.charAt(2));
		System.out.println(str1.codePointAt(2));
		System.out.println(str1.codePointBefore(2));
		System.out.println(str1.codePointCount(2, 0));
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareToIgnoreCase(str2));
		System.out.println(str1.concat(str3));
		System.out.println(str1.contains("h"));
		System.out.println(str1.contains("p"));
		System.out.println(str1.contains(str3));
		System.out.println(str1.contentEquals("hello"));
		System.out.println(str1.contentEquals("helloworld"));
		System.out.println(str1.endsWith("llo"));
		
		System.out.println(str1.endsWith("i"));
		System.out.println(str1.equals("i"));
		System.out.println(str1.equals("hello"));
		System.out.println(str1.getBytes("hello"));*/
		System.out.println(str1.indexOf("p"));// doesnt present char it will returns -1
		System.out.println(str1.indexOf("o")); //gives index value , ifit is present
		System.out.println(str1.length());
		System.out.println(str1==str3);
		System.out.println("There is a books named\"The Ramayana\" was read by sita.");//escape sequence
        System.out.println("D\\Desktop\\folder");		
		StringBuffer sb1=new StringBuffer();
		
		StringBuffer sb1 = "hello";
		System.out.println(sb1.hashCode());
		
		
		
		

	}

	private static void The(String string) {
		// TODO Auto-generated method stub
		
	}

}
