package hangman.model;

import hangman.exceptions.GameExceptions;

public interface GameScore {
	
	/**
	 * @pre calcular el puntaje a partir del número de letras correctas e incorrectas
	 * @param correctCount, número de letras correctas
	 * @param incorrectCount, número de letras incorrectas
	 * @throws GameExceptions 
	 */
	int calculateScore(int correctCount, int incorrectCount) throws GameExceptions;
}