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
                case 1 -> petMachine.takeAShower();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkIfHasPetInManchine();
                case 7 -> setPetinPetManchine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.wash();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção Inválida");
            }
        }while(true);

    }

    private static void setShampoo(){
        System.out.println("Tentando colocar shampoo na maquina!");
        petMachine.addShampoo();
    }

    private static void setWater(){
        System.out.println("Tentando colocar agua na maquina!");
        petMachine.addWater();
    }

    private static void verifyWater() {
        var amount = petMachine.getWater();
        System.out.println("A maquina esta no momento com " + amount + "Litros(s) de Agua!");
    }

    private static void verifyShampoo() {
        var amount = petMachine.getShampoo();
        System.out.println("A maquina esta no momento com " + amount + "Litros(s) de shampoo!");
    }

    private static void checkIfHasPetInManchine() {
       var hasPet =  petMachine.hasPet();
        System.out.println(hasPet ? "Tem Pet na maquina" : "Nao tem pet na maquina");
    }

    public static void setPetinPetManchine() {
        var nome = "";
        while (nome == null || nome.isEmpty()) {
            System.out.println("informe o nome do Pet!");
            nome = scanner.next();
        }
        var Pet = new Pet(nome);
        petMachine.setPet(Pet);
        System.out.println("O pet " + Pet.getNome() + " Foi colocado na maquina");
    }

}
// parei no minuto 35:56