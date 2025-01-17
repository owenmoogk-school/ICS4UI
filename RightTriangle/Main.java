/*
 * Right triangle problem
 * Chapter 7 Test
 * ICS 4UI
 * Owen Moogk
 */

public class Main {
	public static void main(String[] args) {
    RightTriangle myTri = new RightTriangle();

    myTri.setBase(50);
    myTri.setHeight(25);

    System.out.println(myTri.getBase());
    System.out.println(myTri.getHeight());
    System.out.println(myTri.getArea());
  }
}