package composition;

import java.util.Objects;
import java.util.function.Function;

public interface Power<T> extends Function<T, T>{
	
	default Power<T> andThen(Power<T> after) {
        return t -> after.apply(apply(t));
    }
	
	static <T> Power<T> identity() {
        return t -> t;
    }
	
	default Power<T> power(int n, Power<T> f) {
        if (n == 0)
            return identity();
        else
            return f.andThen(power(n - 1, f));
    }
}
