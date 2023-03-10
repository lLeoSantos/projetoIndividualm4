public class Playlist {

    //atributos
    private Midia midia;
    private Midia[] ordem;

    private String midiaAtual;

    //getters e setters

    public Midia getMidia() {
        return midia;
    }

    public void setMidia(Midia midia) {
        this.midia = midia;
    }

    public Midia[] getOrdem() {
        return ordem;
    }

    public void setOrdem(Midia[] ordem) {
        this.ordem = ordem;
    }

    public String getMidiaAtual() {
        return midiaAtual;
    }

    public void setMidiaAtual(String midiaAtual) {
        this.midiaAtual = midiaAtual;
    }
}
