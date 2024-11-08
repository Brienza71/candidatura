package org.example;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        imprimirCanditados();
    }

    static void imprimirCanditados(){
        String[] canditados =  {"Leo","Leo2","Leo3","Leo4","Leo5"};
        for(String canditato: canditados){
            System.out.println("O candidato selecionado foi: " + canditato);
        }
    }

    static void selecionarCanditado(){
        String[] canditados =  {"Leo","Leo2","Leo3","Leo4","Leo5","Leo6","Leo7","Leo8","Leo9","Leo10"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0; //Indice
        double salarioBase = 2000.0;

        while(candidatosSelecionados < 5 && candidatoAtual < canditados.length){
            String canditado = canditados[candidatoAtual];
            double salarioPretendido = ThreadLocalRandom.current().nextDouble(0.0, 3000.0);
            System.out.println("O salário pretendido é: " + salarioPretendido);

            if(salarioBase >= salarioPretendido){
                candidatosSelecionados++;
                System.out.println("O canditado " + canditado + " foi selecionado para a vaga!");
            }else {
                System.out.println("Salário pedido do candidato " +  canditado + " está fora do orçamento");
            }
            candidatoAtual++;
        }
    }

    static void analisarCanditado(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA CANDITADO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA OS CANDITADOS COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANTIDATOS");
        }
    }
}