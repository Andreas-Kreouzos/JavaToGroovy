package numbers;

import java.util.Arrays;
import java.util.List;

public class AddingNumbers {

	public int add(int... numbers) {
		int total = 0;
		for (int number : numbers) {
			total += number;
		}
		return total;
	}
	
	public int addEven(int... numbers) {
		int total = 0;
		for (int number : numbers) {
			if(number % 2 == 0){
				total += number;
			}
		}
		return total;
	}
	
	public int addOdd(int... numbers) {
		int total = 0;
		for (int number : numbers) {
			if(number % 2 != 0) {
				total += number;
			}
		}
		return total;
	}
	
	public int addNumbersGreaterThan(List<Integer> numbers, int lowerBound) {
		int total = 0;
		for (int number : numbers) {
			if(number > lowerBound){
				total += number;
			}
		}
		return total;
	}
	
	public static void main(String[] args) {
		AddingNumbers an = new AddingNumbers();
		System.out.println(an.add(1,2,3,4,5,6,7,8));
		System.out.println(an.addEven(1,2,3,4,5,6,7,8));
		System.out.println(an.addOdd(1,2,3,4,5,6,7,8));
		System.out.println(an.addNumbersGreaterThan(
				Arrays.asList(new Integer[] {1,2,3,4,5,6,7,8}), 4));
	}

}
