// 3-8-17
// Program that uses the Generic Type of T to pass to Methods and return from Methods

package youtube;

public class GenericMethod {

	public static void main(String[] args) {
		Integer[] intArray={1,2,3,4,5};
		Character[] charArray={'c', 'h', 'e', 'r', 'i', 't', 'a'};
		String[] strArray={"Cherita", "Lashley"};
		
		printMe(intArray);
		printMe(charArray);
		printMe(strArray);

		System.out.println(maximum(23, 4, 90));
		System.out.println(maximum("Cherita", "Loves", "Programming"));
		System.out.println(maximum('h', 'w', 'c'));
	}
	
	//Instead of having 3 printMe methods to print data from different data types, 
	// have one generic method to print any data
	public static <T> void printMe(T[] myArray){
		for (T temp: myArray)
			System.out.printf("%s ", temp);
		System.out.println();
	}
	
	//Generic Method that returns any data type and accepts any data types
	public static <T extends Comparable<T>> T maximum(T data1, T data2, T data3){
		T max=data1;
		
		if (data2.compareTo(data1) > 0)
			max=data2;
		
		if (data3.compareTo(max) > 0)
			max=data3;
		
		return max;
	}
}
