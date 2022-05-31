
public class Main {

    public static void main(String[] args) {
        Cliente insertNewClient = new Cliente();
        insertNewClient.setNome("Caroline");

        Conta cc = new ContaCorrente(insertNewClient);
        Conta poupanca = new ContaPoupanca(insertNewClient);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
