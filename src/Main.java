
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		venilton.setCpf("11122233344455");
		Cliente raphael = new Cliente();
		raphael.setNome("Raphael");
		raphael.setCpf("22233344455566");
		
		Conta cc1 = new ContaCorrente(venilton);
		Conta poupanca1 = new ContaPoupanca(venilton);
		Conta cc2 = new ContaCorrente(raphael);
		Conta poupanca2 = new ContaPoupanca(raphael);


		cc1.depositar(100);
		cc1.transferir(100, poupanca1);
		cc1.depositar(200);
		cc2.depositar(300);
		cc2.transferir(100, poupanca2);
		cc2.transferir(100, poupanca1);
		cc1.imprimirExtrato();
		poupanca1.imprimirExtrato();
		cc2.imprimirExtrato();
		poupanca2.imprimirExtrato();
	}

}
