public class Musica extends  Midia{

    private double duracao;
    private String artista;
    protected int nota;

    public Musica(String artista, int nota, double duracao){
        setArtista(artista);
        setNota(nota);
        setDuracao(duracao);
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

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
