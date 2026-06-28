package HerancaEpolimorfismo2;

public class Main2 {
    public static void main(String[] args) {
        Employee2 employee2 = new Employee2();
        Employee2 Manager = new Manager2();


    }
}

// Quando alguem resolve criar um novo código, e add por exemplo um Client
// e tenta criar uma hierarquia de classe pai, sub classe filho, e uma mais baixa
// para nao permitir a extensão desnecessária e abalar nossa hierarquia usamos "final" para que nao possa extender nossa classe!
// Quando vc define como final vc está dizendo "O não quero que ninguem extenda minha classe!" ela vai ser a ultima da minha hierarquia e não quero permitir a extensão dela!

/*
Vamos supor que alguem queria zoar nosso sistema!
ela define a classe "Client" como um colaborador "Employee2" e nós não queremos permitir isso!
Não podemos usar "final" por que perderiamos nossa hierarquia de herança com o vendedor(SalesMan2) e nosso gerente(Manager)
usamos "Sealed" significa que ela é uma classe selada!
o que é isso ?

diferente do final, que não permite que a gente não coloque filhos pra ele, com o sealed a gente define que uma classe ela vai ter regras para permitir sub-classes
para fazer isso usamos "permits" para colocar as classes a baixo da hierarquia como permitidas para a herança
e para as classes com herança usamos o comando "non-sealed" serve para reabrir um hierarquia que foi declarada como "sealed"


*/