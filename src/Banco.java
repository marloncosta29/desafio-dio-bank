import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome){
        this.nome = nome;
        this.contas = new ArrayList<Conta>();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void adicionarNovaConta(Conta conta) {
        this.contas.add(conta);
    }

    public void ListarContas() {
        System.out.println("=======Contas cadastratas======");
        System.out.println("Banco: " + this.nome);
        System.out.println("===============================");

        for (Conta conta : contas) {

            conta.imprimeDadosDaConta();
            System.out.println("-----------------------------");

        }
    }

}
