package application.model;
import java.util.Calendar;


public class Compromisso extends AbstractAtividade{
    private Calendar dataInicial;
    private Calendar dataFinal;
    
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
