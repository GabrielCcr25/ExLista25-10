package br.com.NewtonPaiva.Moto;

public class MainMoto {
    public static void main(String[]args){
        Moto moto1 = new Moto();
        moto1.nome = "CG";
        moto1.cor = "Vermelho";

        Moto moto2 = new Moto();
        moto2.nome = "Tyger";
        moto2.cor = "Cinza";

        Agencia agencia = new Agencia();

        agencia.adicionaMoto(moto1);
        agencia.adicionaMoto(moto2);

        public
    }
}
