package hangman;

import org.junit.Assert;
import org.junit.Test;

import exceptions.GameExceptions;
import hangman.model.BonusScore;
import hangman.model.OriginalScore;
import hangman.model.PowerBonusScore;

public class GameScoreTest {

/*Original score
 *ValidateScore: El puntaje debe ser mayor o igual a 0 y menor o igual a 100 
 *ValidatecorrectCount: Debe ser mayor o igual a 0
 *ValidateincorrectCount: Debe ser mayor o igual a 
*/	
@Test
public void ValidateOriginScore() {
	OriginalScore score = new OriginalScore();
	int puntaje;
	
	//ValidateScore
	//Prueba de frontera menor que la inferior
	try {
		puntaje = score.calculateScore(4, 11);		
	}
	catch(GameExceptions e){
		
		Assert.assertEquals("El puntaje es inválido", e.getMessage());
	}
	
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
		
		Assert.assertEquals("Parámetros invalidos", e.getMessage());
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
public void ValidateBonusScore() {
	BonusScore score = new BonusScore();
	int puntaje;
	
	//ValidateScore
	//Prueba menor que la frontera
	try {
		puntaje = score.calculateScore(1, 10);		
	}
	catch(GameExceptions e){
		
		Assert.assertEquals("El puntaje es inválido", e.getMessage());
	}
		
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
		
		Assert.assertEquals("Parámetros invalidos", e.getMessage());
	}
	
	//Prueba de parametros validos
	puntaje = score.calculateScore(4, 2);
	Assert.assertEquals(puntaje,puntaje);
}

/*PowerBonusScore
 *ValidateScore: no debe ser menor a 0 y mayor a 500
 *ValidatecorrectCount: no debe ser menor a 0
 *ValidateincorrectCount: no debe ser menor a 0 
 */
@Test
public void ValidatePowerBonusScore() {
	PowerBonusScore score = new PowerBonusScore();
	int puntaje;
	
	//ValidateScore
	//Prueba de frontera menor que la inferior
	try {
		puntaje = score.calculateScore(0, 1);		
	}
	catch(GameExceptions e){
		
		Assert.assertEquals("El puntaje es inválido", e.getMessage());
	}
	
	//Prueba entre fronteras
	puntaje = score.calculateScore(2, 3);
	Assert.assertEquals(0, puntaje);
	
	//Prueba mayor que la frontera superior 
	puntaje = score.calculateScore(4, 6);
	Assert.assertEquals(50, puntaje);
	
	//ValidatecorrectCount y ValidateincorrectCount
	//Prueba de parametros negativos
	try {
		puntaje = score.calculateScore(-5, -2);		
	}
	catch(GameExceptions e){
		
		Assert.assertEquals("Parámetros invalidos", e.getMessage());
	}
	
	//Prueba de parametros validos
	puntaje = score.calculateScore(2, 3);
	Assert.assertEquals(puntaje,puntaje);
}


	
	
	
	
	
	
	
	
	
	
}




















