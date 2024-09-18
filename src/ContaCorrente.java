public class ContaCorrente extends Conta {
    private static int SEQUENCIA = 8000;
    public ContaCorrente(Cliente cliente){
        super(cliente);
        super.agencia = Conta.AGENCIA_PADRAO;
        super.numeroDaConta = this.SEQUENCIA++;
    }
    public void extrato(){
        System.out.println("======Conta Corrente=======");
        super.imprimeDadosDaConta();
        System.out.println("===========================");
    }
}
