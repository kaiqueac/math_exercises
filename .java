package exercicios_java1;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, pi, triangulo, circulo, trapezio, quadrado, retangulo;
        
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        
        pi = 3.14159;
        triangulo = A * C / 2.0;
        circulo =  pi * C * C;
        trapezio = (A + B)  / 2.0 * C;
        quadrado = B * B;
        retangulo = A * B;
        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("TRIANGULO: %.3f%n", circulo);
        System.out.printf("TRIANGULO: %.3f%n", trapezio);
        System.out.printf("TRIANGULO: %.3f%n", quadrado);
        System.out.printf("TRIANGULO: %.3f%n", retangulo);   
        sc.close();
	}

}

