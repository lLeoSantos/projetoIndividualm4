public class Musica extends  Midia{

    private double duracao;
    private Artista artista;
    private int nota;

    public Musica(String titulo, int ano, String genero, double duracao, Artista artista) {
        super(titulo, ano, genero);
        this.setDuracao(duracao);
        this.setArtista(artista);
    }

    public double getDuracao() {
        return mostraDuracao();
    }
    private double mostraDuracao(){
        return this.duracao;
    }
    public void setDuracao(double duracao) {
        defineDuracao(duracao);
    }

    private void defineDuracao(double duracao){
        this.duracao = duracao;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void getStatus(){
        System.out.print("Ano: " + this.getAno() + " | ");
        System.out.print("Genero: " + this.getGenero() + " | ");
        System.out.print("Duração: " + this.getDuracao() + " | ");
        System.out.print("Artista: " + getArtista().getNome() + " | ");
        System.out.println();
    }

    //metodos



}

