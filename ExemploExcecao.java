public class ExemploExcecao {
    public static void main(String[] args) {
        ExemploExcecao eE = new ExemploExcecao();
        eE.calcular();
    }

    public void calcular()
    {
        try {
            float res;
            OperacoesMatematicas op = new OperacoesMatematicas();
            res = op.dividir(3, 0);
            System.out.println(res);
            res = op.somar(4, 6);
            System.out.println(res);
        } catch (DivisaoPorZeroException e) {
            System.out.println("Descrição do erro: " + e.getMessage());
        }
    }
}
