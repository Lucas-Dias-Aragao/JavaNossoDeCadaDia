package cap05.exercicios;

public class Pixels {
    public static void main(String[] args) {
        int[][] imagem = new int[40][40];
        int contador = 0;

        for(int i = 0; i < 40; i++) {
            for(int j = 0; j < 40; j++){
                imagem[i][j] = (int) (Math.random() * 256);
                contador++;
                System.out.println(imagem[i][j] + " - " + contador);
            }
        }
    }
}
