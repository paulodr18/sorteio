package Sorteio;

import java.util.Scanner;

import Entidades.ClasseAuxiliar;
import service.CheckSorte;

public class Sorte {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ClasseAuxiliar classeAuxiliar = new ClasseAuxiliar();
		CheckSorte checkSorte = new CheckSorte();

		System.out.println("Digite um numero para ser sorteado: ");
		int chute = sc.nextInt();

		classeAuxiliar.setPalpite(chute);
		checkSorte.metodoPrincipal();

	}

}
