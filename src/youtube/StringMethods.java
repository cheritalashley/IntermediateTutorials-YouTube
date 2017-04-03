// 3/3/17
// Small program using the startsWith and the endsWith Methods

package youtube;

public class StringMethods {

	public static void main(String[] args) {
		String[] words={"funny", "chunky", "furry", "baconator"};
		
		for(String x: words){
			if(x.startsWith("fu"))
				System.out.println(x+" starts with fu");
		}
		
		for(String x: words){
			if(x.endsWith("r"))
				System.out.println(x+" ends with r");
		}
	}

}
