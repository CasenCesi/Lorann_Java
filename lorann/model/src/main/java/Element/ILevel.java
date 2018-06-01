package Element;

import java.util.Observable;

public interface ILevel {

	int getWidth();
	
	int getHeight();
	
	IElement getOnTheLevelXY(int x,int y);
	
	void setMobileHasChanged();
	
	Observable getObservable();
	
}
