package pilhas;

public class No {

    private int dado;
    private No reNo = null;

    public No(int dado) {
        this.dado = dado;
    }

    public No() {
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public void setReNo(No reNo) {
        this.reNo = reNo;
    }

    public No getReNo() {
        return reNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }
}
