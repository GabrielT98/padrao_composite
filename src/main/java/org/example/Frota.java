package org.example;

import java.util.ArrayList;
import java.util.List;

public class Frota extends Carro {
    private List<Carro> carros;

    public Frota(String marca, String modelo, double preco) {
        super(marca, modelo, preco);
        carros = new ArrayList<>();
    }

    public void addCarro(Carro carro) {
        carros.add(carro);
    }

    public void removeCarro(Carro carro) {
        carros.remove(carro);
    }

    @Override
    public double getPreco() {
        double precoTotal = preco;
        for (Carro carro : carros) {
            precoTotal += carro.getPreco();
        }
        return precoTotal;
    }

    public String getDescricao() {

        StringBuilder descricao = new StringBuilder(marca + " " + modelo + " (frota):\n");
        for (Carro carro : carros) {
            descricao.append("  - ").append(carro.getDescricao()).append("\n");
        }
        return descricao.toString();
    }
}