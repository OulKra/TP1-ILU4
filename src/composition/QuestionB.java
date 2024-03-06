package composition;

public class QuestionB {
	public static void main(String[] args) {
        Power<Integer> carre = x -> x * x;
        Power<Integer> cube = x -> x * x * x;

        Power<Integer> carreThenCube = carre.andThen(cube);

        System.out.println(carreThenCube.apply(2));

        System.out.println(carre.apply(2));
    }
}
