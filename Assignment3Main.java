/**
 * 
 */
package sdh.java.session6;

/**
 * @author sudhi
 * 
 */
public class Assignment3Main {

	public static void main(String[] args) {
		Assignment3InterfaceShape sh = new Assignment3Square();
		sh.draw();
		sh.getArea();

		sh = new Assignment3Circle();
		sh.draw();
		sh.getArea();
	}

}
