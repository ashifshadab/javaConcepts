package com.ashifshadab;

public class EqualAndDoubleEqualOperatorComparision {

	public static void main(String[] args) {

		String s1 = new String("Raj");
		String s2 = new String("Raj");

		StringBuffer sb1 = new StringBuffer("Raj");
		StringBuffer sb2 = new StringBuffer("Raj");

		System.out.println("s1.equals(s2):::" + s1.equals(s2));
		System.out.println("s1 == s2:::" + (s1 == s2));

		System.out.println("");

		System.out.println("sb1.equals(sb2):::" + sb1.equals(sb2));
		System.out.println("sb1 == sb2:::" + (sb1 == sb2));

		System.out.println("");

		System.out.println("s1.equals(sb2):::" + s1.equals(sb2));
		// compile time error Incompatible operand types String and StringBuffer
		// System.out.println("s1 == sb2:::"+(s1 == sb2));
		
		System.out.println("");
		System.out.println("s1.equals(null):::" + s1.equals(null));
		System.out.println("s1 == null:::" + (s1 == null));
		
		System.out.println("s1 HASCODE:::" + (s1.hashCode()));
		System.out.println("s2 HASCODE:::" + (s2.hashCode()));
		
		System.out.println("sb1 HASCODE:::" + (sb1.hashCode()));
		System.out.println("sb2 HASCODE:::" + (sb2.hashCode()));
		
		System.out.println("---------------------");
		String string1="job";
		String string2="seeker";
		String string3=string1.concat(string2);
		String string4="jobseeker";
		System.out.println("string3::"+string3);
		System.out.println("string4::"+string4);
		System.out.println(string3==string4); 
		System.out.println((string3.hashCode())==(string4.hashCode())); 

	}

}
