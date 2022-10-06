package service;

import java.util.Random;
import java.util.Scanner;

import Entidades.ClasseAuxiliar;

public class CheckSorte {
	Random aleatorio = new Random();
	Scanner sc = new Scanner(System.in);
	ClasseAuxiliar classeAuxiliar = new ClasseAuxiliar();

	

	public void metodoPrincipal() {
		int numeroRamdom = aleatorio.nextInt(3);
		while (classeAuxiliar.getPalpite() != numeroRamdom) {
			if (classeAuxiliar.getPalpite() < numeroRamdom) {
				System.out.println("Seu palpite é menor que o numero sorteado.");
			}
			
			if (classeAuxiliar.getPalpite() > numeroRamdom) {
				System.out.println("Seu palpite é maior que o numero sorteado.");
			}
			
			System.out.println("Digite um numero para ser sorteado: ");
			classeAuxiliar.setPalpite(sc.nextInt());
		}
		System.out.println("Parabéns, você acertou o numero: (" + numeroRamdom + ") seu palpite foi: ( "
				+ classeAuxiliar.getPalpite() + ")");
	}

	
}
