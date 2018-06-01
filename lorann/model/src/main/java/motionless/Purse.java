package motionless;

import Element.Permeability;
import Element.Sprite;

public class Purse extends MotionlessElement{
	private static final Sprite SPRITE = new Sprite('6', "purse.png");

    /**
     * Instantiates a new macadam.
     */
    Purse() {
        super(SPRITE, Permeability.PENETRABLE);
    }
}
