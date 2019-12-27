package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] s = {"cat", "dog", "duck", "fish", "frog"};
		//2. print the third element in the array
		System.out.println(s[2]);
		//3. set the third element to a different value
		s[2] = "lizard";
		//4. print the third element again
		System.out.println(s[2]);
		System.out.println("\n");
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		System.out.println("\n");
		//6. make an array of 50 integers
		int[] a = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i <50; i++) {
			Random rand = new Random();
			int randomNum = rand.nextInt(51 - 1);
			a[i] = randomNum;
		}
		//8. without printing the entire array, print only the smallest number in the array
		int min = 100;
		for (int i = 0; i <a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println(min + "\n");
		//9 print the entire array to see if step 8 was correct
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("\n");
		//10. print the largest number in the array.
		int max = 0;
		for (int i = 0; i <a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println(max);
	}
}
