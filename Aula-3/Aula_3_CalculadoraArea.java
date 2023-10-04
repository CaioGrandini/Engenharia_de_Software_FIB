import java.util.Scanner;

public class CalculadoraAreaCubica {

    public static int calcularAreaCubica(int altura, int largura, int comprimento) {
        if (altura < 0 || largura < 0 || comprimento < 0) {
            return 0; 
        }
        int area = altura * largura * comprimento;
        return area;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a altura do cubo: ");
        int altura = scanner.nextInt();
        System.out.print("Digite a largura do cubo: ");
        int largura = scanner.nextInt();
        System.out.print("Digite o comprimento do cubo: ");
        int comprimento = scanner.nextInt();
        scanner.close();
        int area = calcularAreaCubica(altura, largura, comprimento);
        if (area == 0) {
            System.out.println("A área cúbica é zero.");
        } else {
            System.out.println("A área cúbica do cubo é: " + area);
        }
    }
}
