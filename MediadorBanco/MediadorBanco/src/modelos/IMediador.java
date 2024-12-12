package modelos;

public interface IMediador {

     void criaFilaPoupanca(Caixa p);
     void criaFilaSaque(Caixa p);
     void criaFilaCheque(Caixa p);
     void criaFilaDeposito(Caixa p);
     void controlaFila (int fila, int senha);
}
