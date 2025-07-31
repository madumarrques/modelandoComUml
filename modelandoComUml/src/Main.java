public class Main {
    public static void main(String[] args){

    //Testando reprodutor musical
    Iphone musica1 = new Iphone();
    musica1.musica = "Punkrocker";
    musica1.selecionarMusica();
    musica1.tocar();
    musica1.pausar();

        System.out.println("====================================================");

    //Testando navegador
    Iphone url1 = new Iphone();
    url1.url = "https://www.linkedin.com/in/eduarda-santos-322206351/";
    url1.exibirPagina();
    url1.adicionarNovaAba();
    url1.atualizarPagina();

        System.out.println("====================================================");

    //Testando telefone
    Iphone numero1 = new Iphone();
    numero1.numero = "(21)91234-5678";
    numero1.atender();
    numero1.ligar();
    numero1.iniciarCorreioVoz();

    }
}
