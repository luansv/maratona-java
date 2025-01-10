package jiraya.javacore.string;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(100000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo String: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(100000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo StringBuilder: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(100000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo StringBuffer: " + (fim - inicio) + "ms");
    }

    private static void concatString(int tamanho) {
        String texto = " ";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder texto2 = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            texto2.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho) {
        StringBuffer texto3 = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            texto3.append(i);
        }

    }
}


