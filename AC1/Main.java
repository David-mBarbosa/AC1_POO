public class Main {
    public static void main(String[] args) {
        String nomeF1 = "João";
        double salarioBase = 3000;
        float salarioPadrao = 1700;
        String nomeG1 = "Maria";
        double salarioBasegerente = 5000;
        float salarioPadraogerente = 4200;
        float bonus = 15;
        Funcionario f1 = new Funcionario();
        f1.setNome(nomeF1);
        f1.setSalario(salarioBase);
        f1.setSalario(salarioPadrao);
        System.out.println("O funcionário " + f1.getNome() + " possui o salário de " + f1.calcularSalario());
        Gerente g1 = new Gerente();
        g1.setNome(nomeG1);
        g1.setSalario(salarioBasegerente, bonus);
        g1.setSalario(salarioPadraogerente, bonus);
        System.out.println("A gerente " + g1.getNome() + " possui o salário de " + g1.calcularSalario());
    }
}
