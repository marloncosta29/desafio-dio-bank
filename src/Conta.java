public abstract class Conta {
    protected static final int AGENCIA_PADRAO = 1;
    
    protected int agencia;
    protected int numeroDaConta;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }
    public int getNumeroDaConta() {
        return numeroDaConta;
    }
    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valorParaSacar){
        if(saldo < valorParaSacar){
            System.out.println("Saldo insuficiente");
        }else {
            saldo -= valorParaSacar;
            System.out.println("Saque autorizado no valor de " +  valorParaSacar);
        }
    }
    public void depositar(double valorParaDepositar){
        if(valorParaDepositar > 0){
            this.saldo += valorParaDepositar;
            System.out.println("Valor depositado com sucesso");
        }else {
            System.out.println("Digite um valor valido");
        }
    }
    public void transferir(double valorParaTransferir, Conta contaDestino){
        if(valorParaTransferir < 0){
            System.out.println("Digite um valor valido");
        }else if (this.saldo < valorParaTransferir){
            System.out.println("Saldo insuficiente");
        }else{
            this.sacar(valorParaTransferir);
            contaDestino.depositar(valorParaTransferir);
        }
    }

    protected void imprimeDadosDaConta(){
        System.out.println("Cliente: " + this.cliente.getNome());
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Numero: " + this.numeroDaConta);
        System.out.println("Saldo: " + this.saldo);
    }
}
