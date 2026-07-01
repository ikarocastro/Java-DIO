package ExplorandoHerançaePolimorfismo2;


import ExplorandoHerançaePolimorfismo2.Domain.Employee4;
import ExplorandoHerançaePolimorfismo2.Domain.Manager4;
import ExplorandoHerançaePolimorfismo2.Domain.SalesMan4;

public class Main4 {
    public static void main(String[] args) {
        printEmployee4(new Manager4());
        printEmployee4(new SalesMan4());
    }
    //Metodo para imprimir o colaborador
    public static void printEmployee4(Employee4 employee) {
        System.out.printf("=======%s=======\n", employee.getClass().getCanonicalName());

        switch (employee){
            case Manager4 manager4 ->{
                manager4.setCode4("codigo123");
                manager4.setName4("João");
                manager4.setSalary4(5000);
                manager4.setLogin4("joao");
                manager4.setPassword4("12345");
                manager4.setCommission4(10000);

                System.out.println(manager4.getCode4());
                System.out.println(manager4.getSalary4());
                System.out.println(manager4.getLogin4());
                System.out.println(manager4.getName4());
                System.out.println(manager4.getLogin4());
                System.out.println(manager4.getPassword4());
                System.out.println(manager4.getCommission4());
                System.out.println(manager4.getFullSlary(500));
            }
            case SalesMan4 salesMan4 ->{
                salesMan4.setCode4("codigo123");
                salesMan4.setName4("Lucas");
                salesMan4.setSalary4(3000);
                salesMan4.setPercentPerSold4(10);
                salesMan4.setSoldAmount(1000);

                System.out.println(salesMan4.getCode4());
                System.out.println(salesMan4.getSalary4());
                System.out.println(salesMan4.getName4());
                System.out.println(salesMan4.getPercentPerSold4());
                System.out.println(salesMan4.getSoldAmount());
            }
        }
        System.out.println(employee.getFullSalary());
        System.out.println("==============");

    }
}

//Nesse momento invez do IF vamos utilizar nosso case como outra forma de instanceof

//Acrescetadp record develop