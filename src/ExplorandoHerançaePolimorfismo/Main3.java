package ExplorandoHerançaePolimorfismo;

public class Main3 {
    public static void main(String[] args) {
        printEmployee3(new Manager3());
        printEmployee3(new SalesMan3());

    }

    //Metodo para imprimir o colaborador
    public static void printEmployee3(Employee3 employee) {
        System.out.printf("=======%s=======\n", employee.getClass().getCanonicalName());
        if (employee instanceof Manager3 manager3) {
        employee.setName3("João");
        manager3.setLogin3("joao");
        manager3.setPassword3("12345");
        // Fazer o casting no objeto parametro "employee"

        System.out.println(employee.getName3());
        System.out.println(manager3.getLogin3());
        System.out.println(manager3.getPassword3());

        }
        System.out.println("==============");
    }
}

// Continuando a aula de polimorfismo e herança

// GetCanonicalName() serve para exibir apenas o nome da classe!

// Aprendemos uma palavra nova "instanceof" que ela verifica se um objeto é uma instancia de uma determinada classe!

// invez do casting como feito "System.out.println(((Manager3) employee).getLogin3());" ou "((Manager3)employee).setLogin3("joao");"
// podemos colocar agora o casting junto com nosso instanceof