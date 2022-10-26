package br.com.NewtonPaiva.Moto;
import java.util.ArrayList;
public class Agencia {
        String nome;

        ArrayList<Moto>listaMotos = new ArrayList<Moto>();

        public void adicionaMoto(Moto moto){
            listaMotos.add(moto);

        }
        public double getQuantidadeMoto(){
                return listaMotos.size();
        }



}
