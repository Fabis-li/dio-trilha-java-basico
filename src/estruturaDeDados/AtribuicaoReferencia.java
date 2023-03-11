package estruturaDeDados;

public class AtribuicaoReferencia {

    public static void main(String[] args) {
        int intA = 1;
        int intB = intA;

        System.out.println("intA = " + intA + " intB = " + intB);
        intA = 2;
        System.out.println("intA = " + intA + " intB = " + intB);

        MeuObjt objA = new MeuObjt(1);
        MeuObjt objB = objA;

        System.out.println("objA = " + objA + " objB = " + objB);
        objA.setNum(2);
        System.out.println("objA = " + objA + " objB = " + objB);
    }
}
