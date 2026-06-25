package ExerciciosClassEEncapsulamento.PetShop;
// TEMOS NOSSAS REGRAS DE NÉGOCIO!
    public class PetMachine {

        private boolean clean = true;

        private int water = 30;

        private int shampoo = 10;

        private Pet pet;

        public void takeAShower() {
            if (this.pet == null) {
                System.out.println("Coloque o Pet na máquina para iniciar o banho!");
                return;
            }

            this.water -= 10;
            this.shampoo -= 2;
            pet.setClean(true);
        }

        public void addWater() {
            if (water == 30) {
                System.out.println("A capacidade de Água chegou no máximo!");
                return;
            }
            water += 2;
        }

        public void addShampoo() {
            if (shampoo == 10) {
                System.out.println("A capacidade de Shampoo chegou no máximo!");
                return;
            }
            shampoo += 2;
        }

        // METODOS GETTERS

        public int getWater() {
            return water;
        }


        public int getShampoo() {
            return shampoo;
        }

       public boolean hasPet(){
            return pet != null;
       }

        public void setPet(Pet pet){
            if (!this.clean){
                System.out.println("A máquina está suja, para colocar um Pet é necessário limpa-la!");
                return;
            }
            if (this.pet != null){
                System.out.println("O pet" + this.pet.getNome() + "Está na maquina nesse momento!");
                return;
            }
            this.pet = pet;
        }

            public void removePet(){
            this.clean = this.pet.isClean();
                System.out.println("O pet " + this.pet.getNome() + " está limpo");
                this.pet = null;
            }

            public void wash(){
            this.water -= 10;
            this.shampoo -= 2;
            this.clean = true;
                System.out.println("A máquina foi limpa!");
            }

        //final linha Class
    }

// Dica alt + ins abre o menu de criação!