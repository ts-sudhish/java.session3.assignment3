/**
 * 
 */
package sdh.java.session6;

/**
 * @author sudhi
 * 
 */
public class Assignment3Square implements Assignment3InterfaceShape {

	@Override
	public void draw() {
		System.out.println("I am a square");
	}

	@Override
	public void getArea() {
		System.out.println("Area of square is side^2");
	}

}
