import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        /*int [] vetor = new int [5];

        for(int i = 0; i<vetor.length; i++){
            System.out.println("Digite o número " + i + ": ");
            vetor [i] = leitor.nextInt();
        }

        float media = (vetor [0] + vetor [1] + vetor [2] + vetor [3] + vetor [4]) / vetor.length;
        System.out.println("Média dos números: " + media);

        for(int a = 0; a<vetor.length; a++){
            if(vetor[a] > media){
                System.out.println("Número " + a + ": " + vetor [a] + " (Número acima da média)");
            }else if(vetor[a] == media){
                System.out.println("Número " + a + ": " + vetor [a] + " (Número igual a média)");
            }else{
                System.out.println("Número " + a + ": " + vetor [a] + " (Número abaixo da média)");
            }
        }*/

        /*System.out.println("Digite o tamanho do vetor: ");
        int tamanho = leitor.nextInt();
        int[] vetor = new int [tamanho];

        for(int i = 0; i<vetor.length; i++){
            System.out.println("Digite o número " + i + ": ");
            vetor [i] = leitor.nextInt();
        }

        for(int a = 0; a<vetor.length; a++){
            if(vetor[a] > 0){
                System.out.println("Número " + a + ": " + vetor [a] + " (Número positivo)");
            }else if(vetor[a] == 0){
                System.out.println("Número " + a + ": " + vetor [a] + " (Número igual a 0)");
            }else{
                System.out.println("Número " + a + ": " + vetor [a] + " (Número negativo)");
            }
        }*/
        System.out.println("Digite o tamanho do vetor: ");
        int tamanho = leitor.nextInt();
        int[] numeros = new int [tamanho];

        for(int i = 0; i<numeros.length; i++){
            System.out.println("Digite o número " + i + ": ");
            numeros [i] = leitor.nextInt();
        }

        int [] dobro = new int [tamanho];

        for(int a = 0; a<numeros.length; a++){
           dobro [a] = numeros [a] * 2;
        }

        for(int a = 0; a<dobro.length; a++){
            System.out.println("Dobro do número " + a + ": " + dobro [a]);
        }

        leitor.close();
    }
}
