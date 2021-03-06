/* 
 * Solution to Project Euler problem 48
 * by Project Nayuki
 * 
 * https://www.nayuki.io/page/project-euler-solutions
 * https://github.com/nayuki/Project-Euler-solutions
 */

import java.math.BigInteger;


public final class p048 implements EulerSolution {
	
	public static void main(String[] args) {
		System.out.println(new p048().run());
	}
	
	
	public String run() {
		BigInteger modulus = BigInteger.TEN.pow(10);
		BigInteger sum = BigInteger.ZERO;
		for (int i = 1; i <= 1000; i++)
			sum = sum.add(BigInteger.valueOf(i).modPow(BigInteger.valueOf(i), modulus));
		return sum.mod(modulus).toString();
	}
	
}
