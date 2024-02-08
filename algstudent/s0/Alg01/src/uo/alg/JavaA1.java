package uo.alg;

import java.time.Instant;
import java.util.Date;
import java.util.List;

public class JavaA1 {

	public static void main(String[] args) {
//		int[] casos = Primes.getCasos();
//		for(int caso : casos) {
//			long time = System.currentTimeMillis();
//			List<Integer> primes = Primes.listadoPrimos(caso);
//			long time2 = System.currentTimeMillis();
//			System.out.println("n = " + caso + ": time = " + (time2 - time) + " ms");
//		}
		
		long max = Long.MAX_VALUE;
		Date date = new Date(max);
		System.out.println(date);
		System.out.println(date.getYear() - 2024);

	}

}
