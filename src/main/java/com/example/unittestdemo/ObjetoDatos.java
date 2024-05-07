package com.example.unittestdemo;

import java.util.Objects;

public class ObjetoDatos {

	Integer numero;
	String password;

	public ObjetoDatos(Integer numero, String password) {
		this.numero = numero;
		this.password = password;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		ObjetoDatos that = (ObjetoDatos) o;
		return Objects.equals(numero, that.numero) && Objects.equals(password, that.password);
	}

	@Override
	public int hashCode() {
		return Objects.hash(numero, password);
	}

	@Override
	public String toString() {
		return "ObjetoDatos{" + "numero=" + numero + ", password='" + password + '\'' + '}';
	}
}
