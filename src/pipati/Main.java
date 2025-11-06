package pipati;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner(System.in);
		Random rand = new Random();
		
		int pi = 0;
		int pa = 1;
		int ti = 2;
		int j;
		int m;
		int i = 0;
		int puntuacionj = 0;
		int puntuacionm = 0;
		
		System.out.println("Piedra = 0, papel = 1 y tijera = 2");
		teclado.nextLine();
		
		
		do {
			
			m = rand.nextInt(3);
			
			System.out.println("Introduce tu tirada");
			
		
			j = teclado.nextInt();
			teclado.nextLine();
		
			System.out.println("Número del jugador: " + j +", Número de la máquina: " + m);
			
			
			if (j == 0 && m == 1 ) {
			
			System.out.println("Gana la máquina");
			puntuacionm ++;
			i ++;
			}
			
			if (j == 1 && m == 2) {
			System.out.println("Gana la máquina");
			puntuacionm ++;
			i ++;
			}
			
			if (j == 2 && m == 0) {
			System.out.println("Gana la máquina");
			puntuacionm ++;
			i ++;
			}
			
			if (j == 0 && m == 2 ) {
			
			System.out.println("Gana el jugador");
			puntuacionj ++;
			i ++;
			}
			
			if (j == 1 && m == 0) {
			System.out.println("Gana el jugador");
			puntuacionj ++;
			i ++;
			}
			
			if (j == 2 && m == 1) {
			System.out.println("Gana el jugador");
			puntuacionj ++;
			i ++;
			}
			
			if (j == 0 && m == 0) {
			System.out.println("Empate");
			
			}
			
			if (j == 1 && m == 1) {
			System.out.println("Empate");
			
			}
			
			if (j == 2 && m == 2) {
			System.out.println("Empate");
			
			}
			
			
		} while (i < 3);	
		
			if (puntuacionj > 1) {
				System.out.println("----------------------------------");
				System.out.println("HA GANADO EL JUGADOR AL MEJOR DE 3");
				System.out.println("----------------------------------");
			}
			
			if (puntuacionm > 1) {
				System.out.println("----------------------------------");
				System.out.println("HA GANADO LA MÁQUINA AL MEJOR DE 3");
				System.out.println("----------------------------------");
			}
			
			}
		
		
			
		
	}


