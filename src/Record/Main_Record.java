package Record;

public class Main_Record {
    public static void main(String[] args) {
        // Criando Instancia
        var person = new Person("Kaio", 20);
        System.out.println(person); // resultara em Person[name=Kaio, age=20]
        System.out.println(person.name()); // como um get resultado : Kaio
    }
}
