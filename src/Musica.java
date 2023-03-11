public class Musica extends  Midia{

    private double duracao;
    private Artista artista;
    private int nota;

    public Musica(String titulo, int ano, String genero, double duracao, Artista artista) {
        super(titulo, ano, genero);
        this.setDuracao(duracao);
        this.setArtista(artista);
    }

    public void getDuracao() {
        mostraDuracao();
    }
    private double mostraDuracao(){
        return this.duracao;
    }
    public void setDuracao(double duracao) {
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

    //metodos



}

