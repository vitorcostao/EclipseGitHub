import java.util.Scanner;

class SomarNumeros {
	
   

    public static void main(String[] args) {
    	      
        // Criar objeto Scanner para leitura de dados
        Scanner sc = new Scanner(System.in);

        // Solicitar e ler os números
        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        int n3 = sc.nextInt();

        // Exibir os números digitados
        System.out.println("Você digitou os números: " + n1 + ", " + n2 + ", " + n3);

        // Fechar o scanner
        sc.close();
    }
}
