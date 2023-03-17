package listaEncadeadas;

public class No<T> {
    

    private T conteudo;
    private No proximoNo;

    public No() {
        this.proximoNo = null;
    }

    public No(T conteudo){
        this.proximoNo = null;
        this.conteudo = conteudo;
        
    }

    public No(T conteudo, No proximoNo){
        this.conteudo = conteudo;
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No [conteudo=" + conteudo + "]";
    }

    public String toStringEncadeado(){
        String str = "No [conteudo=" + conteudo + "]";

        if(proximoNo != null){
            str += "->" + proximoNo.toString();
        } else {
            str += "->null";
        }
        return str;
    }



    



}
