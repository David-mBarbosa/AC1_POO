public class Funcionario{
    private String nome;
    private double salarioBase;
    private float salarioPadrao;

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
    public void setSalario(double salarioBase){
        this.salarioBase = salarioBase;
    }
    public void setSalario(float salarioPadrao){
        this.salarioPadrao = salarioPadrao;
    }
}