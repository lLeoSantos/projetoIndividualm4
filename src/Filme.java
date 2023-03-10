public class Filme extends Midia{

    double duracao;
    String tipo;
    String[] elenco;

    public Filme(String titulo, int ano, String genero, double duracao) {
        super(titulo, ano, genero);
        this.setDuracao(duracao);

    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
        if (duracao < 30){
            setTipo("Curta");
        } else {
            setTipo("Longa");
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String[] getElenco() {
        return elenco;
    }

    public void setElenco(String[] elenco) {
        this.elenco = elenco;
    }
}
