package org.lessons.animals;

public class Passerotto extends Animale implements Ivolante {

	@Override
	public void dormi() {
		System.out.println("Il passerotto dorme");
		
	}

	@Override
	public void verso() {
		System.out.println("Il passerotto fa chip chip");
		
	}

	@Override
	public void Vola() {
		System.out.println("Il passerotto vola nel cielo blu");
		
	}
	

}
