import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem-vindo ao sistema bancário!");
        
        System.out.println("Por favor, digite o número da sua conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.println("Agora, informe a agência:");
        String agencia = scanner.nextLine();
        
        System.out.println("Digite seu nome:");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Informe o saldo inicial da conta:");
        double saldo = scanner.nextDouble();
        
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.\n");
        
        scanner.close();
    }
}