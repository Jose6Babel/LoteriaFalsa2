package com.example.unittestdemo.servicios;

import com.example.unittestdemo.ObjetoDatos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioPadre implements IServicioPadre{

	@Autowired
	IServicioPassword servicioPassword;

	@Override
	public ObjetoDatos metodoPadre(String password) {
		Integer nivel = servicioPassword.testPsswd(password);
		return new ObjetoDatos(nivel, password);
	}
}
