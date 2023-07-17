package hierarquia.pessoa;

public class Professor extends Pessoa {
    private String docencia;
    private String escalao;
    
    public Professor(){
        
    }
    public Professor(String docencia, String escalao, String nome, char genero, int idade) {
        super(nome, genero, idade);
        this.docencia = docencia;
        this.escalao = escalao;
    }
    public String getDocencia() {
        return docencia;
    }

    public String getEscalao() {
        return escalao;
    }
    @Override
    void falar1(){
        super.falar1();
        System.out.println( "e sou um professor!");
    }
    @Override
    void print(){
        super.print();
        System.out.println("Grupo de docência : " + docencia );
        System.out.println("Escalão : " + escalao );
    }
    
}
