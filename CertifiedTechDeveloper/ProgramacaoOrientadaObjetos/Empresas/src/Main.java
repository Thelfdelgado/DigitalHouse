class Main {
    public static void main(String[] args) {
        EmpregadoFactory ef = EmpregadoFactory.getInstance();
        Empregado empregado = ef.criarEmpregado("Nome", "EMP-INT");
        ((EmpregadoRelacaoDep) empregado).setSalarioMensal(1200);

        Empregado empregado2 = ef.criarEmpregado("Nome", "EMP-EXT");
        ((EmpregadoContratado) empregado2).setValorHora(5);
        ((EmpregadoContratado) empregado2).setImposto(3.0);

        System.out.println(empregado.calcularSalario(2));
        System.out.println(empregado2.calcularSalario(2));
    }
}