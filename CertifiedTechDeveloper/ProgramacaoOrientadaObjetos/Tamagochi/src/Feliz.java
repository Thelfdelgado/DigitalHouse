public class Feliz implements Estado{
    @Override
    public void comer() {
        System.out.println("Feliz - Nao muda");
    }

    @Override
    public void beber() {
        System.out.println("bip bip bip bip bip");
    }

    @Override
    public void carinho() {
        System.out.println("bip bip");
    }
}
