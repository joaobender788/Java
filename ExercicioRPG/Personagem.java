public class Personagem {
    String nome;
    int classe;
    int idade;
    String aparencia;


    Personagem(String nome, int classe, int idade, String aparencia){
        this.nome = nome;
        this.classe = classe;
        this.idade = idade;
        this.aparencia = aparencia;
    }

    public void getFicha(){

    }

    protected void atacar(){
        System.out.println(nome + "efetuou um ataque!");
    }
}
