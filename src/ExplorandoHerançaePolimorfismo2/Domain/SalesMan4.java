package ExplorandoHerançaePolimorfismo2.Domain;

public non-sealed class SalesMan4 extends Employee4 {
    private double percentPerSold4;
    private double soldAmount;

    // Conceito de Sobrescrita!
    @Override
    public String getCode4() {
        return "SL" +  super.getCode4();
    }

    public double getPercentPerSold4() {
        return percentPerSold4;
    }

    public void setPercentPerSold4(double percentPerSold4) {
        this.percentPerSold4 = percentPerSold4;
    }

    public SalesMan4(String code4, String name4, String adress4, int age4, double salary4, double percentPerSold4, double soldAmount) {
        super(code4, name4, adress4, age4, salary4);
        this.percentPerSold4 = percentPerSold4;
        this.soldAmount = soldAmount;
    }

    public double getSoldAmount() {
        return soldAmount;
    }

    public void setSoldAmount(double soldAmount) {
        this.soldAmount = soldAmount;
    }

    public SalesMan4() {
    }

    //Implementação do método
    @Override
    public double getFullSalary() {
        return this.salary4 + ((soldAmount * percentPerSold4) / 100); // Para conseguir o percentual e somar ao nosso sálario!
    }
}

// A sobrescrita serve para podermos por exemplo no caso do "Code" diferenciar o SalesMan do Manager colocando um prefixo!
// o @Overide indica que você está sobrescrevendo um código que já existe em outro código!