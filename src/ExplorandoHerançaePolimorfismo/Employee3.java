package ExplorandoHerançaePolimorfismo;


public sealed class Employee3 permits Manager3, SalesMan3 {
    private String code3;
    private String name3;
    private String adress3;
    private int age3;
    private double salary3;

    public String getCode3() {
        return code3;
    }

    public void setCode3(String code3) {
        this.code3 = code3;
    }

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public String getAdress3() {
        return adress3;
    }

    public void setAdress3(String adress3) {
        this.adress3 = adress3;
    }

    public int getAge3() {
        return age3;
    }

    public void setAge3(int age3) {
        this.age3 = age3;
    }

    public double getSalary3() {
        return salary3;
    }

    public void setSalary3(double salary3) {
        this.salary3 = salary3;
    }
}
