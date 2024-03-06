package application;

import application.model.tarefa;

public class App {
    public static void main(String[] args) {
        
        tarefa t = new tarefa();
        t.setDescricao("Teste de Tarefa");
        t.setConcluido(false);

        System.out.println(t.getDetalhe());
        


        
    }
}