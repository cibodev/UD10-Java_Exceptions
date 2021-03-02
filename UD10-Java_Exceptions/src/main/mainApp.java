/**
 * 
 */
package main;

import javax.swing.JOptionPane;

import models.CustomError;

import operaciones.operacionesApp;

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
		String[] s= {"Suma", "Resta", "Multiplicacion", "Division", "Residuo", "Potencia", "Raiz Cuadrada", "Raiz Cubica"};
		int key=JOptionPane.showOptionDialog(null, "Seleccione la operacion que quiere hacer", "Selector de operaciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, s, args);
		operacionesApp op = new operacionesApp();
		//double n1=0;double n2=0;double res=0;
		
		switch (key) {
		case 0:
			try {
				int n1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer numero"));
				int n2=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo numero"));
				JOptionPane.showMessageDialog(null, n1+" + "+n2+" = "+op.Suma(n1, n2));
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Error: Lo que has introducido no es un numero valido");
			}
			break;
		case 1:
			try {
				int n1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer numero"));
				int n2=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo numero"));
				JOptionPane.showMessageDialog(null, n1+" - "+n2+" = "+op.Resta(n1, n2));
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Error: Lo que has introducido no es un numero valido");
			}
			break;
		case 2:
			try {
				int n1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer numero"));
				int n2=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo numero"));
				JOptionPane.showMessageDialog(null, n1+" * "+n2+" = "+op.Multiplicacion(n1, n2));
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Error: Lo que has introducido no es un numero valido");
			}
			break;
		case 3:
			try {
				int n1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer numero"));
				int n2=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo numero"));
				JOptionPane.showMessageDialog(null, n1+" / "+n2+" = "+op.Division(n1, n2));
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Error: Lo que has introducido no es un numero valido");
			}
			break;
		case 4:
			try {
				int n1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer numero"));
				int n2=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo numero"));
				JOptionPane.showMessageDialog(null, n1+" % "+n2+" = "+op.Residuo(n1, n2));
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Error: Lo que has introducido no es un numero valido");
			}
			break;
		case 5:
			try {
				int n1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero"));
				int n2=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el exponente"));
				JOptionPane.showMessageDialog(null, n1+" ^ "+n2+" = "+op.Potencia(n1, n2));
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Error: Lo que has introducido no es un numero valido");
			}
			break;
		case 6:
			try {
				int n1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero"));
				JOptionPane.showMessageDialog(null, "Raiz cuadrada de "+n1+" = "+op.RaizCuadrada(n1));
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Error: Lo que has introducido no es un numero valido");
			}
			break;
		case 7:
			try {
				int n1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero"));
				JOptionPane.showMessageDialog(null, "Raiz cubica de "+n1+" = "+op.RaizCubica(n1));
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Error: Lo que has introducido no es un numero valido");
			}
			break;

		default:
			break;
		}
	}
}
