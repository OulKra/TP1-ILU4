package interfaces_fonctionnelles;

import java.util.function.Function;

public class Implement_t2 {

	public static void main(String[] args) {
		Function<Integer, Integer> f = (Integer x) -> x+1;
		t2 f2 = (Function<Integer, Integer> ff) -> ff.apply(ff.apply(0));
		System.out.println(f2.apply(f));
	}
}