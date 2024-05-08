package com.example.unittestdemo.servicios;

import com.example.unittestdemo.entidades.Bombo;

import java.util.List;

public interface IServicioLoteria {

    void introducirGanador(String numGanador);

    List<String> obtenerListadoGanadores(int numMostrarGanadores);

}
