package HerancaEpolimorfismo;

public class employee {

    // Começamos com private seguindo as boas praticas de encapsulamento
    private String code;
    private String name;
    private String adress;
    private int age;
    private double salary;

    // Criação das nossas propriedades getters e setters

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

// Temos nossa classe! nosso colaborador!