package hangman.model;

import hangman.exceptions.GameExceptions;

public class BonusScore implements GameScore{
	
	/**
	 * @pre calcular el puntaje a partir del número de letras correctas (+10) e incorrectas (-5)
	 * @param correctCount, número de letras correctas
	 * @param incorrectCount, número de letras incorrectas
	 * @return puntaje calculado 
	 * @throws GameExceptions, se ingresan parametros invalidos
	 */
	public int calculateScore(int correctCount, int incorrectCount) throws GameExceptions {
		int initialScore=0;
		
		if (correctCount < 0 || incorrectCount < 0) {
			throw new GameExceptions("Parámetros inválidos");
		}
		else if((correctCount*10) < (incorrectCount*5)){
			initialScore=0;
		}
		else{
			initialScore=(correctCount*10)-(incorrectCount*5);
		}
		return initialScore;
	}
}
