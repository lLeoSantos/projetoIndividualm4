public class Main {
    public static void main(String[] args) {

        Playlist lista = new Playlist();
        BibliotecaDeMidias b = new BibliotecaDeMidias("Leonardo",lista,lista);

        b.tocar_playlist();
    }


}