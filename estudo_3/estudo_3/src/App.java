import java.util.Scanner;
public class App {
    
    public static void main(String[] args) throws Exception {

            //fazer a adição de duas parcelas
        System.out.println("Adicionar duas parcelas");

            //definir variaveis
        int parcela1;
        int parcela2;
        int resultado;

            // criar objeto de inserção

        Scanner input = new Scanner(System.in);

            //adição da primeira parcela
        System.out.println("Indique a primeira parcela:");
        parcela1 = input.nextInt();
        
            //adição da Segunda  parcela
        System.out.println("Indique a segunda parcela:");
        parcela2 = input.nextInt();
        
            //Resultado

        resultado = parcela1 + parcela2;

            // Listar resultado
            // System.out.println(resultado);
            // System.out.printf(" O resultado final é %d + %d = %d", parcela1 , parcela2, resultado);
        System.out.printf("O resultado final é " +  resultado);

        
    }
}
