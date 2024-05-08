package com.example.unittestdemo;

import com.example.unittestdemo.entidades.Bombo;
import com.example.unittestdemo.servicios.IServicioLoteria;
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

import java.util.ArrayList;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ServicioPadreTest {

	@InjectMocks
	ServicioPadre servicioPadre;

	@Mock
	IServicioPassword servicioPassword;

	@Mock
	IServicioLoteria servicioLoteria;


	@BeforeAll
	 void beforeAll(){
		MockitoAnnotations.openMocks(this);
	}

	@Test
	public void whenPorcentajeIndicadoGeneraNumeroThenReturn(){}

	@Test
	public void whenIntroduzcoNumeroThenReturnListaGanadoresSizeNumero() {
		// Given
		Integer numResutlados = 6;

		List<String> expectedResult = new ArrayList<>();
		expectedResult.add("00001");
		expectedResult.add("00002");
		expectedResult.add("00003");
		expectedResult.add("00004");
		expectedResult.add("00005");
		expectedResult.add("00006");

		// When

		List<String> mockitoGanadores = new ArrayList<>();
		expectedResult.add("00000");
		expectedResult.add("00000");
		expectedResult.add("00000");
		expectedResult.add("00000");
		expectedResult.add("00000");
		expectedResult.add("00000");
		expectedResult.add("00001");
		expectedResult.add("00002");
		expectedResult.add("00003");
		expectedResult.add("00004");
		expectedResult.add("00005");
		expectedResult.add("00006");

		Mockito.when(servicioLoteria.getListaGanadores().thenReturn(mockitoGanadores));

		List<Integer> listaRes = servicioLoteria.obtenerListadoGanadores(numResultados);

		// Then
		Assertions.assertEquals(expectedResult, listaRes);
	}


}
