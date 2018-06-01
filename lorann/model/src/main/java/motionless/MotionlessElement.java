package motionless;

import Element.Element;
import Element.Permeability;
import Element.Sprite;

abstract class MotionlessElement extends Element {
	
	MotionlessElement(final Sprite sprite, final Permeability permeability) {
        super(sprite, permeability);
    }
}
