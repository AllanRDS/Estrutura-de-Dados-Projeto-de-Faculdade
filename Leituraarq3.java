package leituraarq3;

import meuPacote.Regpro;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Leituraarq3 {

    public static ArrayList<Regpro> lerProdutosDoArquivo() {
        String caminhoArquivo = "C:\\Users\\AllanRDS\\Pictures\\Pedido.txt";
        ArrayList<Regpro> listaDeProdutos = new ArrayList<>();

        int id;
        String dataInicial;
        String pais;

        try {
            File arquivo = new File(caminhoArquivo);
            Scanner leitor = new Scanner(arquivo);

            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();

                try {
                    id = Integer.parseInt(linha.substring(0, 5));
                    dataInicial = linha.substring(14,24);
                    pais = linha.substring(71, 82);
                    
                    Regpro produto = new Regpro(id, dataInicial, pais);
                    listaDeProdutos.add(produto);
                } catch (Exception ex) {
                    System.out.println("Erro ao processar linha: " + linha);
                    ex.printStackTrace();
                }
            }

            leitor.close();

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + caminhoArquivo);
        }

        return listaDeProdutos;
    }
}
