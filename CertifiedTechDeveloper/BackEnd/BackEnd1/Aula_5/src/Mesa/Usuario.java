package Mesa;

public class Usuario {
    private String assinatura;
    private String id;

    public Usuario(String assinatura, String id) {
        this.assinatura = assinatura;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAssinatura() {
        return assinatura;
    }

    public void setAssinatura(String assinatura) {
        this.assinatura = assinatura;
    }

    @Override
    public String toString() {
        return "Usuario "+ id + " - " + assinatura;
    }
}
