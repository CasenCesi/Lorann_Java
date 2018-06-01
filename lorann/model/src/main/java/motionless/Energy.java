package motionless;

import Element.Permeability;
import Element.Sprite;

public class Energy extends MotionlessElement{
private static final Sprite sprite = new Sprite('7',"crystal_ball.png");
	
	Energy(){
		
		super(sprite, Permeability.PENETRABLE);
		
	}
}
