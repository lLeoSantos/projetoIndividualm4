public class Ator extends Artista{

    private String formacao; //(teatro/cinema/outros)

    public Ator(String nome, String nascimento, String premiacoes, String genero, String formacao) {
        super(nome, nascimento, premiacoes, genero);

        setFormacao(formacao);
    }

    //getters setters


    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
}
