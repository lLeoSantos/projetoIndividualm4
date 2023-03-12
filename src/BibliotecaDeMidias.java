import java.util.Scanner;

public class BibliotecaDeMidias {

    private Midia midia;
    private  String usuario;

    private Playlist[] playlist;

    public BibliotecaDeMidias(String usuario, Playlist... playlist) {
        this.setPlaylist(playlist);
        this.setUsuario(usuario);
    }


    // getters e setters


    public Midia getMidia() {

        return midia;
    }

    public void setMidia(Midia midia) {
        this.midia = midia;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Playlist[] getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Playlist[] playlist) {
        this.playlist = playlist;
    }


    public void tocar_playlist(){
        inicia_playlist();
    }
    private void inicia_playlist(){
        Scanner insert = new Scanner(System.in);
        System.out.println("Qual playlist deseja iniciar? Filmes | Musicas");
        String resposta = insert.nextLine();

        if (resposta.equalsIgnoreCase("Filmes")){
            this.getPlaylist()[0].playlist(false, 0);

        } else {
            this.getPlaylist()[1].playlist(true, 0);
        }



    }
}

