import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Rectangulo rectangulo1;
        Circulo circulo1;
        int op = 0, base = 0, altura = 0, radio = 0;
        String linea;
        Scanner scanner = new Scanner(System.in);

        do {
            menu();
            linea = scanner.nextLine();
            op = Integer.parseInt(linea);
            switch (op) {
                case 0: {
                    System.out.println(" chauchau 0");
                    break;
                }
                case 1: {
                    System.out.print("base > ");
                    linea = scanner.nextLine();
                    base = Integer.parseInt(linea);
                    System.out.print("altura > ");
                    linea = scanner.nextLine();
                    altura = Integer.parseInt(linea);
                    rectangulo1 = new Rectangulo(base, altura);
                    //rectangulo1.mostrar();
                    System.out.println("Area: " + rectangulo1.obtenerArea());
                    System.out.println("Perimetro: " + rectangulo1.obtenerPerimetro());
                    break;
                }
                case 2: {
                    System.out.print("radio > ");
                    linea = scanner.nextLine();
                    radio = Integer.parseInt(linea);
                    circulo1 = new Circulo(radio);
                    System.out.println("Perimetro: " + circulo1.obtenerPerimetro());
                }
            }
        } while (op != 0);


    }

    public static void menu() {
        System.out.print("-------------\nFiguras v0.1\n-------------\n" +
                "1 Rectangulos\n2 Circulos\n.....\nElige (0 para salir):");

    }
}
