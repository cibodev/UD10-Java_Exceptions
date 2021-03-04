/**
 * 
 */
package models;

import java.util.Iterator;
import java.util.Random;

/**
 * @author Christian Rivas Pottier
 *
 *
 * @date 4 mar. 2021
 *
 *
 */
public class Password {
	private int longitud;
	private String password;
	
//METODOS
	public boolean esFuerte(String pass) {
		String[] strpass = pass.split("");
		int cmaj=0;
		int cmin=0;
		int cn=0;
		for (int i = 0; i < strpass.length; i++) {
			if (strpass[i].matches("[A-Z]")){
				cmaj++;
			}
			if (strpass[i].matches("[a-z]")) {
				cmin++;
			} 
			if (strpass[i].matches("[0-9]")) {
				cn++;
			}
		}
		return (cmaj>=2 && cmin>=1 && cn>=5)?true:false;
	}
	
	public String generarPassword(int lg) {
		Random r = new Random();
		String pass="";
		char[] charar = new char[lg];
		//con esta cadena de ifs lo que hago es que los numeros tengan una posibilidad de 50% de aparecer, las mayusculas un 37,5% y las minusculas un 12,5%
		for (int i = 0; i < charar.length; i++) {
			if (r.nextBoolean()) {
				charar[i]=(char) ((char) r.nextInt(10)+48);
			} else {
				if (r.nextBoolean()) {
					charar[i]=(char) ((char) r.nextInt(26)+'A');
				} else {
					if (r.nextBoolean()) {
						charar[i]=(char) ((char) r.nextInt(26)+'A');
					} else {
						charar[i]=(char) ((char) r.nextInt(26)+'a');
					}
				}
			}
			pass+=charar[i];
		}
		return pass;
	}
	
//CONSTRUCTORES
	public Password(int longitud) {
		this.longitud = longitud;
		this.password = generarPassword(this.longitud);
	}

	public Password() {
	}

//GETTERS Y SETTERS
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getPassword() {
		return password;
	}
	
	
}
