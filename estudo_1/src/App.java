public class App {

    public static void main(String[] args) throws Exception {

        int valor1;
        int valor2;
        valor1 = 10;
        valor2 = 5;
        // int total = valor1 + valor2;

        if (valor1 > 10 && valor2 > 10) {
            System.out.println("1 - Os dois Valores são maiores que 10.");

        } else {
            System.out.println("2  Um dos valores não é maior que 10.");

        }

        if (valor1 > 10 || valor2 > 10) {
            System.out.println("3 - Um dos valores é maior que 10.");

        } else {
            System.out.println("4 - Nenhum dos valores é maior que 10.");

        }




        // System.out.println("A soma dos dois valores é: " + total);

    }

}
