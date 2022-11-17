package jUnitTestPackage;
import java.util.*;
public class jUnitFunctions {
static int AddNumbers(int a, int b) {
	return a+b;
}
static String AddStrings(String a, String b) {
	return a+b;
}
public static void main(String args[]) {
	Scanner in = new Scanner(System.in);
	int a,b;
	String s1, s2;
	a = in.nextInt();
	b = in.nextInt();
	s1 = in.nextLine();
	s2 = in.nextLine();
	System.out.println(AddNumbers(a,b));
	System.out.println(AddStrings(s1, s2));
}
}
