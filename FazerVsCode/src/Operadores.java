public class Operadores {

    public float adicao (float v1, float v2){
        return v1 + v2;
    }

    public float subtracao (float v1, float v2){
        return v1 - v2;
    }

    public float multiplicacao (float v1, float v2){
        return v1 * v2;
    }

    public float divisao (float v1, float v2){
        if (v2 == 0) {
            return Float.NaN;
        }
        return v1 / v2;
    }

    public float somaEAtribui(float v1, float v2){
        return v1 + v2;
    }

    public float subtraiEAtribui(float v1, float v2){
        return v1 - v2;
    }
    
    public float multiplicaEAtribui(float v1, float v2){
        return v1 * v2;
    }

    public boolean igualA(float v1, float v2){
        return v1 == v2;
    }

    public boolean diferenteDe(float v1, float v2){
        return v1 != v2;
    }

    public boolean maiorQue(float v1, float v2){
        return v1 > v2;
    }

    public boolean menorQue(float v1, float v2){
        return v1 < v2;
    }

    public boolean maiorOuIgualA(float v1, float v2){
        return v1 >= v2;
    }

    public boolean menorOuIgualA(float v1, float v2){
        return v1 <= v2;
    }
    
    public boolean eLogico(boolean condicao1, boolean condicao2){
        return condicao1 && condicao2;
    }

    public boolean ouLogico(boolean condicao1, boolean condicao2){
        return condicao1 || condicao2;
    }

    public boolean naoLogico(boolean condicao){
        return !condicao;
    }
}