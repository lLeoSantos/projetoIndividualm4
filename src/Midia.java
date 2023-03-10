import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Midia {

   private String titulo;
    private int ano;
    private String genero;

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


}
