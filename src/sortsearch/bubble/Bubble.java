package sortsearch.bubble;

/*BUBBLE SORTING*/

public class Bubble {

	static int[] arr = { 4, 5, 12, 0, -4, 3, 82, -30, 6, 8, 13, -10, 15, 11};  // Creating a random array

	public static void main(String[] args) {

		boolean end = true;   //This variable will be false at the end of cycle for, when array will be sorted 
		
		while (end == true) {   // While true ==> sorting is not complete - cycle continues
			end = false;
			for (int i = 1; i < arr.length; i++) { // We will go through the array 

				if (arr[i] < arr[i - 1]) {  // Compares neighboring elements, and if the condition is true - changing their places
					int temp;
					temp = arr[i];
					arr[i] = arr[i - 1];
					arr[i - 1] = temp;
					end = true;    // When there was no changes - variable is false ==> sorting ended
				}

			}

		}

		for (int j = 0; j < arr.length; j++) {   // Display sorted array
			System.out.print(arr[j]+" ");

		}

	}

}
