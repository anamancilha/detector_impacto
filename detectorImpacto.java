public class detectorImpacto{
    //criando a classe para a equação polinomial
    public static double f(double x){
        return 0.04 * Math.pow(x, 3) - 0.8 * Math.pow(x, 2) + 4.0 * x - 12.0;
    }

    public static void main(String args[]){
        double a = 10.0;
        double b = 20.0;
        double tolerancia = 1e-7; //tolerância para a precisão do resultado
        
        double raiz = resolverBissecao(a, b, tolerancia);
        System.out.printf("Ponto de impacto encontrado em x = %.8f%n", raiz);
    }
    
    public static double resolverBissecao(double a, double b, double tol){
        double xm = 0;

        double fa = f(a);

        //enquanto a largura do intervalo for maior que a precisão permitida
        while ((b-a)/2.0>tol){
            xm = (a+b)/2.0; //encontrando o ponto médio
            double fxm = f(xm);

            //testando o sinal
            if (fxm == 0.0){
                return xm;  //achamos a raiz exata
            } else if (fa * fxm < 0){
                b = xm; //a raiz está na esqueda, o fim do intervalo encolhe
            } else {
                a = xm;
                fa = fxm; //a raiz está na direita, o início do intervalo avança
            }
        }
        return xm;
    }
}