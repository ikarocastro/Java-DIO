package ExplorandoHerançaePolimorfismo2.Domain;

public sealed abstract class Employee4 permits Manager4, SalesMan4 {
    protected String code4;
    protected String name4;
    protected String adress4;
    protected int age4;
    protected double salary4;

    public String getCode4() {
        return code4;
    }

    public void setCode4(String code4) {
        this.code4 = code4;
    }

    public String getName4() {
        return name4;
    }

    public void setName4(String name4) {
        this.name4 = name4;
    }

    public String getAdress4() {
        return adress4;
    }

    public void setAdress4(String adress4) {
        this.adress4 = adress4;
    }

    public int getAge4() {
        return age4;
    }

    public void setAge4(int age4) {
        this.age4 = age4;
    }

    public double getSalary4() {
        return salary4;
    }

    public void setSalary4(double salary4) {
        this.salary4 = salary4;
    }

    public Employee4(String code4, String name4, String adress4, int age4, double salary4) {
        this.code4 = code4;
        this.name4 = name4;
        this.adress4 = adress4;
        this.age4 = age4;
        this.salary4 = salary4;
    }

    public Employee4() {
    }

    public double getFullSalary() {
        return this.salary4;
    }
}
