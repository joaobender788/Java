import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Personagem personagem = new Personagem();

        System.out.println("FICHA DO PERSONAGEM");
        System.out.println("-------------------");
        System.out.println("Digite a classe do personagem: ");
        System.out.println("1- Guerreiro\n2- Mago\n3- Arqueiro");
        personagem.classe = leitor.nextInt();

        switch(personagem.classe){
            case 1:
                Guerreiro guerreiro = new Guerreiro();
                System.out.println("Digite o nome do personagem: ");
                personagem.nome = leitor.nextLine();
                break;
            case 2:
                Mago mago = new Mago();
                System.out.println("Digite o nome do personagem: ");
                mago.nome = leitor.nextLine();
                break;
            case 3:
                Arqueiro arqueiro = new Arqueiro();
                System.out.println("Digite o nome do personagem: ");
                arqueiro.nome = leitor.nextLine();
                break;
            default:
                System.out.println("Comando inválido!");
        }

    }
}
