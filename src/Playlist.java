import java.util.Random;
import java.util.Scanner;

public class Playlist {

    //atributos
    private Midia[] ordem;
    private Midia conjunto;

    private String midiaAtual;

//    public Playlist(Musica[] ordem) {
//        this.setOrdem(ordem);
//    }


    //getters e setters

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



    // metodos

    public void playlist(boolean verifica, int verificador) {
        criar_playlist(verifica, verificador);
    }


    private void criar_playlist(boolean verifica, int verificador){
        Scanner insert = new Scanner(System.in);
        String resposta = null;
        String pergunta = "Play | Pause | Next | Prev | Stop";
        String msg = null;
        String msg2 = null;


        if (verifica) {
            if (verificador == 0) {
                this.criar_musicas();
            }
            msg = "Tocando: ";
            msg2 = "Musica pausada";
        } else {
            if (verificador == 0) {
                this.criar_filme();
            }
            msg = "Está passando: ";
            msg2 = "Filme pausado";
        }

        int cont = 0;
        for (int i = 0; i < this.getOrdem().length; ) {
            this.setMidiaAtual(getOrdem()[i].getTitulo());
            switch (cont) {
                case 0 -> {
                    System.out.println(msg + getMidiaAtual());
                    mostra_status(getOrdem(),verifica, i);
                    System.out.println(pergunta);
                    resposta = insert.nextLine();
                }
                case 1 -> {
                    System.out.println(msg2);
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
                if ((i + 1) > getOrdem().length - 1) {
                    i = 0;
                } else {
                    i++;
                }
            } else if (resposta.equalsIgnoreCase("Prev")) {
                if ((i - 1) >= 0) {
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
        System.out.println("===================");
        System.out.println();
        System.out.println("Deseja embaralhar as midias e inicar a playlist novamente? Sim  |  Não ");
        resposta = insert.nextLine();
        if (resposta.equalsIgnoreCase("Sim")) {
            setOrdem(random(getOrdem()));
            playlist(verifica, 1);
        }
    }

    private void criar_musicas(){
        Artista[] artista = new Artista[3];

        artista[0] = new Artista("Kawe","18/01/1998","MTV Miaw 2022","Masc");
        artista[1] = new Artista("L7NNON","30/03/1994","","Masc");
        artista[2] = new Artista("Ananda","01/09/2003","Tiktok Wars","Fem");

        Musica[] conjunto = new Musica[5];

        conjunto[0] = new Musica("Rubi",2021,"rap",2.37,artista[0]);
        conjunto[1] = new Musica("Barcelona",2018, "rap",3.43,artista[1]);
        conjunto[2] = new Musica("Kartie",2019,"Pop",3.41,artista[2]);
        conjunto[3] = new Musica("Nada é pra sempre",2020,"Hip-hop",3.49,artista[1]);
        conjunto[4] = new Musica("Colapso",2021,"Hip-hop",2.41,artista[0]);
        setOrdem(conjunto);
    }


    private void criar_filme(){

        Ator[] elenco = new Ator[5];

        elenco[0] = new Ator("Joao","18/05/1956","Oscar","Masc","Cinema");
        elenco[1] = new Ator("Ana", "05/12/1981","Melhor atriz","Fem", "Teatro");
        elenco[2] = new Ator("Jubileu","10/04/1990","Revelação do ano", "Ind", "Cinema");
        elenco[3] = new Ator("Lucas", "22/08/1987","Melhor atuação","Masc", "Outros");
        elenco[4] = new Ator("Rosa","30/09/1990","Oscar","Ind", "Teatro");


        Filme[] filmes = new Filme[5];

        filmes[0] = new Filme("500 dias com ela",2009,"romance",1.35, elenco);
        filmes[1] = new Filme("Vingadores: Ultimato",2019,"Ação/Ficção científica",3.02, elenco);
        filmes[2] = new Filme("Tropa de elite",2007,"Ação/Crime",1.55, elenco);
        filmes[3] = new Filme("Avatar: O Caminho da Água",2022,"Ficção científica/Ação",3.12, elenco);
        filmes[4] = new Filme("Pelé",1980,"Documentario",0.30,elenco);
        this.setOrdem(filmes);
    }

    private Midia[] random(Midia[] array){
        Random random = new Random();
        int quantidade = array.length;
        for (int i = 0; i < quantidade; i++) {
            int posicao = random.nextInt(quantidade);
            Midia troca = array[i];
            array[i] = array[posicao];
            array[posicao] = troca;
        }
        return array;
    }

    private void mostra_status(Midia[] array, boolean verifaca, int i){

        if (verifaca){
            Musica musica = (Musica) array[i];
            musica.getStatus();
            dar_nota(musica);
            System.out.println("=================");
        } else {
            Filme filme = (Filme) array[i];
            filme.getStatus();
        }

    }

    private void dar_nota(Musica musica){
        Scanner insert = new Scanner(System.in);
        if (musica.getNota() == 0) {
            System.out.println("Deseja dar uma nota para essa música? Sim | Não");
            String resposta = insert.nextLine();
            int nota = 0;

            if (resposta.equalsIgnoreCase("Sim")) {
                System.out.println("Digite uma nota de 1 a 5");
                nota = insert.nextInt();

                if (nota > 0 && nota < 6) {
                    musica.setNota(nota);
                } else {
                    System.out.println("Nota é inválida");
                    dar_nota(musica);
                }
            }
        }
    }
}
