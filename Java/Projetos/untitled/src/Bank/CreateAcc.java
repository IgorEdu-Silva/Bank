package Bank;

import java.util.Scanner;

public class CreateAcc {
    Dice dice = new Dice();
    Options option = new Options();


    public void createB() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nInsira seus dados para acessar a conta.");

        System.out.print("Nome: ");
        dice.nameCliente = sc.next();

        System.out.print("Senha: ");
        dice.passCliente = sc.next();

        while (!Client.name.equals(dice.nameCliente) || !Client.password.equals(dice.passCliente)) {
            System.out.println("Nome ou senha incorretos, tente novamente\n");

            System.out.print("Nome: ");
            dice.nameCliente = sc.next();

            System.out.print("Senha: ");
            dice.passCliente = sc.next();
        }

        System.out.println("Conta acessada com sucesso!");
        System.out.println("O que deseja fazer?\n");

        String functionACC;

        System.out.println("1 - Alterar tipo de conta");
        System.out.println("2 - Fechar conta");
        System.out.println("3 - Voltar");
        functionACC = sc.next();

        while (!functionACC.equals(option.option1) && !functionACC.equals(option.option2) && !functionACC.equals(option.option3)) {
            System.out.println("Insira um valor válido");

            System.out.println("1 - Alterar tipo de conta");
            System.out.println("2 - Fechar conta");
            System.out.println("3 - Voltar");
            functionACC = sc.next();
        }

        int function = Integer.parseInt(functionACC);

        if (function == 1) {
            System.out.println("Alterando tipo de conta...");
            System.out.println("Por favor aguarde");

            if (Client.accountType == AccountType.CORRENTE) {
                Client.accountType = AccountType.POUPANCA;
            } else if (Client.accountType == AccountType.POUPANCA) {
                Client.accountType = AccountType.CORRENTE;
            }
            System.out.println("Mudança feita com sucesso!");
            System.out.println("Agora sua conta é: " + Client.accountType);

        } else if (function == 2) {
            System.out.println("Verificando dados na conta...");
            if (Client.cash != 0) {
                System.out.println("Você possui " + Client.cash + " na sua conta");
                System.out.println("Não podemos fechá-la");
                System.out.println("Por favor, saque o dinheiro e tente novamente");

                System.out.println("1 - Acessar minha conta");
                System.out.println("2 - Fazer um depósito");
                System.out.println("3 - Retirar uma quantia");
                System.out.println("4 - Sair\n");
                option.option = sc.next();
                dice.converter = Integer.parseInt(option.option);
            } else {
                System.out.println("Fechando conta...");
                System.out.println("Conta fechada com sucesso");

                System.exit(0);
            }
        } else if (function == 3) {
            Choices Choices = new Choices();
            Choices.choices();
        }
    }
}
