package br.com.NewtonPaiva.Sacolao;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[]args){
        Fruta fruta1 = new Fruta();
        fruta1.nome = "Melão";

        Fruta fruta2 = new Fruta();
        fruta2.nome = "Uva";

        Fruta fruta3 = new Fruta();
        fruta3.nome = "Banana";

        Sacolao sacolao = new Sacolao();
        sacolao.nome = ("Lima");

        sacolao.adicionaFruta(fruta1);
        sacolao.adicionaFruta(fruta2);
        sacolao.adicionaFruta(fruta3);

        int qtdeFrutas = sacolao.getQuantidadeFrutas();

        JOptionPane.showMessageDialog(null, "O sacolão " + sacolao.nome + " tem " + sacolao.getQuantidadeFrutas() + " frutas");







    }
}
