package padroescriacao.singleton;

public class Lanches {

    private Lanches() {};
    private static Lanches instance = new Lanches();
    public static Lanches getInstance() {
        return instance;
    }

    private String nomeLanche;
    private String usuarioLogado;

    public String getNomeLanches() {
        return nomeLanche;
    }

    public void setNomeLanches(String nomeLanche) {
        this.nomeLanche = nomeLanche;
    }

    public String getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(String usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }
}
