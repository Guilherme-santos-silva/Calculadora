package Modelo;

public class Validacao extends Atributos
{

    /*ACESSANDO ATRIBUTOS VIA CONSTRUTOR*/
    //sempre que instanciarmos essa classe ela ira precisar de parametros definidos na linha abixo
    public Validacao(String num1String, String num2String, String operacao) 
    {
        super(num1String, num2String, operacao);
        Validar();
    }
    
    /*CRIANDO METODO Validar() QUE ESTA EM private OU SEJA, SOMENTE A CLASSE QUE ELE ESTA CONSEGUE CHAMA-LO
    ESSE METODO IRA VALIDAR SE FOI ENTRADO UM NUMERO OU UMA LETRA E CONVERTELO PARA Double*/
    private void Validar()
    {
        /*DEFININDO INICIALMENTE NOSSO atributo MENSAGEM COMO VAZIO
        PARA PODEMOR COLOCAR A FRASE QUE VAMOS DEFINIR DEPOIS,*/
        this.setMensagem("");
        /*TRY E CATCH ESTRUTURA PARA DETECTAR ERROS*/
        /*AQUI FAZEMOS A PRIMEIRA VERIFICAÇAO, SE POSSIVEL CONVERTER PARA DOODLE*/
        try 
        {
            /*AQUI CONVERTEMOS O Num1String STRING PARA Num1Double BOOLEANO,
            Double.parseDouble SERVE PARA CONVERTER*/
            this.setNum1Double(Double.parseDouble(this.getNum1String()));
            /*AQUI CONVERTEMOS O Num2String STRING PARA Num2Double BOOLEANO,
            Double.parseDouble SERVE PARA CONVERTER*/
            this.setNum2Double(Double.parseDouble(this.getNum2String()));
        } 
        /*SE NAO  SE O NUMERO DADO COMO numero1 FOR UMA LETRA E O PRORAMA NAO CONSEGUIR COVERTER PRA DOOBLE ELE CAI NO CATCH*/
        catch (Exception e) 
        {
            /*DANDO UM VALOR A MENSAGEM, JÁ QUE NO INICIO ELA ESTAVA DEFINIDA COM UM VALOR VACIO*/
            this.setMensagem("erro, numero invalido");
        }
    }    
}
