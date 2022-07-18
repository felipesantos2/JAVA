public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        AlunoCaracteristicas aluno = new AlunoCaracteristicas();

        aluno.nome = "Felipe";
        aluno.idade = 19;
        aluno.ApresentaAluno();

        AlunoCaracteristicas aluno2 = new AlunoCaracteristicas();

        aluno2.nome = "miguel";
        aluno2.idade = 12;
        aluno2.ApresentaAluno();

        AlunoCaracteristicas aluno3 = new AlunoCaracteristicas();

        aluno3.nome = "Lucão";
        aluno3.idade = 30;
        aluno3.ApresentaAluno();
        

    }
}
