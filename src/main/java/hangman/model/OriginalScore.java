package hangman.model;

public class OriginalScore implements GameScore{
	
	/**
	 * @pre calcular el puntaje a partir del número de letras incorrectas (-10)
	 * @param correctCount, número de letras correctas
	 * @param incorrectCount, número de letras incorrectas
	 * @return puntaje calculado 
	 */
	public int calculateScore(int correctCount, int incorrectCount) throws Exception {
		
		return 3;
	}

}