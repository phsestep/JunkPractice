/*Mark Estep
 * 10/9/24
 * Write the method isCommonFactor() which takes 3 positive integers, f, n, and m.  
 * isCommonFactor() returns true if f is a factor of n and m.  
 * (f is a common factor of n and m)
 */

public class PracticeMethods {
	public static boolean isCommonFactor(int fact, int num1, int num2) {
		boolean common1 = num1 % fact == 0;
		boolean common2 = num2 % fact == 0;
		return common1 && common2;
	}

	public static void main(String[] args) {
		System.out.println(isCommonFactor(5, 20, 30)); //True
		System.out.println(isCommonFactor(3, 9, 10));  //False

	}

}
