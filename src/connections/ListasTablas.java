package connections;

public class ListasTablas {

    private String campo;
    private Object valor;

    public ListasTablas(String campo, Object valor) {
        this.campo = campo;
        this.valor = valor;
    }

    ListasTablas() {
        //To change body of generated methods, choose Tools | Templates.
    }

    public void add(String campo, Object valor) {
        this.campo = campo;
        this.valor = valor;
    }

    public String getCampo() {
        return campo;
    }

    public Object getValor() {
        return valor;
    }
}
