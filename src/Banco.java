import java.util.List;

public class Banco {

    private String nome;
    private List<AcoesBanco> acoesBancos;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<AcoesBanco> getContas() {
        return acoesBancos;
    }

    public void setContas(List<AcoesBanco> acoesBancos){
        this.acoesBancos = acoesBancos;
    }

}

