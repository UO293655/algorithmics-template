package uo.alg;

import java.util.LinkedList;
import java.util.List;

public  class Primes {
	
	private static final int[] CASOS = {10000, 20000, 40000, 80000, 160000, 320000, 640000};
	
	public static int[] getCasos() {
		return CASOS;
	}
	
	private static boolean primoA1(int n){	
		for(int i = 2; i < n; i++) {
			if(n%i == 0)
				return false;
		}		
		return true;
	}
	
	public static List<Integer> listadoPrimos(int n){
		List<Integer> result = new LinkedList<>();
		for(int i = 2; i <= n; i++) {
			if(primoA1(i))
				result.add(i);
		}
		
		return result;
	}
	
}
