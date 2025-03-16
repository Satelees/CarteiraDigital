import java.util.Scanner;

public class CarteiraDigital {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int modeloConta = 0;
    int opcao = 0;
    int operacao = 0;
    String tipoConta = "";


        // Recolhendo dados
        System.out.println("Nome e sobrenome do Usuário");
        String usuario = scanner.nextLine();

        System.out.println("""
                            \nTipo de conta 
                            1 - Corrente
                            2 - Poupança
                            """);


            modeloConta = scanner.nextInt();
            if (modeloConta == 1) { tipoConta = "Corrente";}
            else if (modeloConta == 2) { tipoConta = "Poupança";}
            else if (modeloConta != 2) {
                System.out.println("Opção invalida, verifique novamente! ");}


        System.out.println("Saldo Inicial");
        double saldo = scanner.nextDouble();

        System.out.println("*************************************");
        System.out.println("Dados Iniciais do Cliente");
        System.out.println("\nNome: " + usuario);
        System.out.println("Tipo Conta: " + tipoConta);
        System.out.println("Saldo Inicial: " + saldo);
        System.out.println("\n*************************************");

        // Iniciando o atendimento ao usuario, manipulando seus dados
        System.out.println("Olá Sr." + usuario +"digite uma opção abaixo");
        String menu = """
                Operações
                
                1 - Consultar saldo
                2 - Registrar valor
                3 - Transferir valor
                4 - Encerrar atendimento
                """;

        while (operacao != 4 ){
                System.out.println(menu);
                operacao = scanner.nextInt();

                if (operacao == 1) {
                    System.out.println("Saldo Disponivel: " + saldo);}
                else if (operacao == 2) {
                    System.out.println("Valor a ser adicionado: ");
                    double entrada = scanner.nextDouble();
                    saldo += entrada;
                    System.out.println("Saldo da conta atualizado: R$" + saldo);}

                else if (operacao == 3) {
                    System.out.println("Valor a ser transferido: ");
                    double saida = scanner.nextDouble();
                    if (saida > saldo) {
                        System.out.println("Salda Insuficiente");}
                        else {
                            saldo-= saida;
                            System.out.println("Saldo da conta atualizado: R$" + saldo);}}

                else if (operacao == 4) {
        System.out.println("Atendimento encerrado, até a próxima");}

                else if (operacao != 4){
                    System.out.println("Opção invalida, verifique novamente!");}
                }


                }}
