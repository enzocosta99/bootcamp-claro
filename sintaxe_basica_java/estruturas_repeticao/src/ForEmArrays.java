public class ForEmArrays {

    public static void main(String[] args) {
        
        String alunos[] = {"Felipe", "João", "Carlos", "Isabela", "Maria", "Julia"};

        for(int i = 0; i < alunos.length; i++) {

            System.out.println("O aluno no índice " + i + " é: " + alunos[i]);

        }

        for(String aluno:alunos) {

            System.out.println(aluno);

        }

    }
    
}
