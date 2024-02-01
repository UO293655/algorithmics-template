package uo.alg;

import java.util.List;

public class JavaA1 {

	public static void main(String[] args) {
		int[] casos = Primes.getCasos();
		for(int caso : casos) {
			long time = System.currentTimeMillis();
			List<Integer> primes = Primes.listadoPrimos(caso);
			long time2 = System.currentTimeMillis();
			System.out.println("n = " + caso + ": time = " + (time2 - time) + " ms");
		}

	}

}
