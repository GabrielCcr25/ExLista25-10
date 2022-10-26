package br.com.NewtonPaiva.arrayList;
import javax.swing.JOptionPane;


public class Principal {
    public static void main(String[]args){
        Carro c1 = new Carro();
        c1.nome = "Palio";
        c1.cor = "Cinza";

        Carro c2 = new Carro();
        c2.nome = "Gol";
        c2.cor = "Preto";

        Carro c3 = new Carro();
        c3.nome = "C3";
        c3.cor = "Azul";

        Agencia ag = new Agencia();
        ag.nome = ("Lima");
        ag.adicionarCarro(c1);
        ag.adicionarCarro(c2);
        ag.adicionarCarro(c3);

        int qtdeCarros = ag.getQuantidadeCarros();

        JOptionPane.showMessageDialog(null, "A lista de carros da agencia "+ ag.nome + " possui: "+ qtdeCarros + " carros.");
    }
}
