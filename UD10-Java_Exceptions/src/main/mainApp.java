/**
 * 
 */
package main;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;


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
	 */
	public static void main(String[] args) {
		Random r = new Random();
		int n = r.nextInt(500)+1;
		int nuser =0;
		int c=0;
		try {
			c=NumeroRandom(n, nuser);
		} catch (Exception InputMismatchExceptione) {
			System.out.println("Error: Da la casualidad que lo que has introducido no es un numero entero asi que pierdes y ya por listo");
		}
		
		
		if (c<2 && c!=0) {
			System.out.println("Lo has acertado, y ademas a la primera, no esta mal");
		} else {
			if (c<6 && c!=0) {
				System.out.println("Muy bien, has acertado y no has tardado mucho, ni tan mal");
			} else {
				if (c>=6 && c!=0) {
					System.out.println("Has acertado pero pa lo que te ha costao como si no hubieses ganado oye a ver si espabilamos");
				}
			}
		}
	}
	
	
	public static int NumeroRandom (int r, int n) {
		Scanner scan = new Scanner(System.in);
		int c=0;
		System.out.println("Introduzca el numero que cree que es");
		n=scan.nextInt();
		c++;
		do {
			if (n>r) {
				System.out.println("Tas pasao, intenta un numero mas bajo");
				n=scan.nextInt();
				c++;
			} else {
				System.out.println("Demasiado bajo, intenta un numero mas alto");
				n=scan.nextInt();
				c++;
			}
		}while(n!=r);
		return c;
	}

}
