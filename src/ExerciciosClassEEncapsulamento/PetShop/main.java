package ExerciciosClassEEncapsulamento.PetShop;

import java.util.Scanner;
public class main {
    private final static Scanner scanner = new Scanner(System.in);

    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {

        var option = -1;

        do {
            System.out.println("===Escolha uma das opções===");
            System.out.println("1. Dar banho no Pet");
            System.out.println("2. Abastecer máquina com água");
            System.out.println("3. Abastecer máquina com shampoo");
            System.out.println("4. verificar nivel da agua da maquina");
            System.out.println("5. verificar nivel do shampoo da maquina");
            System.out.println("6. verificar se tem pet no banho");
            System.out.println("7. colocar o Pet na maquina");
            System.out.println("8. retirar Pet da maquina");
            System.out.println("9. limpar maquina");
            System.out.println("0. sair");
            option = scanner.nextInt();

            switch (option){
                case 7 -> setPetinPetManchine();
            }
        }while(option != 0); // Enquanto for diferente de 0 zero ele tem que ficar aqui dentro rodando nosso codigo!

    }

    public static void setPetinPetManchine(){
        System.out.println("informe o nome do Pet!");
        var name =  scanner.nextLine();
        var Pet = new Pet(name);
    }
}
// parei no minuto 35:56