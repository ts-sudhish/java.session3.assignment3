/**
 * 
 */
package sdh.java.session6;

/**
 * @author sudhi
 * 
 */
public class Assignment3Circle implements Assignment3InterfaceShape {

	@Override
	public void draw() {
		System.out.println("I am a circle");
	}

	@Override
	public void getArea() {
		System.out.println("Area of circle is pi*radius^2. where pi=22/7");
	}

}
