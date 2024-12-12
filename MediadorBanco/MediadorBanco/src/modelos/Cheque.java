package modelos;

import java.util.LinkedList;
import java.util.Queue;

public class Cheque extends Caixa {
    private Queue<Integer> fila = new LinkedList<>();

    public Cheque(IMediador imedidor) {
        super(imedidor);
    }

    @Override
    public void listaFila() {
        System.out.println("Fila do Cheque: " + fila);
    }

    @Override
    public void redirecionar(int senha) {
        fila.add(senha);  // adicionando a senha
        System.out.println("Próxima Senha no Caixa do Cheque: " + senha);
    }

    @Override
    public void atender() {
        if (!fila.isEmpty()) {
            int senha = fila.poll(); // tirando a senha
            System.out.println("Atendendo a Senha " + senha + " no Cheque.");
        }
    }


}
