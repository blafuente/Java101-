package java_basics;

public class LearningArrays {

	public static void main(String[] args) {

		double [] values = new double [100]; // Array will store 100 elements, fixed value.
		values[0] = 1000;
		values[1] = 33.44;
		values[99] = 93432; 
		
		System.out.println(values[1]);
		System.out.println(values[2]);
		System.out.println(values[0]);
		System.out.println(values[99]);
		
		
		String [] words = new String[3];
		words[0] = "My";
		words[1] = "Name";
		words[2] = "is";
		
		System.out.println(words[2]);
	}
}
