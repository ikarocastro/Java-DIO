package ExplorandoHerançaePolimorfismo;

public class Main3 {
    public static void main(String[] args) {
        printEmployee3(new Manager3());
        //printEmployee3(new SalesMan3());

    }

    //Metodo para imprimir o colaborador
    public static void printEmployee3(Employee3 employee) {
        ((Manager3)employee).setName3("João");
        ((Manager3)employee).setLogin3("joao");
        ((Manager3)employee).setPassword3("12345");
        // Fazer o casting no objeto parametro "employee"

        System.out.println(employee.getClass());
        System.out.println(employee.getName3());
        System.out.println(((Manager3) employee).getLogin3());
        System.out.println(((Manager3) employee).getPassword3());
    }
}

// Continuando a aula de polimorfismo e heranç

//