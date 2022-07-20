public class App {
    public static void main(String[] args) throws Exception {


        System.out.println("Hello, World!");

        Carro obj = new Carro();


        obj.setModelo("BMW");
        obj.setQuantidadePortas(4);
        obj.setPlacas("KWT-123");

        obj.acelerar();

        // System.out.println(obj);

        System.out.println("Hello, World!");

        Carro obj2 = new Carro();


        obj2.setModelo("BMW 330");
        obj2.setQuantidadePortas(42);
        obj2.setPlacas("KWT-3221");

    if(obj == obj) {
        
        System.out.println("Objeto igual" + "\n");

    } else {

        System.out.println("Objeto diferente!");

    }

    System.out.println(obj + " <<>> " + obj2);

        // System.out.println(obj2);





















        // obj.modelo = "BMW";
        // obj.placa = "kwe-123";
        // obj.quantidadePortas = 4;





        // obj.acelerar();
        // obj.parar();
        // System.out.println(obj.placa);


    }
}
