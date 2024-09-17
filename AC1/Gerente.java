public class Gerente {
        private String nome;
        private double salarioBase;
        private float salarioPadrao;
        private float bonus;
    
        public String getNome() {
            return nome;
        }
        public void setNome(String nome){
            this.nome = nome;
        }
        public double calcularSalario(){
            if (salarioBase != salarioPadrao) {
                return salarioBase;
            }else{
                return salarioPadrao;
            }
        }
        public void setSalario(double salarioBase, float bonus){
            if (bonus > 0 && bonus < 1) {
                this.bonus = bonus;
                this.salarioBase = salarioBase + (salarioBase * this.bonus);
            }else if (bonus > 0 && bonus > 1) {
                this.bonus = bonus;
                this.salarioBase = salarioBase + (salarioBase * (this.bonus/100));
            }

        }
        public void setSalario(float salarioPadrao, float bonus){
            if (bonus > 0 && bonus < 1) {
                this.bonus = bonus;
                this.salarioPadrao = salarioPadrao + (salarioPadrao * this.bonus);
            }else if (bonus > 0 && bonus > 1) {
                this.bonus = bonus;
                this.salarioPadrao = salarioPadrao + (salarioPadrao * (this.bonus/100));
            }
        }
}
