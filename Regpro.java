package meuPacote;
public class Regpro {
    private int id;
    private String dataInicial;
    private String pais;

    public Regpro(int id, String dataInicial, String pais) {
        this.id = id;
        this.dataInicial = dataInicial;
        this.pais = pais;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(String dataInicial) {
        this.dataInicial = dataInicial;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
