package com.example.unittestdemo.servicios;

import com.example.unittestdemo.entidades.Bombo;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ServicioBombo implements IServicioBombo {

    @Override
    public void modificarPeso(Bombo bombo, int numero) {
        Map<Integer, Double> numerosGenerados = bombo.getNumerosGenerados();
        if (!numerosGenerados.containsKey(numero)) {
            throw new IllegalArgumentException("El número especificado no existe.");
        }

        double pesoActual = numerosGenerados.get(numero);
        double nuevoPeso = pesoActual - 0.9;
        numerosGenerados.put(numero, nuevoPeso);

        for (int key : numerosGenerados.keySet()) {
            if (key != numero) {
                double peso = numerosGenerados.get(key);
                numerosGenerados.put(key, peso + 0.1);
            }
        }
    }

    @Override
    public int sacarNumero(Bombo bombo) {
        Map<Integer, Double> numerosGenerados = bombo.getNumerosGenerados();
        // Calculamos el total de pesos
        double totalPesos = 0.0;
        for (double peso : numerosGenerados.values()) {
            totalPesos += peso;
        }

        // Generamos un número aleatorio dentro del rango total de pesos
        double randomValue = Math.random() * totalPesos;

        // Iteramos sobre los números y restamos sus pesos hasta que alcancemos el valor aleatorio
        for (Map.Entry<Integer, Double> entry : numerosGenerados.entrySet()) {
            randomValue -= entry.getValue();
            if (randomValue <= 0.0) {
                modificarPeso(entry.getKey());
                return entry.getKey(); // Devolvemos el número correspondiente al peso alcanzado
            }
        }

        // Si algo sale mal, devolvemos -1
        return -1;
    }

}
