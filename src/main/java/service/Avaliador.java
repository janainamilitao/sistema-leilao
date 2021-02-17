package service;

import model.Lance;
import model.Leilao;

public class Avaliador {

    private double maiorDeTodos = Double.NEGATIVE_INFINITY;
    private double menorDeTodos = Double.POSITIVE_INFINITY;

    public void avalia(Leilao leilao){
        leilao.getLances().forEach( lance -> {
            if(lance.getValor() > maiorDeTodos){
                maiorDeTodos = lance.getValor();
            }
            if (lance.getValor()< menorDeTodos){
                menorDeTodos = lance.getValor();
            }
        });
    }

    public double getMaiorLance() {
        return maiorDeTodos;
    }

    public double getMenorLance() {
        return menorDeTodos;
    }
}
