package com.example.unittestdemo.servicios;

import com.example.unittestdemo.entidades.Bombo;
import com.example.unittestdemo.entidades.Loteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ServicioLoteria implements IServicioLoteria {

    @Autowired
    IServicioBombo servicioBombo;

    private static List<String> numerosGanadores = new ArrayList<>();
    List<Bombo> listaBombos = Arrays.asList(new Bombo(), new Bombo(),new Bombo(),new Bombo(),new Bombo());
    Loteria loteria = new Loteria(listaBombos);

    Bombo bombo1 = listaBombos.get(0);
    Bombo bombo2 = listaBombos.get(1);
    Bombo bombo3 = listaBombos.get(2);
    Bombo bombo4 = listaBombos.get(3);
    Bombo bombo5 = listaBombos.get(4);

    bombo1.sacarNumero();

    public ServicioLoteria() {

    }

    @Override
    public void introducirGanador(String numGanador){
        String[] splitNumerosGanadores = numGanador.split("");
        for (int x = 0; x < splitNumerosGanadores.length; x++) {
//            numerosGanadores.add(splitNumerosGanadores[x]);
            //servicioBobmo.modificarPesos()
        }
        numerosGanadores.add(numGanador);
        // servicioBombo.introducirGanador por cada unos de los numeros/bombos
    }

    @Override
    public List<String> obtenerListadoGanadores(int numMostrarGanadores) {
        List<String> numerosMostrados = new ArrayList<>();
        if (numMostrarGanadores <= numerosGanadores.size() &&
            numMostrarGanadores > 0) {
            for (int x = 0; x < numMostrarGanadores; x++) {
                numerosMostrados.add(numerosGanadores.get(x));
            }
        }
        return numerosMostrados;
    }

    public List<String> getNumerosGanadores() {
        return numerosGanadores;
    }

    public void setNumerosGanadores(List<String> numerosGanadores) {
        this.numerosGanadores = numerosGanadores;
    }
}
