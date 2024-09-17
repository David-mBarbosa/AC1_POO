public class Diretor {
        private String nome;
        private double salarioBase;
        private float salarioPadrao;
        private double bonus;
        private double auxilioMoradia;
    
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
        public void setSalario(double salarioBase, double bonus, double auxilioMoradia){
            if (bonus > 0 && bonus < 1) {
                this.bonus = bonus;
                this.salarioBase = (salarioBase * this.bonus) + this.auxilioMoradia;
            }else if (bonus > 0 && bonus > 1) {
                this.bonus = bonus;
                this.salarioBase = (salarioBase * (this.bonus/100)) + this.auxilioMoradia;
            }

        }
        public void setSalario(float salarioPadrao, double bonus, double auxilioMoradia){
            if (bonus > 0 && bonus < 1) {
                this.bonus = bonus;
                this.salarioPadrao = (float) ((salarioPadrao * this.bonus) + this.auxilioMoradia);
            }else if (bonus > 0 && bonus > 1) {
                this.bonus = bonus;
                this.salarioPadrao = (float) ((salarioPadrao * (this.bonus/100)) + this.auxilioMoradia);
            }
        }
}
