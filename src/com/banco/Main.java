package com.banco;

public class Main {
	
	public static void main(String[] args) {
		Cliente Francine = new Cliente();
		Francine.setNome("Francine");
		
		
		Conta cc = new ContaCorrente(Francine);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(Francine);
		cc.transferir(100,poupanca);
		
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	
      

	}
}
