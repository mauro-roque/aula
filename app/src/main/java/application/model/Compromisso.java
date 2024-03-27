package application.model;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;


public class Compromisso extends AbstractAtividade{
    private Calendar dataInicial;
    private Calendar dataFinal;

    private static ArrayList<Compromisso> Compromissos = new ArrayList<Compromisso>();
    public static Compromisso getInstance(
        String descricao,
        String dataInicial,
        String dataFinal){

        Compromisso c = new Compromisso();
        Compromissos.add(c);

        return c;
    }

    public static int[] strDateToIntArray(String strData){
        int[] resultado = new int[3];
        String[] strArray = strData.split("\\s*/\\s*");
        for (int cont = 0; cont < strArray.length; cont++) {
            resultado[cont] = Integer.parseInt(strArray[cont]);
        }
        return resultado;

    }

    
    public Calendar getDataInicial() {
        return dataInicial;
    }
    public void setDataInicial(Calendar dataInicial){
        this.dataInicial = dataInicial;
    }
    public Calendar getDataFinal() {
        return dataFinal;
    }
    public void setDataFinal(Calendar dataFinal){
        this.dataFinal = dataFinal;
    }

    @Override
    public String getDetalhes(){
        return "[C] " + this.getDescricao() + " :: "
            + this.getDataInicial().getTime() + " :: "
            + this.getDataFinal().getTime();
    }
    
    public void setDataInicial(int dia, int mes, int ano){
        Calendar c = Calendar.getInstance();
        c.set(ano,mes,dia);
        this.dataInicial = c;
    }

    public void setDataFinal(int dia, int mes, int ano){
        Calendar c = Calendar.getInstance();
        c.set(ano,mes,dia);
        this.dataFinal = c;
    }
}
