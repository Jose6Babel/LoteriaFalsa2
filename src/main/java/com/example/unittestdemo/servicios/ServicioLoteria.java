package com.example.unittestdemo.servicios;

import com.example.unittestdemo.entidades.Bombo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioLoteria implements IServicioLoteria {

    @Autowired
    IServicioBombo servicioBombo;

    private List<Bombo> bombosGanadores;


    public void introducirGanador(Integer numGanador){
        // servicioBombo.introducirGanador por cada unos de los numeros/bombos
    }

    @Override
    public boolean testCorrectoNumeroAndSize(List<Integer> listaBombo) {
        return true;
    }

}
