package hangman.model;

public class BonusScore implements GameScore{
	
	/**
	 * @pre calcular el puntaje a partir del número de letras correctas (+10) e incorrectas (-5)
	 * @param correctCount, número de letras correctas
	 * @param incorrectCount, número de letras incorrectas
	 * @return puntaje calculado 
	 */
	public int calculateScore(int correctCount, int incorrectCount) {
		
		return 3;
	}
}
