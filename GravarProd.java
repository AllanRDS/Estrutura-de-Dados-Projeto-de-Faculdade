package meuPacote;
import java.util.Scanner;

import leituraarq3.Leituraarq3;
import java.util.ArrayList;

public class GravarProd {
    public static void main(String[] args) {
        ArrayList<Regpro> listaDeProdutos = Leituraarq3.lerProdutosDoArquivo();
        int num = 0;
        	Scanner input = new Scanner(System.in);
        	
        	while (num != 4) {
            	PilhaFila w = new PilhaFila();

            	System.out.println("Digite uma das opções abaixo para mostrar os dados : ");
            	System.out.println("1 - Lista | 2 - Pilha | 3 - Fila ");
            	System.out.println("4 - Sair do Menu ");
        	
            	num = input.nextInt();
        	
            	System.out.println("");
        	
        	
        	
	        	switch(num) 
	        	{
	        		case 1:
	        			 for (Regpro produto : listaDeProdutos) {
	        				 	System.out.println("ID: " + produto.getId());
	        				    System.out.println("Data Inicial: " + produto.getDataInicial());
	        				    System.out.println("País: " + produto.getPais());
	        				    System.out.println("");
	        				}
	        		break;
	        		
	        		case 2:
	        			w.pilha();
	        		break;
	        		
	        		case 3: 
	        			w.fila();
	        		break;
	        		
	        		case 4:
	        			System.out.println("Saindo do Menu .....");
	        		break;
	        		
	        		default:
	        			System.out.println("Opção invalida");
	        		break;
	        	}
	        	}
        	
	    }
	}
