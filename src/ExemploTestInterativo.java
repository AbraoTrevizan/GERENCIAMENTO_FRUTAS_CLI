import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;
// classe publica exemplorestinterativo
public class ExemploTestInterativo {
    public static void main(String[] args) { 
        // vai criar um scanner que vai ler o que o usuario ira escrever
        Scanner scanner = new Scanner(System.in);
        
        // vai usar o hashset para armazenar as frutas
        Set<String> frutas = new HashSet<>();
        
        // vai mostrar as opçoes para o usuario escolher
        while (true) { 
            try {
            	
                // vai mostar as opçoes para o usuario estar escolhendo
                System.out.println("\nEscolha uma opção: ");
                System.out.println("1. Adicionar uma fruta");
                System.out.println("2. Listar todas as frutas");
                System.out.println("3. Remover uma fruta");
                System.out.println("4. Verificar se uma fruta está presente");
                System.out.println("5. Sair");
                System.out.print("Opção: ");
                
                // vai estar lendo as opçoes escolidas pelo usuario
                int opcao = scanner.nextInt();
                
                // vai limpar o scanner
                scanner.nextLine();
                // vai verificar a opçao que o usuario escolheu e assim vai dar uma resposta
                switch (opcao) {
                    case 1:
                    	
                        // vai adcionar uma fruta
                        System.out.print("Digite o nome da fruta para adicionar: "); 
                        String novaFruta = scanner.nextLine();
                        if (frutas.add(novaFruta)) {
                            System.out.println(novaFruta + " foi adicionada.");
                        } else {
                            System.out.println(novaFruta + " já está presente no conjunto.");
                        }
                        break; 
                    case 2:
                    	
                        // vai listar todas as frutas
                        System.out.println("Frutas: " + frutas);
                        break;
                    case 3:
                    	
                        // vai remover uma fruta
                        System.out.print("Digite o nome da fruta que deseja remover: "); 
                        String frutaRemover = scanner.nextLine();
                        
                        // vai tentar remover uma fruta se nao conseguir vai estar falando ao usuario
                        if (frutas.remove(frutaRemover)) {
                            System.out.println(frutaRemover + " foi removida.");
                        } else {
                            System.out.println(frutaRemover + " não foi encontrada.");
                        }
                        break;
                    case 4:
                    	
                        // vai verificar a fruta que o usuario informar
                        System.out.print("Digite o nome da fruta para verificar: ");
                        String frutaVerificar = scanner.nextLine();
                        
                        // vai falar ao usuario se a fruta esta ou nao no conjunto
                        if (frutas.contains(frutaVerificar)) {
                            System.out.println(frutaVerificar + " está presente no conjunto.");
                        } else {
                            System.out.println(frutaVerificar + " não foi encontrada no conjunto.");
                        }
                        break;
                    case 5:
                    	
                        // essa e a opçao de sair 
                        System.out.println("Saindo...");
                        
                        // vai fechar o scanner
                        scanner.close();
                        return;
                    default:
                    	
                        // se o usuario escolher uma opçao que nao tem vai estar dando erro
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
            	
                // se o usurio escolher uma opçao que que nao seja numero vai estar dando erro
                System.out.println("Entrada inválida. Por favor, digite um número.");
                
                // vai evitar o loop infinito
                scanner.nextLine();
            }
        }
    }
}