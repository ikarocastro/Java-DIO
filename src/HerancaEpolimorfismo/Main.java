package HerancaEpolimorfismo;

public class Main {
    public static void main(String[] args) {
        employee employee = new employee();
        Manager manager = new Manager();

        manager.setName("João");
        manager.setLogin("joao123");
        manager.setPassword("joao123");

        System.out.println(manager.getName());
        System.out.println(manager.getLogin());
        System.out.println(manager.getPassword());

    }
}

/*Vamos trabalhar com o conceito de Herança e polimorfismo

Herança: Seria como os filhos herdando as caracteristicas dos pais!

Para começar criamos a class funcário(employee) e add as uas caracteristicas
agora que temos o colaborador vamos criar uma class para o tipo de funcionario!
chamado (Manager)! o nosso gerente!

- Como manager, employee, outros comom salesMan(vendedor), teriam que ter o mesmo codigo de nome, salario, senha, login
- Ai terimos muita duplicidade de dados!

- Usamos o comando (extends) na frente da clase definindo que ela vai extender uma clase! em manager ficaria:

public class Manager

agora temos:

public class Manager extends employee

quando colocamos manager. e apertamos CRTL + Space vemos que temo acesso a informações de outra classe graças ao extend!
isso porque estamos (HERDANDO) as coisas, os dados de outra classe

Employee é a classe pai e o Manager e o salasMan que são classes filho seguindo uma hierarquia
*/

/*
 Agora vamos falar de polimorfismo!

 é a capacidade que a gente tem de poder ter um objeto podendo se comportar com outros objetos que estariam ligados e numa hierarquia

 vamos pensar que a gente tem uma (casa) e o dono da casa cria tres cachorros um (pitbull, dalmata e um pincher) no caso todos tem as mesmas caracteristicas como (nome, peso, pelo)
 mais são raças diferentes! mais não deixam de ser cachorros

*/