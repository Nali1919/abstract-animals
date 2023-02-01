package org.lessons.animals;

public class Cane extends Animale implements Inuotante {

	@Override
	public void dormi() {
		System.out.println("Il cane sta dormendo");

	}

	@Override
	public void verso() {
		System.out.println("Il cane fa bau!");

	}

	@Override
	public void nuota() {
		System.out.println("Il cane nuota nel mare aperto");
		
	}

}
