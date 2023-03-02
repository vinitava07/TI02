import java.util.*;

import java.util.Scanner;

public class SomaDoisNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1,num2,total;
		System.out.println("Digite um número");
		num1 = sc.nextInt();
		System.out.println("Digite outro número");
		num2 = sc.nextInt();
		total = num1+num2;
		System.out.println("A soma dos números é: "+total);
		sc.close();
		System.out.print("teste");

		

	}

}
