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
		    faiNuotare(c);
			break;

		case "Passerotto":

			Passerotto p = new Passerotto();
			System.out.println(" Ecco il passerotto:");
			p.dormi();
			p.verso();
			p.mangia();
			faiVolare(p);

			break;

		default:
			System.out.println("Hai inserito un animale che non esiste");
		}
		
	}
	public static void faiVolare(Ivolante animale) {
		animale.Vola();
	}

	public static void faiNuotare(Inuotante animale) {
		animale.nuota();
	}

}
