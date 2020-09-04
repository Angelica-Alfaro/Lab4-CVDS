### Integrantes:

* Maria Angélica Alfaro Fandiño
 
* César Fernando Ortiz Rocha

## Escuela Colombiana de Ingeniería

## Procesos de Desarrollo de Software

## Desarrollo Dirigido por Pruebas + DIP + DI + Contenedores Livianos


Para este taller se va a trabajar sobre el juego del ahorcado.

El sistema actual de puntuación del juego comienza en 100 puntos y va
descontando 10 puntos cada vez que se propone una letra incorrecta.

Algunos usuarios han propuesto diferentes esquemas para realizar la
puntuación, los cuales se describen a continuación:

* OriginalScore: 
    * Es el esquema actual, se inicia con 100 puntos.
    * No se bonifican las letras correctas.
    * Se penaliza con 10 puntos con cada letra incorrecta.
    * El puntaje minimo es 0.

* BonusScore: 
    * El juego inicia en 0 puntos.
    * Se bonifica con 10 puntos cada letra correcta.
    * Se penaliza con 5 puntos cada letra incorrecta.
    * El puntaje mínimo es 0
    
* PowerBonusScore:
    * El juego inicia en 0 puntos.
    * La $i-ésima$ letra correcta se bonifica con $5^i$.
    * Se penaliza con 8 puntos cada letra incorrecta.
    * El puntaje mínimo es 0
    * Si con las reglas anteriores sobrepasa 500 puntos, el puntaje es
      500.

Lo anterior, se traduce en el siguiente modelo, donde se aplica el
principio de inversión de dependencias:

![](img/model.png)

## Clases de equivalencia

* ***Original score*** \
    *ValidateScore: El puntaje debe ser mayor o igual a 0 y menor o igual a 100 
    *ValidatecorrectCount: Debe ser mayor o igual a 0
    *ValidateincorrectCount: Debe ser mayor o igual a 0

* ***Bonus Score*** \
    *ValidateScore: Debe ser mayor o igual a 0
    *ValidatecorrectCount: Debe ser mayor o igual a 0
    *ValidateincorrectCount: Debe ser mayor o igual a 0

* ***PowerBonusScore*** \
    * ValidateScore: Debe ser mayor a 0 y menor o igual a 500
    * ValidatecorrectCount: Debe ser mayor o igual a 0
    * ValidateincorrectCount: Debe ser mayor o igual a 0 


