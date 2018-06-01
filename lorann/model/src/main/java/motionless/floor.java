package motionless;

import Element.Permeability;
import Element.Sprite;

public class floor extends MotionlessElement{
	private static final Sprite SPRITE = new Sprite('3', "floor.png");

    floor() {
        super(SPRITE, Permeability.PENETRABLE);
    }
}
