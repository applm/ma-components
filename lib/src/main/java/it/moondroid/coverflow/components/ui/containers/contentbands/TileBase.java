package it.moondroid.coverflow.components.ui.containers.contentbands;

/**
 * @author Martin Appl
 * 
 * Base class for Content band datamodel. Extend to add data specific for your tiles and their behavior. 
 * This class includes data needed for positioning of tiles inside container.
 */
public class TileBase {
	
	private int id;
	
	private int x;
	private int y;
	private int z;
	private int width;
	private int height;
	
	
	public int getX(){
		return x;
	}
	
	public int getXRight(){
		return getX() + getWidth();
	}
	
	public int getY(){		
		return y;
	}
	
	public int getZ(){
		return z;
	}
	
	public int getWidth(){
		return width;
	}
	
	public int getHeight(){
		return height;
	}
	
	public int getId(){
		return id;
	}

	public void setId(String id) {
		this.id = Integer.parseInt(id);
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public void setX(String x) {
		this.x = Integer.parseInt(x);
	}
	
	public void setX(int x) {
		this.x = x;
	}

	public void setY(String y) {
		this.y = Integer.parseInt(y);
	}
	
	public void setY(int y) {
		this.y = y;
	}

	public void setZ(String z) {
		this.z = Integer.parseInt(z);
	}
	
	public void setZ(int z) {
		this.z = z;
	}

	public void setWidth(String width) {
		this.width = Integer.parseInt(width);
	}
	
	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(String height) {
		this.height = Integer.parseInt(height);
	}
	
	public void setHeight(int height) {
		this.height = height;
	}

	

}
