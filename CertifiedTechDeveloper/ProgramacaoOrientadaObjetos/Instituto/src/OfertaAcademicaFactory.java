public class OfertaAcademicaFactory {
    private static OfertaAcademicaFactory instance;
    public final static String FRONT_END = "front";
    public final static String BACK_END = "back";
    private final static String PROGRAMA = "programa";
    private OfertaAcademicaFactory() {}

    public static OfertaAcademicaFactory getInstance() {
        if (instance == null) {
            instance = new OfertaAcademicaFactory();
        }

        return instance;
    }

    public OfertaAcademica criarOferta(String oferta) {
        switch (oferta) {
            case FRONT_END:
                return new Curso("FRONT_END", "front", 16, 2, 1000);
            case BACK_END:
                return new Curso("BACK_END", "back", 20, 2, 900);
            default:
                return new ProgramaIntensivo("Programa Intensivo", "abc", 20);
        }
    }
}
