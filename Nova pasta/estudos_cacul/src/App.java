public class App {
    public static void main(String[] args) throws Exception {


        System.out.println("Hello, World!");

        Carro obj = new Carro();

        obj.modelo = "BMW";
        obj.placa = "kwe-123";
        obj.quantidadePortas = 4;





        obj.acelerar();
        obj.parar();
        System.out.println(obj.placa);


    }
}
