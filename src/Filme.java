public class Filme extends Midia{

    double duracao;
    String tipo;
    Ator[] elenco;

    public Filme(String titulo, int ano, String genero, double duracao, Ator[] elenco) {
        super(titulo, ano, genero);
        this.setDuracao(duracao);
        this.setElenco(elenco);
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
        if (duracao <= 0.30){
            this.setTipo("Curta");
        } else {
            this.setTipo("Longa");
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Ator[] getElenco() {
        return elenco;
    }

    public void setElenco(Ator[] elenco) {
        this.elenco = elenco;
    }

    public void getStatus(){


        System.out.print("Ano: " + this.getAno() + " | ");
        System.out.print("Genero: " + this.getGenero() + " | ");
        System.out.print("Duração: " + this.getDuracao() + " | ");
        System.out.print("Tipo: " + this.getTipo() + " | ");
        System.out.print("Artista: ");
        for (int i = 0; i < getElenco().length; i++){
            System.out.print("[" + getElenco()[i].getNome() + "]");
        }
        System.out.println();
    }
}
