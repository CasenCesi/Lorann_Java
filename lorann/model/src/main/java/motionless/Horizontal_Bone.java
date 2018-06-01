package motionless;

import Element.Permeability;
import Element.Sprite;

public class Horizontal_Bone extends MotionlessElement{
	private static final Sprite SPRITE = new Sprite('1', "Horizontal_bone.png");

    
    Horizontal_Bone() {
        super(SPRITE, Permeability.BLOCKING);
    }
}
