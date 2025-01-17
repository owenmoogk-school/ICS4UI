/*
 * Sphere problem
 * Chapter 7 Test
 * ICS 4UI
 * Owen Moogk
 */

public class Main {
	public static void main(String[] args) {
    Sphere mySphere = new Sphere();

    mySphere.setRadius(50);

    System.out.println(mySphere.getRadius());
    System.out.println(mySphere.getSurfaceArea());
    System.out.println(mySphere.getVolume());
  }
}