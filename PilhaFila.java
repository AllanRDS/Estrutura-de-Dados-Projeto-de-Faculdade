package meuPacote;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import leituraarq3.Leituraarq3;

public class PilhaFila {
	
	Queue<Regpro> fila = new LinkedList<>();
	Stack<Regpro> pilha = new Stack<>();
	
	ArrayList<Regpro> minhaListaPilha = new ArrayList<> ();
	
	
	public void pilha() 
	{
		
		minhaListaPilha = Leituraarq3.lerProdutosDoArquivo();
		
		for (Regpro elemento : minhaListaPilha) 
		{
			pilha.push(elemento);
		}
		
		
		while (!pilha.empty()) 
		{
			Regpro elementoDesempilhado = pilha.pop();
			
			System.out.println("ID: " + elementoDesempilhado.getId());
		    System.out.println("Data Inicial: " + elementoDesempilhado.getDataInicial());
		    System.out.println("País: " + elementoDesempilhado.getPais());		
		    System.out.println("");
		}
	}
	
	public void fila() 
	{
		minhaListaPilha = Leituraarq3.lerProdutosDoArquivo();
		
		for (Regpro elemento2 : minhaListaPilha) 
		{
			fila.add(elemento2);
		}
		
		
		for (Regpro elemento2 : minhaListaPilha) 
		{
			Regpro topo = fila.peek();
			
			if (topo != null) 
			{
				System.out.println("ID: " + topo.getId());
			    System.out.println("Data Inicial: " + topo.getDataInicial());
			    System.out.println("País: " + topo.getPais());
			    System.out.println("");
			}
			
			fila.poll(); 
		}
		
	}
}
