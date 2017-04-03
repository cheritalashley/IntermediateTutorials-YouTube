//3-3-17
//Program that use the Substring Method
package youtube;

public class SubstringMethod {

	public static void main(String[] args) {
		String s="hello world cherita lashley is here";
		
		//search for the first character of e and print the value
		System.out.println(s.indexOf('e'));
		
		//search for the first character of e after the number value and print the value
		System.out.println(s.indexOf('e', 6));
		
		//search for the first character of che and print the value
		System.out.println(s.indexOf("che"));
		
		String a = "Cherita";
		String b= "Lashley";
		String c= "       Lashley";
		System.out.println(a+b);  //Normal when you know whats the strings
		System.out.println(a.concat(b)); //Do the same as above
		
		System.out.println(a.replace("Cherita", "Bryan")); // Replace one word with another word
		System.out.println(a.toUpperCase()); // Makes all the letters uppercase
		System.out.println(c.trim());  // Remove white space at beginning or ending of words
		
		
		
		
		
		
		
		

	}

}
