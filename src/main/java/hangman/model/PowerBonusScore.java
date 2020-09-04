package hangman.model;

import hangman.exceptions.GameExceptions;


public class PowerBonusScore implements GameScore{
	
	/**
	 * @pre calcular el puntaje a partir del número de letras correctas (+5**i) e incorrectas (-8)
	 * @param correctCount, número de letras correctas
	 * @param incorrectCount, número de letras incorrectas
	 * @return puntaje calculado 
	 * @throws GameExceptions, se ingresan parametros invalidos
	 */
	public int calculateScore(int correctCount, int incorrectCount) throws GameExceptions {
		int initialScore=0;
		int finalScore;
		
		if (correctCount < 0 || incorrectCount < 0) {
			throw new GameExceptions("Parámetros inválidos");
		}
		else{
			for(int i=1; i<=correctCount; i++) {
				initialScore+=Math.pow(5, i);
			}
			finalScore=initialScore-(incorrectCount*8);
			if(finalScore > 500) {
				finalScore=500;
			}
			else if(initialScore < (incorrectCount*8)){
				finalScore=0;
			}
		}
		return finalScore;
	}

}
