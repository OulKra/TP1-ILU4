package composition;

import java.util.function.Function;

public class QuestionA {

	public static void main(String[] args) {
		Function<Integer, Integer> f1 = (Integer x) -> x + 1;
		Function<Integer, Integer> f2 = (Integer x) -> x * 2;
		
		System.out.println((f1.andThen(f2).apply(3)));
	}
}