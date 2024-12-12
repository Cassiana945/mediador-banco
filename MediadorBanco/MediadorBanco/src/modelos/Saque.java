package modelos;

import java.util.LinkedList;
import java.util.Queue;

public class Saque extends Caixa {
    private Queue<Integer> fila = new LinkedList<>();

    public Saque(IMediador imedidor) {
        super(imedidor);
    }

    @Override
    public void listaFila() {
        System.out.println("Fila do Saque: " + fila);
    }

    @Override
    public void redirecionar(int senha) {
        fila.add(senha);
        System.out.println("Próxima Senha no Caixa do Saque:  " + senha);
    }

    @Override
    public void atender() {
        if (!fila.isEmpty()) {
            int senha = fila.poll();
            System.out.println("Atendendo a Senha " + senha + " no Saque.");
        }
    }


}
