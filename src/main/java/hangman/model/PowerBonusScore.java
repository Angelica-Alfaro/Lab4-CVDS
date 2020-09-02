package hangman.model;

public class PowerBonusScore implements GameScore{
	
	/**
	 * @pre calcular el puntaje a partir del número de letras correctas (+5**i) e incorrectas (-8)
	 * @param correctCount, número de letras correctas
	 * @param incorrectCount, número de letras incorrectas
	 * @return puntaje calculado 
	 * @throws GameExceptions, se ingresan parametros invalidos
	 */
	public int calculateScore(int correctCount, int incorrectCount) {
		
		return 3;
	}

}
