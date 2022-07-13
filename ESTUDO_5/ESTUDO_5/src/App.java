public class App {
    public static void main(String[] args) throws Exception {

        Carro honda = new Carro();
        Carro ford = new Carro();
        honda.nome = "Civic";
        honda.tipo = "Popular";
        honda.ano = 2023;
        honda.portas = 4;
        honda.funciona = false;

        System.out.println(honda.funciona);
        System.out.println(honda.nome);

        ford = honda;
        System.out.println(ford);

        
        

    }
    
}
