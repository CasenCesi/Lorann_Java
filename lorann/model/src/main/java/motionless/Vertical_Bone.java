package motionless;

import Element.Permeability;
import Element.Sprite;

public class Vertical_Bone extends MotionlessElement{
	private static final Sprite SPRITE = new Sprite('2', "purse.png");

    Vertical_Bone() {
        super(SPRITE, Permeability.BLOCKING);
	
}
