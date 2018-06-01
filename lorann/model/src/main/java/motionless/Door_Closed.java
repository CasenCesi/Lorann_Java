package motionless;

import Element.Permeability;
import Element.Sprite;

public class Door_Closed extends MotionlessElement{

private static final Sprite sprite = new Sprite('5',"gate_closed.png");
	
	Door_Closed(){
		
		super(sprite, Permeability.BLOCKING);
		
	}
	
}
