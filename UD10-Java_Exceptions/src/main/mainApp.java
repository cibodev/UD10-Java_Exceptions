/**
 * 
 */
package main;


import javax.swing.JOptionPane;
import models.Password;

/**
 * @author Christian Rivas Pottier
 *
 *
 * @date 1 mar. 2021
 *
 *
 */
public class mainApp {

	/**
	 * @param args
	 * @throws CustomError 
	 */
	public static void main(String[] args) {
		int lgar=0;
		int lgpass=0;
		try {
			lgar=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de contraseñas que quiere generar"));
			lgpass=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la longitud de cada una de las contraseñas"));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Lo que ha introducido no es un numero");
		}
		Password[] pass = new Password[lgar];
		boolean[] passbol = new boolean[pass.length];
		for (int i = 0; i < pass.length; i++) {
			pass[i]=new Password(lgpass);
			passbol[i]=pass[i].esFuerte(pass[i].getPassword());
			System.out.println(pass[i].getPassword()+" "+passbol[i]);
		}
	}
}
