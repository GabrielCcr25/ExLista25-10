package br.com.NewtonPaiva.Sacolao;
import java.util.ArrayList;
public class Sacolao {
    String nome;


    ArrayList <Fruta> listaFrutas = new ArrayList<Fruta>();


    public void adicionaFruta(Fruta fruta1){
        listaFrutas.add(fruta1);

    }
    public int getQuantidadeFrutas(){
        return listaFrutas.size();
    }






}
