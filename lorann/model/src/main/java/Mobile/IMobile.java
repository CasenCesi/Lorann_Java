package Mobile;

<<<<<<< HEAD
import java.awt.Point;
=======
/**
 * 
 * Interface used to call the execution of Mobile Class
 * 
 */
public interface IMobile {
>>>>>>> master

import Element.IElement;
import showboard.IPawn;

public interface IMobile extends IPawn, IElement {

   void moveUp();

   void moveLeft();

   void moveDown();

   void moveRight();

   void doNothing();

   @Override
   int getX();

   @Override
   int getY();

   Boolean isAlive();

   @Override
   Point getPosition();
	
}
