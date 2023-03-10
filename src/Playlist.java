import java.util.Scanner;

public class Playlist {

    //atributos
    private Midia midia;
    private Musica[] ordem;

    private String midiaAtual;

//    public Playlist(Musica[] ordem) {
//        this.setOrdem(ordem);
//    }


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

    public void setOrdem(Musica[] ordem) {
        this.ordem = ordem;
    }

    public String getMidiaAtual() {
        return midiaAtual;
    }

    public void setMidiaAtual(String midiaAtual) {
        this.midiaAtual = midiaAtual;
    }



    // metodos

    public void tocar_playlist(){
        this.criar_musicas();
        Scanner insert = new Scanner(System.in);
        String resposta = null;
        String pergunta = "Play | Pause | Next | Prev | Stop";
        int cont = 0;
        for (int i = 0; i < this.getOrdem().length;){
            this.setMidiaAtual((getOrdem()[i].getTitulo()));
            switch (cont) {
                case 0 ->{
                    System.out.println("Tocando: " + getMidiaAtual());
                    System.out.println(pergunta);
                    resposta = insert.nextLine();
                }
                case 1 -> {
                    System.out.println("Musica Pausada");
                    System.out.println(pergunta);
                    resposta = insert.nextLine();
                }
            }
            System.out.println("==================");
            if (resposta.equalsIgnoreCase("Play")) {
                cont = 0;
            } else if (resposta.equalsIgnoreCase("Pause")) {
                cont = 1;
            } else if (resposta.equalsIgnoreCase("Next")) {
                    cont = 0;
                if ((i+1) > getOrdem().length - 1){
                    i = 0;
                } else {
                    i++;
                }
            } else if (resposta.equalsIgnoreCase("Prev")) {
                if((i-1) >= 0){
                    cont = 0;
                    i--;
                } else {
                    i = getOrdem().length - 1;
                }
            } else if (resposta.equalsIgnoreCase("Stop")) {
                break;
            }

        }
        System.out.println("Sua playlist chegou ao fim");
    }


    private void criar_musicas(){
        Artista[] artista = new Artista[3];

        artista[0] = new Artista("Kawe","18/01/1998","MTV Miaw 2022","Masc");
        artista[1] = new Artista("L7NNON","30/03/1994","","Masc");
        artista[2] = new Artista("Ananda","01/09/2003","Tiktok Wars","Masc");





        Musica[] conjunto = new Musica[5];

        conjunto[0] = new Musica("Rubi",2021,"rap",2.37,artista[0]);
        conjunto[1] = new Musica("Barcelona",2018, "rap",3.43,artista[1]);
        conjunto[2] = new Musica("Kartie",2019,"Pop",3.41,artista[2]);
        conjunto[3] = new Musica("Nada é pra sempre",2020,"Hip-hop",3.49,artista[0]);
        conjunto[4] = new Musica("Colapso",2021,"Hip-hop",2.41,artista[2]);

        setOrdem(conjunto);
    }
}
