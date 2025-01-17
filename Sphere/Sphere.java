// sphere class

public class Sphere {
	private double radius;

/**
	 * constructor
	 * pre: none
	 * post: created sphere object with a radius of 1.
	 */
	public Sphere() {
		this.radius = 1;
	}
	
  /**
	 * sets the radius of the sphere
	 * pre: double newRadius
	 * post: this.radius updated to new radius.
	 */
	public void setRadius(double newRadius){
	 	this.radius = newRadius;
	}

  /**
	 * gets the radius of triangle
	 * pre: none
	 * post: returns the radius.
	 */
  public double getRadius(){
	 	return(this.radius);
	}

  /**
	 * gets the surface area of the sphere
	 * pre: none
	 * post: returns the surface area.
	 */
	public double getSurfaceArea() {
	 	return(4.0 * Math.PI * Math.pow(this.radius, 2));
	}

  /**
	 * gets the volume of sphere
	 * pre: none
	 * post: returns the volume.
	 */
  public double getVolume() {
	 	return((4.0 / 3.0) * Math.PI * Math.pow(this.radius, 3));
	}

}