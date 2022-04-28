public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno1 = new Aluno("100", "Carlos Peres");
        Aluno aluno2 = new Aluno("200", "Júlia Garcia");

        aluno1.getNotas().setP1(7.1f);
        aluno1.getNotas().setP2(8.5f);

        aluno2.getNotas().setP1(5.3f);
        aluno2.getNotas().setP2(6.9f);

        System.out.println(aluno1.getNome() + " : " + aluno1.getNotas().getSituacao());
        System.out.println(aluno2.getNome() + " : " + aluno2.getNotas().getSituacao());

        if(aluno1.getNotas().getMedia() > aluno2.getNotas().getMedia()){
            System.out.println("Aluno que obteve a maior nota: " + aluno1.getNome());
        }
        else if(aluno2.getNotas().getMedia() > aluno1.getNotas().getMedia()){
            System.out.println("Aluno que obteve a maior nota: " + aluno2.getNome());
        }
        else{
            System.out.println("As médias foram iguais");
        }
    }
}