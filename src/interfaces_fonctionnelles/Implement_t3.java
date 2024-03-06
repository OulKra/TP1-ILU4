package interfaces_fonctionnelles;

import java.util.function.Function;

public class Implement_t3 {

	public static void main(String[] args) {
		Function<String, String> f = (String x) -> x + "x";
		t3<String> f3 = (Function<String, String> ff, String v) -> ff.apply(ff.apply(v));
		System.out.println(f3.apply(f, "a"));
	}
}