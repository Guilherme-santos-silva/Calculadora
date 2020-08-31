package Modelo;

public class Controle extends Atributos
{

    //sempre que instanciarmos essa classe ela ira precisar de parametros definidos na linha abixo
    public Controle(String num1String, String num2String, String operacao) 
    {
        super(num1String, num2String, operacao);
        Controlar();
    }
    

    private void Controlar()
    {
        /*DEFININDO INICIALMENTE NOSSO atributo MENSAGEM COMO VAZIO
        PARA PODEMOR COLOCAR A FRASE QUE VAMOS DEFINIR DEPOIS,*/
        this.setMensagem("");
        
        /*CHAMANDO Validacao E INSTANCIANDO UM OBJETO DE NOME val QUE ENTRA COM OS ATRIBUTOS
        Num3String, Num2String E Opercao*/
        Validacao val = new Validacao(this.getNum1String(), this.getNum1String(), this.getOperacao());
        
            /*SE A Mensagem QUE VEM DO OBJETO val FOR IGUAL A "" VAZIO ENTAO CHAMAR O CODIGO QUE ESTA DENTRO DOS {}
            SE NAO IR PARA O else*/
            if(val.getMensagem().equals(""))
            {
                /*CHAMANDO Calculos E INSTANCIANDO UM OBJETO DE NOME cal QUE ENTRA COM OS ATRIBUTOS
                val.getNum1Double, val.getNum2Double E val.getOperacao*/
                Calculos cal = new Calculos(val.getNum1Double(), val.getNum2Double(), val.getOperacao());
                
                    /*DEFININDO QUE resultado É IGUAL Resultado QUE ESTA INSTANCIADA EM NOSSO OBJETO cal*/
                    this.setResultado(cal.getResultado());
            }
            /*SE NÃO*/
            else
            {
                /*DEFININDO QUE A mensagem É IGUAL A Mensagem QUE ESTA INSTANCIADA EM NOSSO OBJETO val*/
                this.setMensagem(val.getMensagem());
            }
    }
}
    
