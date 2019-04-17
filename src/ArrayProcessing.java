
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

	public void sumOfarray() {

		int sum = 0;

		for (int i = 0; i < array.length; i++) {

			sum += array[i];

		}
		System.out.println("The sum of all the elements in an array : " + sum);
	}

}
