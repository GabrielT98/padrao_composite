package org.example;

public abstract class Carro {
    protected String marca;
    protected String modelo;
    protected double preco;

    public Carro(String marca, String modelo, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }

    public abstract double getPreco();

    public String getDescricao() {
        return marca + " " + modelo;
    }
}
