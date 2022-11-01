package aulas.poo.escola;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Diego","diegosocial20@hotmail.com","456456456",7.5);
        aluno .seApresentar();

        Professor prof = new Professor("juan", "juan@gmail.com","023569874","TI");
        prof.seApresentar();

        Pessoa p1 = new Pessoa( "Joanete", "joanete@gmail.com", "0000000");
        p1.seApresentar();

        Pessoa p2 = new Aluno("Pedrinho","pedrinho@gmail.com","123456",7.7);

        Pessoa p3 = new Professor("Pedrão", "pedrão@gmail.com","789456","TI");
        System.out.println("================");
        p2.seApresentar();
        p3.seApresentar();

    }
}
