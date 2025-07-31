public class Iphone implements Reprodutor, Navegador, Telefone{

    //Reprodutor
    String musica;
    public void selecionarMusica(){
        System.out.println("Música " + musica + " selecionada.");
    }

    public void pausar(){
        System.out.println("Música pausada.");
    }

    public void tocar(){
        System.out.println("A música " + musica + " está tocando.");
    }

    //Navegador
    String url;

    public void exibirPagina(){
        System.out.println(url);
    }

    public void adicionarNovaAba(){
        System.out.println("Aba adicionada.");
    }

    public void atualizarPagina(){
        System.out.println("Página atualizada.");
    }

    //Telefone
    String numero;

    public void atender(){
        System.out.println("Atendendo " + numero);
    }

    public void ligar(){
        System.out.println("Ligando para " + numero);
    }

    public void iniciarCorreioVoz(){
        System.out.println("Iniciar correio de voz");
    }
}
