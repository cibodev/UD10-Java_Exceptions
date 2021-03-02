/**
 * 
 */
package main;

import java.util.Random;

import models.CustomError;

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
		int n=nRandom();
		try {
			if (n%2==0) {
				throw new CustomError(100);
			} else {
				throw new CustomError(101);
			}
		} catch (CustomError e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static int nRandom(){
		Random r = new Random();
		int n=r.nextInt(1000);
		return n;
	}

}
