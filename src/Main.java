
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		Cliente raphael = new Cliente();
		raphael.setNome("Raphael");
		
		Conta cc1 = new ContaCorrente(venilton);
		Conta poupanca1 = new ContaPoupanca(venilton);
		Conta cc2 = new ContaCorrente(venilton);
		Conta poupanca2 = new ContaPoupanca(venilton);


		cc.depositar(100);
		cc.transferir(100, poupanca);
		cc.depositar(200);
		cc1.depositar(300);
		cc1.transferir(100, poupanca);
		cc1.transferir(100, poupanca1);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		cc1.imprimirExtrato();
		poupanca1.imprimirExtrato();
	}

}
