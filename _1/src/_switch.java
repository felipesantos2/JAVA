public class _switch {

    public static void main(String[] args) throws Exception {
        System.out.println("Digite uma das opções abaixo:");
        System.out.println("1 - Comprar; 2 - vender; 3 - Listar; 4 - Sair" );

        Scanner scan = new Scanner(System.in);
        int opcao = scan.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você acessou COMPRAR");
                break;
            case 2:
                System.out.println("Você acessou VENDER");
                break;
            case 3:
                System.out.println("Você acessou LISTAR");
                break;
            case 4:
                System.out.println("Você acessou SAIR");
                break;
            defaut:
                System.out.println("SAINDO DO SISTEMA");

        }

    }

}
