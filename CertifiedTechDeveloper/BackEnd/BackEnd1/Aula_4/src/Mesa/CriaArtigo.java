package Mesa;

public class CriaArtigo {
    public static void main(String[] args) {
        CheckQuality processo = new CheckQuality();

        processo.verificar(new Artigo("Celular", 1230, 500, "Saudavel"));
        processo.verificar(new Artigo("Computador", 2000, 2000, "Amassado"));
        processo.verificar(new Artigo("Televisor", 1300, 1200, "Quase saudavel"));
        processo.verificar(new Artigo("Mesa", 1500, 1300, "Saudavel"));
        processo.verificar(new Artigo("Cadeira", 1000, 1400, "Amassado"));
        processo.verificar(new Artigo("Bicicleta", 2300, 2100, "Quase saudavel"));
    }
}
