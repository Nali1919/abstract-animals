package org.lessons.animals;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Che animale vuoi vedere? Cane o Passerotto?");
		String scelta = s.nextLine();

		switch (scelta) {
		case "Cane":
			Cane c = new Cane();
			System.out.println(" Ecco il cane:");
			c.dormi();
			c.verso();
			c.mangia();
			c.nuota();
			break;

		case "Passerotto":

			Passerotto p = new Passerotto();
			System.out.println(" Ecco il passerotto:");
			p.dormi();
			p.verso();
			p.mangia();
			p.Vola();

			break;

		default:
			System.out.println("Hai inserito un animale che non esiste");
		}

	}

	public static void faiNuotare(Ivolante Animale) {
		Animale.Vola();
	}

	public static void faiVolare(Inuotante Animale) {
		Animale.nuota();
	}

}
