package Element;

import java.util.Observable;

/**
 * 
 * <h1>ILevel Interface</h1>
 * This interface implements the Level Class.
 *
 */

public interface ILevel {

	int getWidth();
	
	int getHeight();
	
	IElement getOnTheLevelXY(int x,int y);
	
	void setMobileHasChanged();
	
	Observable getObservable();
	
}
