package com.example.unittestdemo;

import com.example.unittestdemo.servicios.IServicioBombo;
import com.example.unittestdemo.servicios.IServicioLoteria;
import com.example.unittestdemo.servicios.ServicioLoteria;
import org.junit.jupiter.api.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ServicioLoteriaTest {

	@InjectMocks
	ServicioLoteria servicioLoteria;

	@Mock
	IServicioBombo servicioBombo;

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
	public void whenPorcentajeIndicadoGeneraNumeroThenReturn(){}

	@Test
	public void whenListaGanadoresIgualThenReturnListaGanadoresSizeNumero() {
		// Given
		Integer numResultados = 6;

		List<String> expectedResult = new ArrayList<>();
		expectedResult.add("00001");
		expectedResult.add("00002");
		expectedResult.add("00003");
		expectedResult.add("00004");
		expectedResult.add("00005");
		expectedResult.add("00006");

		// When
		List<String> mockitoGanadores = new ArrayList<>();
		mockitoGanadores.add("00001");
		mockitoGanadores.add("00002");
		mockitoGanadores.add("00003");
		mockitoGanadores.add("00004");
		mockitoGanadores.add("00005");
		mockitoGanadores.add("00006");

		Mockito.when(servicioLoteria.getNumerosGanadores()).thenReturn(mockitoGanadores);

		servicioLoteria.setNumerosGanadores(mockitoGanadores);

		List<String> listaRes = servicioLoteria.getNumerosGanadores();

		// Then
		Assertions.assertEquals(expectedResult, listaRes);
	}


	@Test
	public void whenListaGanadoresVaciaThenReturnListaGanadoresVacia() {
		// Given
		Integer numResultados = 6;
		List<String> expectedResult = new ArrayList<>();

		// When
		List<String> res = servicioLoteria.obtenerListadoGanadores(numResultados);

		// Then
		Assertions.assertEquals(expectedResult, res);
	}

	@Test
	public void whenIntroducirNuevoGanadorYBuscarThenReturnEseGanador() {
		// Given
		int numResultados = 1;
		String numeroGanador = "00000";
		List<String> expectedResult = Arrays.asList("00000");

		Mockito.when(servicioBombo.modificarPeso(-2, -2)).thenReturn(false);

		// When
		servicioLoteria.introducirGanador(numeroGanador);
		List<String> res = servicioLoteria.obtenerListadoGanadores(numResultados);

		// Then
		Assertions.assertEquals(expectedResult, res);
	}



}
