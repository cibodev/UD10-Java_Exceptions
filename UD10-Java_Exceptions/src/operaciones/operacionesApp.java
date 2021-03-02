/**
 * 
 */
package operaciones;

/**
 * @author Christian Rivas Pottier
 *
 *
 * @date 2 mar. 2021
 *
 *
 */
public class operacionesApp {

	/**
	 * @param args
	 */
	public double Suma(double n1, double n2) {
		return n1+n2;
	}
	public double Resta(double n1, double n2) {
		return n1-n2;
	}
	public double Multiplicacion(double n1, double n2) {
		return n1*n2;
	}
	public double Division(double n1, double n2) {
		return n1/n2;
	}
	public double Residuo(double n1, double n2) {
		return n1%n2;
	}
	public double Potencia(double n, double e) {
		return Math.pow(n, e);
	}
	public double RaizCuadrada(double n) {
		return Math.sqrt(n);
	}
	public double RaizCubica(double n) {
		return Math.cbrt(n);
	}
/*	public static void main(String[] args) {
		
	}
*/

}
