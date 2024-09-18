public class App {
    public static void main(String[] args) throws Exception {
        Banco banco = new Banco("PruPruBank");

        Cliente clientUm = new Cliente("john doe");
        Cliente clientDois = new Cliente("maria ma");

        ContaCorrente contaCorrenteUm = new ContaCorrente(clientUm);
        ContaPoupanca contaPoupancaUm = new ContaPoupanca(clientUm);
        ContaCorrente contaCorrenteDois = new ContaCorrente(clientDois);
        ContaPoupanca contaPoupancaDois = new ContaPoupanca(clientDois);

        banco.adicionarNovaConta(contaCorrenteUm);
        banco.adicionarNovaConta(contaCorrenteDois);
        banco.adicionarNovaConta(contaPoupancaUm);
        banco.adicionarNovaConta(contaPoupancaDois);

        banco.ListarContas();
        System.out.println("================="+ clientUm.getNome() +"===================");
        contaCorrenteUm.depositar(2000);
        contaCorrenteUm.transferir(200, contaPoupancaUm);
        contaCorrenteUm.extrato();
        contaPoupancaUm.extrato();

        System.out.println("================="+ clientDois.getNome() +"===================");
        contaCorrenteDois.depositar(3000);
        contaCorrenteDois.transferir(1500, contaPoupancaDois);
        contaCorrenteDois.sacar(2000);
        contaPoupancaDois.sacar(200);

        contaCorrenteDois.extrato();
        contaPoupancaDois.extrato();









        
    }   
}
