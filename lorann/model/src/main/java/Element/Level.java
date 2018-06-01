package Element;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Observable;

import motionless.MotionlessElementFactory;

public class Level extends Observable implements ILevel {

	/** The width. */
	private int width;
	
	/** The height*/
	private int height;
	
	/** The element on the map*/
	private IElement[][] onTheMap;
	
	/**
	 * Loads a new map with the content of the file filename.
	 * 
	 * @param filename
	 * The file name where the map of the level is.
	 * @throws IOException
	 * Signals that an I/O exception has occured.
	 */
	
	Level(final String filename) throws IOException{
		
		super();
		this.loadFile(filename);
		
	}
	
	/**
	 * Reads the file filename line by line to create the new map.
	 */
	 private void loadFile(final String fileName) throws IOException {
	        final BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
	        String line;
	        int y = 0;
	        line = buffer.readLine();
	        this.setWidth(Integer.parseInt(line));
	        line = buffer.readLine();
	        this.setHeight(Integer.parseInt(line));
	        this.onTheMap = new IElement[this.getWidth()][this.getHeight()];
	        line = buffer.readLine();
	        while (line != null) {
	            for (int x = 0; x < line.toCharArray().length; x++) {
	                this.setOnTheMapXY(MotionlessElementFactory.getFromFileSymbol(line.toCharArray()[x]), x, y);
	            }
	            line = buffer.readLine();
	            y++;
	        }
	        buffer.close();
	    }

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public IElement getOnTheMap(final int x, final int y) {
		return this.onTheMap[x][y];
	}

	public void setOnTheMap(int x,int y) {
		this.onTheMap[x][y] = onTheMap[x][y];
	}
	
	 @Override
	    public final void setMobileHasChanged() {
	        this.setChanged();
	        this.notifyObservers();
	    }
	 
	 @Override
	    public Observable getObservable() {
	        return this;
	    }
	
}
