public class Main {
    public static void main(String[] args) {

        Playlist playlist = new Playlist();
        BibliotecaDeMidias biblioteca = new BibliotecaDeMidias("Leonardo",playlist,playlist);

        biblioteca.tocar_playlist();




    }


}