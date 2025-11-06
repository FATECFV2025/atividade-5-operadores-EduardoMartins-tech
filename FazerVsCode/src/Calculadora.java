public class Calculadora {

    public static void main (String [] args){
        Operadores op = new Operadores();
        
        System.out.println("--- ARITMÉTICAS ---");
        System.out.println("Adição: " + op.adicao(10,5));
        System.out.println("Subtração: " + op.subtracao(10,5));
        System.out.println("Multiplicação: " + op.multiplicacao(10,5));
        System.out.println("Divisão: " + op.divisao(10,5));
        
        System.out.println("\n--- ATRIBUIÇÃO COMPOSTA ---");
        float valor = 5.0f;
        float adicaoComposta = op.somaEAtribui(valor, 3.0f);
        System.out.println("Soma e Atribui (5 + 3): " + adicaoComposta);

        float subtracaoComposta = op.subtraiEAtribui(adicaoComposta, 2.0f);
        System.out.println("Subtrai e Atribui (8 - 2): " + subtracaoComposta);
        
        float multiplicacaoComposta = op.multiplicaEAtribui(subtracaoComposta, 2.0f);
        System.out.println("Multiplica e Atribui (6 * 2): " + multiplicacaoComposta);
        
        System.out.println("\n--- COMPARAÇÃO ---");
        float a = 15.0f;
        float b = 20.0f;

        System.out.println("Igual a (15 == 20): " + op.igualA(a, b));
        System.out.println("Diferente de (15 != 20): " + op.diferenteDe(a, b));
        System.out.println("Maior que (15 > 20): " + op.maiorQue(a, b));
        System.out.println("Menor ou Igual a (15 <= 20): " + op.menorOuIgualA(a, b));

        System.out.println("\n--- LÓGICOS ---");
        boolean c1 = op.maiorQue(a, 10.0f);
        boolean c2 = op.igualA(b, 20.0f);
        boolean c3 = op.menorQue(a, 10.0f);
        
        System.out.println("Verdadeiro E Verdadeiro (T && T): " + op.eLogico(c1, c2));
        System.out.println("Verdadeiro OU Falso (T || F): " + op.ouLogico(c1, c3));
        System.out.println("NÃO Verdadeiro (!T): " + op.naoLogico(c2));
    }
}