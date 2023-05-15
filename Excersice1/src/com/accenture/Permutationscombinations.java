package com.accenture;
import java.util.Scanner;
public class Permutationscombinations 
{
	public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        System.out.print("Enter the value of r: ");
        int r = scanner.nextInt();
        int nFactorial = factorial(n);
        int rFactorial = factorial(r);
        int nMinusRFactorial = factorial(n - r);

        int nCr = nFactorial / (rFactorial * nMinusRFactorial);
        int nPr = nFactorial / nMinusRFactorial;

        System.out.println("Permutations of " + n + " and " + r + " = " + nPr);
        System.out.println("Combinations of " + n + " and " + r + " = " + nCr);
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

