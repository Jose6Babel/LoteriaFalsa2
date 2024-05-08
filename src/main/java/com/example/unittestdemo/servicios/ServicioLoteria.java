package com.example.unittestdemo.servicios;

import com.example.unittestdemo.entidades.Bombo;
import com.example.unittestdemo.repositorios.IFakeDBLoteria;

import java.util.ArrayList;
import java.util.List;

public class ServicioLoteria implements IServicioLoteria {

    private final IFakeDBLoteria iFakeDBLoteria;

    public ServicioLoteria(IFakeDBLoteria iFakeDBLoteria) { this.iFakeDBLoteria = iFakeDBLoteria; }

    @Override
    public List<Bombo> listarGanadores(int ctdGanadores) {

    }
}
