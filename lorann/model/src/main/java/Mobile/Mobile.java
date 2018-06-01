import java.awt.Point;

import Element.Element;
import Element.ILevel;
import Element.Permeability;
import Element.Sprite;
import showboard.IBoard;
import showboard.ISquare;

package Mobile;

abstract class Mobile extends Element implements IMobile {

	private Point position;
	
	private boolean alive = true;
	
	private ILevel level;
	
	private IBoard board;
	
	Mobile(final Sprite sprite, final ILevel level, final Permeability permeability){
		
		super(sprite, permeability);
		this.setLevel(level);
		this.position = new Point();
		
	}
	
	Mobile(final int x, final int y , final Sprite sprite , final ILevel level, final Permeability permeability){
		
		this(sprite, level,permeability);
		this.setX(x);
		this.setY(y);
		
	}
	
	@override
	public void MoveUp() {
		this.setY(this.getY() - 1);
		this.setHasMoved();
	}

	@Override
    public void moveLeft() {
        this.setX(this.getX() - 1);
        this.setHasMoved();
    }
	
	@Override
    public void moveDown() {
        this.setY(this.getY() + 1);
        this.setHasMoved();
    }
	
	 @Override
	    public void moveRight() {
	        this.setX(this.getX() + 1);
	        this.setHasMoved();
	    }
	 
	 @Override
	    public void doNothing() {
	        this.setHasMoved();
	    }
	 
	 private void setHasMoved() {
	        this.getLevel().setMobileHasChanged();
	    }
	 
	 @Override
	    public final int getX() {
	        return this.getPosition().x;
	    }.
	    
	    public final void setX(final int x) {
	        this.getPosition().x = x;
	       
	        }
	        
	    @Override
	    public final int getY() {
	        return this.getPosition().y;
	    }
	    
	    public final void setY(final int y) {
	        this.getPosition().y = (y + this.getLevel().getHeight()) % this.getLevel().getHeight();
	        
}
