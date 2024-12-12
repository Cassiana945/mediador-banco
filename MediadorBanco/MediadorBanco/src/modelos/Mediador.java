package modelos;

public class Mediador implements IMediador {

    private Poupanca poupanca;
    private Cheque cheque;
    private Saque saque;
    private Deposito deposito;

    @Override
    public void criaFilaPoupanca(Caixa p) {
        this.poupanca = (Poupanca) p;
    }

    @Override
    public void criaFilaSaque(Caixa p) {
        this.saque = (Saque) p;
    }

    @Override
    public void criaFilaCheque(Caixa p) {
        this.cheque = (Cheque) p;
    }

    @Override
    public void criaFilaDeposito(Caixa p) {
        this.deposito = (Deposito) p;
    }

    @Override
    public void controlaFila(int fila, int senha) {
         switch (fila) {
             case 1 : poupanca.redirecionar(senha);
             break;
             case 2 : saque.redirecionar(senha);
             break;
             case 3 : cheque.redirecionar(senha);
             break;
             case 4 : deposito.redirecionar(senha);
             default : System.out.println("Fila Inválida");
         }
    }
}
