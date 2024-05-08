package com.example.unittestdemo.servicios;

import com.example.unittestdemo.entidades.Bombo;

import java.util.List;

public interface IServicioLoteria {

    boolean testCorrectoNumeroAndSize(List<Integer> listaBombo);
}
