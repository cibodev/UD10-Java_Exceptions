/**
 * 
 */
package models;

/**
 * @author Christian Rivas Pottier
 *
 *
 * @date 2 mar. 2021
 *
 *
 */
public class CustomError extends Exception{
	private int cError;

	public CustomError(int cError) {
		super();
		this.cError = cError;
	}
	
	public String getMessage() {
		String mensaje="";
		switch (cError) {
		case 100:
			System.out.println("Error de ejemplo");
			break;

		default: 
			System.out.println("Error desconocido");
			break;
		}
		return mensaje;
	}
	
	
}
