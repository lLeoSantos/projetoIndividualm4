import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Midia {

   private String titulo;
    private int ano;

    private Musica musica;
    private String genero;

    public Midia(String titulo, int ano, String genero) {
        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
    }

    // getters e setters
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
        System.out.println("oi");
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // metodos


}
