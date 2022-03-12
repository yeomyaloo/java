package javajungsuk;

import java.util.function.Function;
import java.util.function.Predicate;

public class Java14_3 {

	public static void main(String[] args) {
		//함수도 람다식으로 연결할 수 있다는 것을 보여줌
		Function<String, Integer> f = (s) -> Integer.parseInt(s,16);
		Function<Integer, String> g = (i) -> Integer.toBinaryString(i);
		
		Function<String, String> h = f.andThen(g);
		Function<Integer, Integer> h2 = f.compose(g);
		
		System.out.println(h.apply("FF"));
		System.out.println(h2.apply(2));
		
		//항등 함수 넣은 값(입력 값) 그대로 출력
		Function<String, String> f2 = x -> x;
		System.out.println(f2.apply("AAA"));
		
		//
		Predicate<Integer> p = i -> i < 100;
		Predicate<Integer> q = i -> i < 200;
		Predicate<Integer> r = i -> i % 2==0;
		Predicate<Integer> notP = p.negate();
		
		Predicate<Integer> all = notP.and(q.or(r));
		System.out.println(all.test(150));
		
		String str1 = "abc";
		String str2 = "abc";
		
		//str1과 str2가 같은지 비교한 결과 반환
		Predicate<String> p2 = Predicate.isEqual(str1);
		boolean result = p2.test(str2);
		System.out.println(result);
	}

}
