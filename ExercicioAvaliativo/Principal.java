package ExercicioAvaliativo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Digite o nome e a idade do Colaborador: ");
		Funcionario thomas = new Funcionario(scn.next(), scn.nextInt());
		
		
		try {
			System.out.println(thomas.calcularIdade());
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}


		System.out.println("Digite o nome e a idade do Cliente: ");
		Cliente wallison = new Cliente(scn.next(), scn.nextInt());
		
		
		
		try {
			System.out.println(wallison.calcularIdade());
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

		scn.close();
	}

}
