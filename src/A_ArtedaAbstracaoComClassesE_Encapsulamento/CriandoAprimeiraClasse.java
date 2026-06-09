package A_ArtedaAbstracaoComClassesE_Encapsulamento;

public class CriandoAprimeiraClasse {
    public static void main(String[] args) {
        // Use new para instanciar. Cada objeto tem seu próprio estado.
        Pessoa male = new Pessoa(); // Declaramos nosso objeto Pessoas

        /* O metodo setter usa para modificar são (Métodos que alteram um atributo, podendo validar o valor antes. Convenção: set + NomeDoAtributo.)*/
        /* Se um atributo não deve ser alterado após a criação, não crie o setter. Isso torna o objeto imutável para aquele campo.*/
        male.setName("João");
        male.setAge(25);

        Pessoa female = new Pessoa();

        female.setName("Maria");
        female.setAge(26);

        System.out.println("Male name: " + male.getNome() + " tem: " + male.getAge() + " anos!");
        System.out.println("Female name: " + female.getNome() + " tem: " + female.getAge() + " anos!");
    }

}
//com a troca do public por private o código quebra e nós temos que passar o parametro no código ex: antes (male.name), agora (male.getName()).
// Parei no minuto 13:24