package Modelo;

//HERDANDO ATRIBUTOS DA MINHA CLASSE "Atributos"
public class Calculos extends Atributos
{

    //sempre que instanciarmos essa classe ela ira precisar de parametros definidos na linha abixo
    public Calculos(Double num1Double, Double num2Double, String operacao) 
    {
        super(num1Double, num2Double, operacao);
        Calcular();
    }

    /*CRIANDO NOSSO METODO (FUNÇÃO) Calcular() QUE ESTA EM private OU SEJA,
    SOMENTE A CLASSE QUE ELE ESTA CONSEGUE CHAMA-LO, ESSE METODO IRA DEFINIR NOSSA OPERAÇÃO MATEMATICA*/
    public void Calcular()
    {
        /*DEFINIMOS QUAL METODO IRA SER CHAMADO*/
        if(this.getOperacao().equals("+"))
        {
            Soma();
        }
        if(this.getOperacao().equals("-"))
        {
            Subtrai();
        }    
        if(this.getOperacao().equals("*"))
        {
            Multiplica();
        }
        if(this.getOperacao().equals("/"))
        {
            Dividi();
        }
    
    }
    
    /*CRIANDO METODO (FUNÇÃO) Somar() QUE IRA SOMAR O Num1Double() COM O Num2Double()
      QUE ESTA EM private OU SEJA, SOMENTE A CLASSE QUE ELE ESTA CONSEGUE CHAMA-LO
      REPETIMOS ISSO PARA TODOS OS OUTROS METODOS*/
    private void Soma()
    {
        /*FAZEMOS A OPERAÇÃO*/
        this.setResultado(this.getNum1Double() + this.getNum2Double());
        /*USAMOS SET PARA ALTERAR O RESULTADO E GET PARA PEGAR O NOVO RESULTADO*/
        this.setResultado(this.getResultado());
    }
    
    /*CRIANDO METODO (FUNÇÃO) Subtrai() QUE IRA SOMAR O Num1Double() COM O Num2Double()
      QUE ESTA EM private OU SEJA, SOMENTE A CLASSE QUE ELE ESTA CONSEGUE CHAMA-LO
      REPETIMOS ISSO PARA TODOS OS OUTROS METODOS*/
    private void Subtrai()
    {
        /*FAZEMOS A OPERAÇÃO*/
        this.setResultado(this.getNum1Double() - this.getNum2Double());
        /*USAMOS SET PARA ALTERAR O RESULTADO E GET PARA PEGAR O NOVO RESULTADO*/
        this.setResultado(this.getResultado());
    }
    
    /*CRIANDO METODO (FUNÇÃO) Multiplica() QUE IRA SOMAR O Num1Double() COM O Num2Double()
      QUE ESTA EM private OU SEJA, SOMENTE A CLASSE QUE ELE ESTA CONSEGUE CHAMA-LO
      REPETIMOS ISSO PARA TODOS OS OUTROS METODOS*/
    private void Multiplica()
    {
        /*FAZEMOS A OPERAÇÃO*/
        this.setResultado(this.getNum1Double() * this.getNum2Double());
        /*USAMOS SET PARA ALTERAR O RESULTADO E GET PARA PEGAR O NOVO RESULTADO*/
        this.setResultado(this.getResultado());
    }
    
    /*CRIANDO METODO (FUNÇÃO) Dividi() QUE IRA SOMAR O Num1Double() COM O Num2Double()
      QUE ESTA EM private OU SEJA, SOMENTE A CLASSE QUE ELE ESTA CONSEGUE CHAMA-LO
      REPETIMOS ISSO PARA TODOS OS OUTROS METODOS*/
    private void Dividi()
    {
        /*FAZEMOS A OPERAÇÃO*/
        this.setResultado(this.getNum1Double() / this.getNum2Double());
        /*USAMOS SET PARA ALTERAR O RESULTADO E GET PARA PEGAR O NOVO RESULTADO*/
        this.setResultado(this.getResultado());

    }

}
