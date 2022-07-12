public class Main {
    public static void main(String[] args) {
        OfertaAcademicaFactory factory = OfertaAcademicaFactory.getInstance();

        OfertaAcademica cursoFrontEnd = factory.criarOferta(OfertaAcademicaFactory.FRONT_END);

        OfertaAcademica cursoBackEnd = factory.criarOferta(OfertaAcademicaFactory.BACK_END);

        ProgramaIntensivo intensivo = new ProgramaIntensivo("Full Stack", "Full Stack", 20);

        intensivo.addCurso((Curso) cursoFrontEnd);
        intensivo.addCurso((Curso) cursoBackEnd);

        Instituto instituto = new Instituto("Escola");
        instituto.adicionar(cursoFrontEnd);
        instituto.adicionar(cursoBackEnd);
        instituto.adicionar(intensivo);

        instituto.relatorio();
    }
}
