package motionless;

import Element.Permeability;
import Element.Sprite;

public class Bone extends MotionlessElement {
	private static final Sprite sprite = new Sprite('0',"bone.png");
	
	Bone(){
		
		super(sprite, Permeability.BLOCKING);
		
	}
}
