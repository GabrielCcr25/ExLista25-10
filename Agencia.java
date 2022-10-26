package br.com.NewtonPaiva.arrayList;
import java.util.ArrayList;
public class Agencia {
    String nome;

    // Criando uma lista de Carros do Tipo Carros(Um ArrayList de Carros)
    ArrayList<Carro> listaCarros = new ArrayList<Carro>();
    // criando um metodo sem retorno para incluir tipos  de carros dentro da lista de Carros
    public void adicionarCarro(Carro carro){
        listaCarros.add(carro);

    }
    //Utilizando a propriedade size da Classe ArrayList para contar a qtd de carros na lista
    public int getQuantidadeCarros(){
        return listaCarros.size();
    }
    public  double calcularPreco(){
        double somaValor = 0.0;
        for(int i=0; i<listaCarros.size();i++){
            Carro carro = (Carro)listaCarros.get(i);
            somaValor+=carro.valor;
        }
        return somaValor;

    }



}
