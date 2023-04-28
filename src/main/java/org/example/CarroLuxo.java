package org.example;

public class CarroLuxo extends Carro {
    private double taxaLuxo;

    public CarroLuxo(String marca, String modelo, double preco, double taxaLuxo) {
        super(marca, modelo, preco);
        this.taxaLuxo = taxaLuxo;
    }

    @Override
    public double getPreco() {
        return preco + taxaLuxo;
    }
}