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
	public void whenPorcentajeIndicadoGeneraNumeroThenReturn(){}

	@Test
	public void whenIntroduzcoNumeroListaGanadoresThenReturnListaGanadores() {
		// Given
		Integer numResutlados = 6;

		List<Integer> expectedResult = new ArrayList<>();
		expectedResult.add(00001);
		expectedResult.add(00002);
		expectedResult.add(00003);
		expectedResult.add(00004);
		expectedResult.add(00005);
		expectedResult.add(00006);


//		Mockito.when(servicioLoteria.testCorrectoNumeroAndSize(Mockito.anyList())).thenReturn(true);

//		Bombo expected = new Bombo(testBombo);


		// When
		// servioLoteria.introducirGanador(00001);
		// servioLoteria.introducirGanador(00002);
		// servioLoteria.introducirGanador(00003);
		// servioLoteria.introducirGanador(00004);
		// servioLoteria.introducirGanador(00005);
		// servioLoteria.introducirGanador(00006);
		// List<Integer> listaRes = servicioLoteria.obtenerListadoGanadores(numResultados);

		// Then
		Assertions.assertEquals(expectedResult, listaRes);
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
