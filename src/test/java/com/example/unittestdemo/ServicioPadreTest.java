package com.example.unittestdemo;

import com.example.unittestdemo.servicios.IServicioPassword;
import com.example.unittestdemo.servicios.ServicioPadre;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ServicioPadreTest {

	@InjectMocks
	ServicioPadre servicioPadre;

	@Mock
	IServicioPassword servicioPassword;


	@BeforeAll
	 void beforeAll(){
		MockitoAnnotations.openMocks(this);
	}


	@Test
	public void whenAllLowerCaseAnd5CharsThenReturnObjetoDatosWith1AndPssw(){
		// Given
		String pssw = "tests";
		Mockito.when(servicioPassword.testPsswd(Mockito.anyString())).thenReturn(1);

		ObjetoDatos expected = new ObjetoDatos(1, "tests");

		// When
		ObjetoDatos response = servicioPadre.metodoPadre(pssw);

		// Then
		Assertions.assertEquals(expected, response);
	}

	@Test
	public void whenPssIs99ReturnObjectWith99(){
		// Given
		String pssw = "tests";
		Mockito.when(servicioPassword.testPsswd(Mockito.anyString())).thenReturn(99);

		ObjetoDatos expected = new ObjetoDatos(99, "tests");

		// When
		ObjetoDatos response = servicioPadre.metodoPadre(pssw);

		// Then
		Assertions.assertEquals(expected, response);
	}


}
