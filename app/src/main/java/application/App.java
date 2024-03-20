package application;

import application.model.Compromisso;
import application.model.Tarefa;

public class App {
    public static void main(String[] args) {
        
        Tarefa t = new Tarefa();
        t.setDescricao("Teste de Tarefa");
        t.setConcluido(false);

        Compromisso c = new Compromisso();
        c.setDescricao("Reunião de Equipe");
        c.setDataInicial(21,03,2024);
        c.setDataFinal(22,03,2024);   

        System.out.println(c.getDetalhes());



    }
}