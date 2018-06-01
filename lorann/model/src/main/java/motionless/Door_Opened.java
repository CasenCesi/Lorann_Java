package motionless;

import Element.Permeability;
import Element.Sprite;

public class Door_Opened extends MotionlessElement{

private static final Sprite sprite = new Sprite('4',"gate_open.png");
	
	Door_Opened(){
		
		super(sprite, Permeability.PENETRABLE);
		
	}
	
}
