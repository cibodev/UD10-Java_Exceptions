/**
 * 
 */
package main;

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
		try {
			throw new CustomError(100);
		} catch (CustomError e) {
			System.out.println(e.getMessage());
		}
	}

}
