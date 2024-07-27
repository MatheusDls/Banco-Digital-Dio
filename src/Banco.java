import java.util.List;

public class Banco {

    private String nome;
    private List<Iconta> icontas;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Iconta> getContas() {
        return icontas;
    }

    public void setContas(List<Iconta> icontas){
        this.icontas = icontas;
    }

}

