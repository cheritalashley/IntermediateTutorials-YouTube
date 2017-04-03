// 3-3-2017
// Program that use a Method to call itself - which is called recursion
// Using the math concept of factorials

package youtube;

public class Recursion {

	public static void main(String[] args) {
		System.out.println(fact(5));
	}
	
	public static long fact(long n){
		if (n<=1)
			return 1;
		else 
			return n*fact(n-1);
	}
}
