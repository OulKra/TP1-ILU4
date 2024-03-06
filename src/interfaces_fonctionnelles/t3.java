package interfaces_fonctionnelles;

import java.util.function.Function;

public interface t3<T>{
	public T apply(Function<T, T> f, T value);
}
