import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    
        Scanner sc = new Scanner(System.in);
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;



      // exibir as mensagens para os usuários

      System.out.println("------CONTA BANCARIA--------");
      System.out.println();
      System.out.println("Por Favor,digite o número de sua conta:");
      numero= sc.nextInt();

      System.out.println("Agora digite o número de sua agencia:");
      agencia= sc.next();

      System.out.println("Informe seu Nome:");
      nomeCliente= sc.next();
      sc.nextLine();
      

      System.out.println("Agora informe o sue Saldo Atual");
      saldo= sc.nextDouble();

      //obter pelo Scanner os valores digitados no terminal 
       //exibir a mensagem conta criada
       System.out.println();
       System.out.printf("Olá %s , obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo);
       System.out.println();

       
       sc.close();
    }
}


    








    
     

