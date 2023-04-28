package org.example;

public class CarroSimples extends Carro {
    public CarroSimples(String marca, String modelo, double preco) {
        super(marca, modelo, preco);
    }

    @Override
    public double getPreco() {
        return preco;
    }
}