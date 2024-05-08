package com.example.unittestdemo;

import com.example.unittestdemo.servicios.ServicioPassword;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ServicioPrincipalTest {

	@InjectMocks
	ServicioPassword servicioPrincipal;

	@BeforeAll
	void beforeAll(){
		MockitoAnnotations.openMocks(this);
	}

	@AfterAll
	void metodoAfterAll(){
		// Esto se ejecuta despues de todos los test
	}

	@BeforeEach
	void metodoBeforeEach(){
		// Esto se ejecuta antes de cada uno de los test
	}

	@AfterEach
	void metodoAfterEach(){
		// Esto se ejecuta despues de cada uno de los test
	}

	@Test
	public void whenAllLowerCaseAnd5CharsThenReturn1(){
		// Given
		String pssw = "tests";

		// When
		Integer nivel = servicioPrincipal.testPsswd(pssw);

		// Then
		Assertions.assertEquals(1, nivel);
	}

}
