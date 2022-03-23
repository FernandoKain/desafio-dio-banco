
public class Main {

	public static void main(String[] args) {
		
		Cliente fernando = new Cliente();
		fernando.setNome("Fernando");
		
		Conta cc1 = new ContaCorrente(fernando);
		Conta poupanca1 = new ContaPoupanca(fernando);
		
		cc1.depositar(100);
		cc1.transferir(10, poupanca1);
		
		cc1.imprimirExtrato();
		poupanca1.imprimirExtrato();

	}

}
