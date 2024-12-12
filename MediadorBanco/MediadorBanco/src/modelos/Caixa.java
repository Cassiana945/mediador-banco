package modelos;


public abstract class Caixa {
protected IMediador imediador;

    public Caixa(IMediador imediador) {
        this.imediador = imediador;
    }

    public abstract void listaFila();

    public abstract void redirecionar(int senha);

    public abstract void atender();


}
