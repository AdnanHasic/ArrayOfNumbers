import java.util.Scanner;

public class ArrayOfNumbers {

	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayProcessing arrayProcessing = new ArrayProcessing();

		arrayProcessing.setArray(arrayProcessing.createArrayOfNumbers());
		arrayProcessing.theSamllestNumberInAnArray();

	}

}
