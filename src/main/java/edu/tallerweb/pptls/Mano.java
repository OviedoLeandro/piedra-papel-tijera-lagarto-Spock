package edu.tallerweb.pptls;

/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {

	private Forma mano;

	/**
	 * Toda Mano debe crearse con una forma dada, que será la que determine su
	 * condición en el juego.
	 * 
	 * @param forma,
	 *            la Forma que adopta la Mano.
	 */
	public Mano(final Forma forma) {
		this.mano = forma;
	}

	/**
	 * Evaluará el resultado de la partida según las reglas del juego.
	 * 
	 * @param otra,
	 *            la otra Mano.
	 * @return un Resultado, de acuerdo al estado del juego.
	 */
	public Resultado jugarCon(final Mano otra) {
		// GANAR
		if (this.mano == Forma.TIJERA && otra.mano == Forma.PAPEL)// Tijera corta papel
			return Resultado.GANA;
		if (this.mano == Forma.PAPEL && otra.mano == Forma.PIEDRA)// Papel cubre piedra
			return Resultado.GANA;
		if (this.mano == Forma.PIEDRA && otra.mano == Forma.LAGARTO)// Piedra aplasta lagarto
			return Resultado.GANA;
		if (this.mano == Forma.LAGARTO && otra.mano == Forma.SPOCK)// Lagarto envenena Spock
			return Resultado.GANA;
		if (this.mano == Forma.SPOCK && otra.mano == Forma.TIJERA)// Spock destroza tijera
			return Resultado.GANA;
		if (this.mano == Forma.TIJERA && otra.mano == Forma.LAGARTO)// Tijera decapita lagarto
			return Resultado.GANA;
		if (this.mano == Forma.LAGARTO && otra.mano == Forma.PAPEL)// Lagarto come papel
			return Resultado.GANA;
		if (this.mano == Forma.PAPEL && otra.mano == Forma.SPOCK)// Papel refuta Spock
			return Resultado.GANA;
		if (this.mano == Forma.SPOCK && otra.mano == Forma.PIEDRA)// Spock vaporiza piedra
			return Resultado.GANA;
		if (this.mano == Forma.PIEDRA && otra.mano == Forma.TIJERA)// Piedra aplasta tijera
			return Resultado.GANA;

		// PERDER
		if (otra.mano == Forma.TIJERA && otra.mano == Forma.PAPEL)// Tijera corta papel
			return Resultado.PIERDE;
		if (otra.mano == Forma.PAPEL && otra.mano == Forma.PIEDRA)// Papel cubre piedra
			return Resultado.PIERDE;
		if (otra.mano == Forma.PIEDRA && otra.mano == Forma.LAGARTO)// Piedra aplasta lagarto
			return Resultado.PIERDE;
		if (otra.mano == Forma.LAGARTO && otra.mano == Forma.SPOCK)// Lagarto envenena Spock
			return Resultado.PIERDE;
		if (otra.mano == Forma.SPOCK && otra.mano == Forma.TIJERA)// Spock destroza tijera
			return Resultado.PIERDE;
		if (otra.mano == Forma.TIJERA && otra.mano == Forma.LAGARTO)// Tijera decapita lagarto
			return Resultado.PIERDE;
		if (otra.mano == Forma.LAGARTO && otra.mano == Forma.PAPEL)// Lagarto come papel
			return Resultado.PIERDE;
		if (otra.mano == Forma.PAPEL && otra.mano == Forma.SPOCK)// Papel refuta Spock
			return Resultado.PIERDE;
		if (otra.mano == Forma.SPOCK && otra.mano == Forma.PIEDRA)// Spock vaporiza piedra
			return Resultado.PIERDE;
		if (otra.mano == Forma.PIEDRA && this.mano == Forma.TIJERA)// Piedra aplasta tijera
			return Resultado.PIERDE;

		// EMPATAR
		return Resultado.EMPATA;

	}

}
