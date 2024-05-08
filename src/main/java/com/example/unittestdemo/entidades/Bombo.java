package com.example.unittestdemo.entidades;

import java.util.List;
import java.util.Objects;

public class Bombo {
    private List<Integer> numerosGenerados;
    private double porcentaje;

    public Bombo(List<Integer> testBombo) {
        numerosGenerados.addAll(testBombo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bombo bombo = (Bombo) o;
        return Objects.equals(numerosGenerados, bombo.numerosGenerados);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numerosGenerados);
    }
}
