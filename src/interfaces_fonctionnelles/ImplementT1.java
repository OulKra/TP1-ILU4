package interfaces_fonctionnelles;

public class ImplementT1 {

	public static void main(String[] args) {
		T1 f1 = (int i) -> i + 1;
		System.out.println(f1.apply(3));
	}
}