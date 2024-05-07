package com.example.unittestdemo.servicios;

import org.springframework.stereotype.Service;

@Service
public class ServicioPassword implements IServicioPassword {

	@Override
	public Integer testPsswd(String password) {
		int fortaleza = 0;

		fortaleza =  comprobarLongitud(password);
		fortaleza += comprobarCaracteres(password);
		return fortaleza;
	}

	public int comprobarLongitud(String contraseniaIntroducida) {
		int fortaleza = 0;

		if (contraseniaIntroducida.length() >= 7 && contraseniaIntroducida.length() <= 8) {
			fortaleza++;
		} else if (contraseniaIntroducida.length() >= 9 && contraseniaIntroducida.length() <= 12) {
			fortaleza += 2;
		} else if (contraseniaIntroducida.length() > 12) {
			fortaleza += 3;
		}

		return fortaleza;

	}

	public int comprobarCaracteres(String contraseniaIntroducida) {
		int fortaleza = 0;

		boolean hayLetras = false;
		boolean hayNumeros = false;
		boolean hayMinus = false;
		boolean hayMayus = false;
		boolean haySimbolo = false;

		for (int i = 0; i < contraseniaIntroducida.length(); i++) {

			if (Character.isLetter(contraseniaIntroducida.charAt(i))) {
				hayLetras = true;
			}

			if (Character.isUpperCase(contraseniaIntroducida.charAt(i))) {
				hayMayus = true;
			}

			if (Character.isLowerCase(contraseniaIntroducida.charAt(i))) {
				hayMinus = true;
			}

			if (Character.isDigit(contraseniaIntroducida.charAt(i))) {
				hayNumeros = true;
			}

			//33-47 y de 58-64
			if ((int) contraseniaIntroducida.charAt(i) >= 33 && (int) contraseniaIntroducida.charAt(
					i) <= 47 || (int) contraseniaIntroducida.charAt(i) >= 58 && (int) contraseniaIntroducida.charAt(
					i) <= 64) {
				haySimbolo = true;
			}
		}

		if (hayLetras) {
			fortaleza++;
		}

		if (hayMinus && hayMayus) {
			fortaleza += 2;
		}

		if (hayNumeros) {
			fortaleza++;
		}
		if (haySimbolo) {
			fortaleza += 2;
		}

        /*
        - Combinación de máximo de puntos (máximo en longitud; uso de letras; mayúsculas y minúsculas; números;símbolos)
        - 1 punto extra
         */
		if (contraseniaIntroducida.length() > 12 && hayLetras && hayMayus && hayMinus && hayNumeros && haySimbolo) {
			fortaleza++;
		}

		return fortaleza;
	}

}
