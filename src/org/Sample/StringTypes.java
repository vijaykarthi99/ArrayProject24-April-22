package org.Sample;

public class StringTypes {

	public static void main(String[] args) {

		System.out.println("Literal String");
		System.out.println("*******************");

		String s = "Vijay";
		System.out.println(s);
		int x = System.identityHashCode(s);
		System.out.println(x);
		System.out.println("");
		String s1 = "Vijay";
		System.out.println(s1);
		int y = System.identityHashCode(s1);
		System.out.println(y);
		System.out.println("");
		String s2 = "vijay";
		System.out.println(s2);
		int z = System.identityHashCode(s2);
		System.out.println(z);
		System.out.println("");

		System.out.println("Non-Literal String");
		System.out.println("********************");

		String a = new String("Vijay");
		System.out.println(a);
		int a1 = System.identityHashCode(a);
		System.out.println(a1);
		System.out.println("");
		String b = new String("Vijay");
		System.out.println(b);
		int b1 = System.identityHashCode(b);
		System.out.println(b1);

		System.out.println("");
		String c = new String("vijay");
		System.out.println(c);
		int c1 = System.identityHashCode(c);
		System.out.println(c1);
		System.out.println("");
		System.out.println("Imutable String:");
		System.out.println("*****************");

		String im = "Vijay";
		System.out.println(im);
		int e = System.identityHashCode(im);
		System.out.println(e);
		String im1 = "mani";
		System.out.println(im1);
		int e1 = System.identityHashCode(im1);
		System.out.println(e1);
		String concat = im.concat(im1);
		System.out.println(concat);
		int X1 = System.identityHashCode(concat);
		System.out.println(X1);
		System.out.println("");
		System.out.println("Muttable String:");
		System.out.println("****************");
		StringBuffer m = new StringBuffer("Vijay");
		System.out.println(m);
		int Y1 = System.identityHashCode(m);
		System.out.println(Y1);

		StringBuffer m1 = new StringBuffer("mani");
		System.out.println(m1);
		int Y2 = System.identityHashCode(m1);
		System.out.println(Y2);
		StringBuffer append = m.append(m1);
		System.out.println(append);
		int Z = System.identityHashCode(append);
		System.out.println(Z);

	}

}
