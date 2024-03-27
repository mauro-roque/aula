package application;

import application.model.AbstractAtividade;
import application.model.Compromisso;
import application.model.Tarefa;

import java.util.List;
import java.util.ArrayList;

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

        List<AbstractAtividade> listaAtividades = new ArrayList<AbstractAtividade>();
        //listaAtividades.add(t);
        listaAtividades.add(c);

        System.out.println("----------[Lista]----------");
        for(AbstractAtividade a : listaAtividades){
            System.out.println(a.getDetalhes());
        }

        int[] resul = Compromisso.strDateToIntArray("10/10/2024");
        

        for (int i : resul) {
            System.out.print(i);
        }

    }
}