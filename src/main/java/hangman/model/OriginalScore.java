package hangman.model;

import hangman.exceptions.GameExceptions;

public class OriginalScore implements GameScore{
	
	/**
	 * @pre calcular el puntaje a partir del número de letras incorrectas (-10)
	 * @param correctCount, número de letras correctas
	 * @param incorrectCount, número de letras incorrectas
	 * @return 
	 * @throws GameExceptions, se ingresan parametros invalidos
	 */
	public int calculateScore(int correctCount, int incorrectCount) throws GameExceptions {
		int initialScore=100;
		
		if (correctCount < 0 || incorrectCount < 0) {
			throw new GameExceptions("Parámetros inválidos");
		}
		else if((initialScore-incorrectCount*10) < 0){
			initialScore=0;
		}
		else{
			initialScore-=incorrectCount*10;
		}
		return initialScore;
	}

}