package ExplorandoHerançaePolimorfismo2.Domain;

public non-sealed class Manager4 extends Employee4 {
    private String login4;
    private String password4;
    private double commission4;

    @Override
    public String getCode4(){
        return "MN" + this.code4;
    }

    public String getLogin4() {
        return login4;
    }

    public void setLogin4(String login4) {
        this.login4 = login4;
    }

    public String getPassword4() {
        return password4;
    }

    public void setPassword4(String password4) {
        this.password4 = password4;
    }

    public double getCommission4() {
        return commission4;
    }

    public void setCommission4(double commission4) {
        this.commission4 = commission4;
    }

    public Manager4(String code4, String name4, String adress4, int age4, double salary4, String login4, String password4, double commission4) {
        super(code4, name4, adress4, age4, salary4);
        this.login4 = login4;
        this.password4 = password4;
        this.commission4 = commission4;
    }

    public Manager4() {
    }

    //Implementação do método
    @Override
    public double getFullSalary() {
        return this.salary4 + this.commission4;
    }

    public double getFullSlary(double extra){
        return getFullSalary() + extra;
    }
}

// A clausula "Super" é usada para acionar algum comportamento da classe pai!