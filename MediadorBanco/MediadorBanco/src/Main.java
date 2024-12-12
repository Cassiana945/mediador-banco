import modelos.*;

public class Main {
    public static void main(String[] args) {

        Mediador mediador = new Mediador();

        Caixa poupanca = new Poupanca(mediador);
        Caixa saque = new Saque(mediador);
        Caixa cheque = new Cheque(mediador);
        Caixa deposito = new Deposito(mediador);


        mediador.criaFilaPoupanca(poupanca);
        mediador.criaFilaSaque(saque);
        mediador.criaFilaCheque(cheque);
        mediador.criaFilaDeposito(deposito);

        int senha = 1;

        mediador.controlaFila(1, senha++);
        mediador.controlaFila(2, senha++);
        mediador.controlaFila(3, senha++);
        mediador.controlaFila(4, senha++);

        poupanca.listaFila();
        saque.listaFila();
        cheque.listaFila();
        deposito.listaFila();

        poupanca.atender();
        saque.atender();
        cheque.atender();
        deposito.atender();
    }
}