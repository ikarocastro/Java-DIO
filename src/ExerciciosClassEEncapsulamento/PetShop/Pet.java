package ExerciciosClassEEncapsulamento.PetShop;

public class Pet {
    private final String nome;
    // Final pois nãom queremos alterar o nome do pet uma vez cadastrado

    private boolean clean;
    // Informar se ele está limpo ou não

    //Construtor

    public Pet(String nome) {
        this.nome = nome;
        this.clean = false; //Para inicializar, pois ele vai entrar no sistema quanod estiver sujo!
    }

    public String getNome() {
        return nome;
    }

    public boolean isClean() {
        return clean;
    } // Retorna se ele está como limpo!

    public void setClean(boolean clean) {
        this.clean = clean;
    }
}


// Dica: alt + ins = abre menu para criação