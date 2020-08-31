package pkg28ºcalculadora;

import Apresentacao.Front;

public class Main 
{

    public static void main(String[] args) 
    {
        /*INSTANCIANDO NOSSA CLASSE frmPrincipal(CLASSE QUE SERA FEITO O FRONT) EM UM OBJETO COM O NOME DE fr*/
        Apresentacao.Front fr = new Front(null, true);
        /*CHAMANDO NOSSO OBJETO E DEIXANDO ELE VISILVEL*/
        fr.setVisible(true);
                
    }
}
