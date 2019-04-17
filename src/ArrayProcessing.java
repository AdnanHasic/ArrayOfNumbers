import java.util.Arrays;

public class ArrayProcessing {

	private int array[];

	public ArrayProcessing() {

	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public int[] createArrayOfNumbers() {

		System.out.println("Enter the size of the array : ");

		int sizeArray = ArrayOfNumbers.input.nextInt();

		int array[] = new int[sizeArray];

		System.out.println("Enter the elements of the array : ");

		for (int i = 0; i < array.length; i++) {
			array[i] = ArrayOfNumbers.input.nextInt();
		}

		return array;
	}

	public void theSamllestNumberInAnArray() {

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < array.length; i++) {

			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("The smallest number in an array is : " + min);

	}

	public void theLargestNumberinanArray() {

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {

			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("The largest number in an array is : " + max);

	}

	public void sumAndAverageOfarray() {

		int sum = 0;

		for (int i = 0; i < array.length; i++) {

			sum += array[i];

		}
		double average = ((double) sum / array.length);
		System.out.println("The sum of all the elements in an array : " + sum);
		System.out.println("The average of all the numbers in an array : " + average);

	}

	public void uniqueNumbers() {

		int counterRepetitiveNumbers = 0;
		int counterUniqueNumbers = 0;

		System.out.print("The unique numbers are : ");
		for (int i = 0; i < array.length; i++) {
			counterRepetitiveNumbers = 0;
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j]) {
					counterRepetitiveNumbers++;
				}
			}
			if (counterRepetitiveNumbers == 1) {

				System.out.print(array[i] + " , ");

				counterUniqueNumbers++;
			}
		}
		if (counterUniqueNumbers == 0) {
			System.out.println("The array does not have unique numbers !");
		}
	}

	public void sortArray() {

		System.out.println();

		Arrays.sort(array);

		System.out.print("Sort an array : ");

		for (int browser : array) {
			System.out.print(browser + " , ");
		}
	}

}
