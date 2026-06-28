package HerancaEpolimorfismo2;

import HerancaEpolimorfismo.employee;

public sealed class Employee2 permits Manager2, SalesMan2{
    private String code2;
    private String name2;
    private String adress2;
    private int age2;
    private double salary2;

    // Criação das nossas propriedades getters e setters

    public String getCode() {
        return code2;
    }

    public void setCode(String code) {
        this.code2 = code;
    }

    public String getName() {
        return name2;
    }

    public void setName(String name) {
        this.name2 = name;
    }

    public String getAdress() {
        return adress2;
    }

    public void setAdress(String adress) {
        this.adress2 = adress;
    }

    public int getAge() {
        return age2;
    }

    public void setAge(int age) {
        this.age2 = age;
    }

    public double getSalary() {
        return salary2;
    }

    public void setSalary(double salary) {
        this.salary2 = salary;
    }
}