package Record;

// No record passamos os atributos nos () "record Person"
public record Person(String name, int age) {

    //Construindo um construtor compacto

    public  Person{
        System.out.println("=========");
        System.out.println(name);
        System.out.println(age);
        System.out.println("=========");
    }
}
