public class Artista {
    private String nome;
    private String nascimento;
    private String premiacoes;
    private String genero;

    public Artista(String nome, String nascimento, String premiacoes, String genero) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.premiacoes = premiacoes;
        this.genero = genero;
    }


    // getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getPremiacoes() {
        return premiacoes;
    }

    public void setPremiacoes(String premiacoes) {
        this.premiacoes = premiacoes;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
