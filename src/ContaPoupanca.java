public class ContaPoupanca extends Conta {
    private static int SEQUENCIA = 9000;

    public ContaPoupanca(Cliente cliente){
        super(cliente);
        super.agencia = Conta.AGENCIA_PADRAO;
        super.numeroDaConta = this.SEQUENCIA++;
        
    }
    public void extrato(){
        System.out.println("======Conta Poupança=======");
        super.imprimeDadosDaConta();
        System.out.println("===========================");
    }
}
