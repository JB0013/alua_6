package view;

import model.ContaCorrente;
import model.ContaPoupanca;

public class UsuarioView {
   Mensagens mensagem = new Mensagens();
   
	public void InterFaceDoUsuario() {
		int Opcao;
		String OpcaoSelecionada;
		 mensagem.solicitarEntrada(""
				 + "Selecione uma opção"
				 + "\n1- Criar conta"
				 + "\n2- Fazer Saque"
				 + "\n3- Verificar saldo");
		 
		 Opcao = Integer.parseInt(OpcaoSelecionada);
		 
		 switch(Opcao) {
		 case 1:
		 	String tipoDeConta;
		 	tipoDeConta = mensagem
		 			.solicitarEntrada("Qual tipo de conta você deseja?"
		 	+ "\n1 - Conta Poupança" 
		 	+ "\n2 - Conta Corrente");
		 	
		 	if(tipoDeConta.equals("2"))  {
		 		 ContaCorrente conta = new ContaCorrente(EmailUsuario);
		 	}
		 	if(tipoDeConta.equals("1"))  {
		 		 ContaPoupanca conta = new ContaPoupanca();
		 	}
		 break;
		 
		 case 2:
			 
		 break;
	 
		 
		 
		 
		 
		 
		 }
		
	}
	
	
	
	
}
