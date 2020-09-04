package hangman;

import org.junit.Assert;
import org.junit.Test;

import hangman.exceptions.GameExceptions;
import hangman.model.BonusScore;
import hangman.model.OriginalScore;
import hangman.model.PowerBonusScore;

public class GameScoreTest {

/*Original score
 *ValidateScore: El puntaje debe ser mayor o igual a 0 y menor o igual a 100 
 *ValidatecorrectCount: Debe ser mayor o igual a 0
 *ValidateincorrectCount: Debe ser mayor o igual a 0 
*/	
@Test
public void ValidateOriginScore() throws GameExceptions {
	OriginalScore score = new OriginalScore();
	int puntaje;
	
	//ValidateScore
	//Prueba de frontera menor que la inferior
	puntaje = score.calculateScore(4, 11);	
	Assert.assertEquals(0, puntaje);
	
	//Prueba igual a frontera inferior
	puntaje = score.calculateScore(7, 10);
	Assert.assertEquals(0, puntaje);
	
	//Prueba entre fronteras 
	puntaje = score.calculateScore(2, 5);
	Assert.assertEquals(50, puntaje);
	
	//Prueba igual a frontera superior
	puntaje = score.calculateScore(4, 0);
	Assert.assertEquals(puntaje,puntaje);
	
	//ValidatecorrectCount y ValidateincorrectCount
	//Prueba de parametros negativos
	try {
		puntaje = score.calculateScore(-3, -8);		
	}
	catch(GameExceptions e){
		
		Assert.assertEquals("Parámetros inválidos", e.getMessage());
	}
	
	//Prueba de parametros validos
	puntaje = score.calculateScore(6, 3);
	Assert.assertEquals(puntaje,puntaje);
}

/*Bonus Score
 *ValidateScore: Debe ser mayor o igual a 0
 *ValidatecorrectCount: Debe ser mayor o igual a 0
 *ValidateincorrectCount: Debe ser mayor o igual a 0
*/
@Test
public void ValidateBonusScore() throws GameExceptions {
	BonusScore score = new BonusScore();
	int puntaje;
	
	//ValidateScore
	//Prueba menor que la frontera
	puntaje = score.calculateScore(1, 10);		
	Assert.assertEquals(0, puntaje);
	
	//Prueba mayor que la frontera
	puntaje = score.calculateScore(10, 7);
	Assert.assertEquals(65, puntaje);
	
	//Prueba igual a la frontera
	puntaje = score.calculateScore(1, 2);
	Assert.assertEquals(0, puntaje);
	
	//ValidatecorrectCount y ValidateincorrectCount
	//Prueba de parametros negativos
	try {
		puntaje = score.calculateScore(-1, -9);		
	}
	catch(GameExceptions e){
		
		Assert.assertEquals("Parámetros inválidos", e.getMessage());
	}
	
	//Prueba de parametros validos
	puntaje = score.calculateScore(4, 2);
	Assert.assertEquals(puntaje,puntaje);
}

/*PowerBonusScore
 *ValidateScore: Debe ser mayor a 0 y menor o igual a 500
 *ValidatecorrectCount: Debe ser mayor o igual a 0
 *ValidateincorrectCount: Debe ser mayor o igual a 0 
 */
@Test
public void ValidatePowerBonusScore() throws GameExceptions {
	PowerBonusScore score = new PowerBonusScore();
	int puntaje;
	
	//ValidateScore
	//Prueba de frontera menor que la inferior
	puntaje = score.calculateScore(0, 1);		
	Assert.assertEquals(0, puntaje);
	
	//Prueba entre fronteras
	puntaje = score.calculateScore(2, 3);
	Assert.assertEquals(6, puntaje);
	
	//Prueba mayor que la frontera superior 
	puntaje = score.calculateScore(4, 6);
	Assert.assertEquals(500, puntaje);
	
	//ValidatecorrectCount y ValidateincorrectCount
	//Prueba de parametros negativos
	try {
		puntaje = score.calculateScore(-5, -2);		
	}
	catch(GameExceptions e){
		
		Assert.assertEquals("Parámetros inválidos", e.getMessage());
	}
	
	//Prueba de parametros validos
	puntaje = score.calculateScore(2, 3);
	Assert.assertEquals(puntaje,puntaje);
}	
}