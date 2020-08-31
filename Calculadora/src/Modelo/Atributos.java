package Modelo;

public abstract class Atributos 
{
    /*CRIANDO ATRIBUTOS*/
    private Double num1Double;
    private Double num2Double;
    private String num1String;
    private String num2String;
    private String mensagem;
    private Double resultado;
    private String operacao;

    //CRIANDO CONSTRUTORES COM OS ATRIBUTOS
    public Atributos(Double num1Double, Double num2Double, String operacao) 
    {
        this.num1Double = num1Double;
        this.num2Double = num2Double;
        this.operacao = operacao;
    }

    public Atributos(String num1String, String num2String, String operacao) 
    {
        this.num1String = num1String;
        this.num2String = num2String;
        this.operacao = operacao;
    }

    //CRIANDO METODOS GET E SET PARA TODOS OS ATRIBUTOS
    public Double getNum1Double() 
    {
        return num1Double;
    }

    public void setNum1Double(Double num1Double) 
    {
        this.num1Double = num1Double;
    }

    public Double getNum2Double() 
    {
        return num2Double;
    }

    public void setNum2Double(Double num2Double) 
    {
        this.num2Double = num2Double;
    }

    public String getNum1String() 
    {
        return num1String;
    }

    public void setNum1String(String num1String) 
    {
        this.num1String = num1String;
    }

    public String getNum2String() 
    {
        return num2String;
    }

    public void setNum2String(String num2String) {
        this.num2String = num2String;
    }

    public String getMensagem() 
    {
        return mensagem;
    }

    public void setMensagem(String mensagem) 
    {
        this.mensagem = mensagem;
    }

    public Double getResultado() 
    {
        return resultado;
    }

    public void setResultado(Double resultado) 
    {
        this.resultado = resultado;
    }

    public String getOperacao() 
    {
        return operacao;
    }

    public void setOperacao(String operacao) 
    {
        this.operacao = operacao;
    }
}
