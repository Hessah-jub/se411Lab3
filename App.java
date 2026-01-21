package lab.generics;
import java.util.Arrays;
import java.util.List;

public class App {

	public static void printList(List<?> list) {
		for (Object item : list) {
		System.out.println(item);
		}
		}

		public static double sumNumbers(List<? extends Number> list) {
		double sum = 0;
		for (Number n : list) {
		sum += n.doubleValue();
		}
		return sum;
		}
    public static void main(String[] args) {
	// NumberBox with Integer
	NumberBox<Integer> intBox = new NumberBox<>();
	intBox.setItem(10);
	System.out.println("Integer item: " + intBox.getItem());
	System.out.println("Sum: " + intBox.addNumbers(5, 15));

	// NumberBox with Double
	NumberBox<Double> doubleBox = new NumberBox<>();
	doubleBox.setItem(3.5);
	System.out.println("Double item: " + doubleBox.getItem());
	System.out.println("Sum: " + doubleBox.addNumbers(2.5, 4.5));


        String[] words = {"Java", "Generics", "Lab"};
        PrintableList<String> stringList = new PrintableList<>(words);
        stringList.printList();

        System.out.println("-----");

        Integer[] numbers = {1, 2, 3, 4};
        PrintableList<Integer> intList = new PrintableList<>(numbers);
        intList.printList();
    System.out.println("-----");

    List<String> names = Arrays.asList("Ali", "Sara", "Hessah");
    List<Integer> nums = Arrays.asList(10, 20, 30);

    printList(names);
    System.out.println("Sum nums: " + sumNumbers(nums));
}
}

