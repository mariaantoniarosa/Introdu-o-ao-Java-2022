package introdutionJava;

//importante classe JOptionPane para usarmos os paineis de código
import javax.swing.JOptionPane;

public class Main { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maior = 0;	
		int [] valores = new int [10];
		
	
		// receber e guardar os 10 numeros
		
		for (int i = 0; i<10; i++ ) {
				
				valores [i] = Integer.parseInt(JOptionPane.showInputDialog ("Informe o "+ (i+1)+" º valor: "));
				 if (valores[i] > maior) {
					 maior= valores[i];
				 }
					 
			
			while (valores[i]<0) {
				valores [i] = Integer.parseInt(JOptionPane.showInputDialog ("Informe novamente o "+ (i+1)+" º valor: "));
			}	
				
		}			
		//criando variável para armazenar se usuário deseja encerrar o programa
		String repetir = ""; 
		// início da estrutura de repetição para o menu 
		do {
			//solicitando opção do menu 
			int opcao = Integer.parseInt(JOptionPane.showInputDialog("O que você deseja ver? "
   																   + "\n 1 - Todos os valores"
																   + "\n 2 - Somente o primeiro valor"
																   + "\n 3 - Somente o último valor"
																   + "\n 4 - Ver os valores pares"
			                                                       + "\n 5 - Ver o Maior Valor"));
			//programação do menu 
			switch (opcao) { 
			//Mostrando todos os valores 
			case 1: 
				for (int i = 0; i<10; i++) { 
					JOptionPane.showMessageDialog(null,valores[i], "Valor " + (i+1), JOptionPane.INFORMATION_MESSAGE);				
			}
			break; 
			// Mostrando somente o primeiro valor
			case 2: 
				JOptionPane.showMessageDialog(null, valores[0], "primeiro valor", JOptionPane.INFORMATION_MESSAGE );
			break;
			//Mostrando Somente o último valor
			case 3: 
				JOptionPane.showMessageDialog(null, valores [9], "Último valor", JOptionPane.INFORMATION_MESSAGE);
				break;
				//mostrando somente os valores pares
			case 4:
				String valoresPares = " ";
				for (int i = 0; i<10; i++) {
					if (valores[i]%2==0) { 
						if (valoresPares!= " ") {
							valoresPares+= ",";
						}
						valoresPares+= valores[i];
					}
				 }
			case 5: 
				JOptionPane.showMessageDialog(null, maior, "Maior valor", JOptionPane.INFORMATION_MESSAGE);
					
			break;
			//caso a opção seja inválida
			default: 
				JOptionPane.showMessageDialog(null,"Opção inválida", "erro", JOptionPane.WARNING_MESSAGE);
			break;
		
			    }
		//solicitando se usuário deseja voltar ao menu 
			repetir = JOptionPane.showInputDialog("Deseja voltar ao menu? " 
											    + "\n Digite S para sim ou outro caractere para encerrar: ");
			
		// fim da estrutura de repetição para o menu 
		}while (repetir.equalsIgnoreCase("S"));
	
		 
	 
	 }
	
	}



