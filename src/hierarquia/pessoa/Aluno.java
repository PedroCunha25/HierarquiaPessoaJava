
package hierarquia.pessoa;

public class Aluno extends Pessoa {
    private int n;
    private String t;
    
    public Aluno(){
        
    }

    public Aluno(int n, String t, String nome, char genero, int idade) {
        super(nome, genero, idade);
        this.n = n;
        this.t = t;
    }
    public int getN() {
        return n;
    }

    public String getT() {
        return t;
    }
    @Override
    void falar1(){
        super.falar1();
        System.out.println( "e sou um aluno!");
      }
    @Override
    void print(){
        super.print();
        System.out.println("Número : " + n );
        System.out.println("turma : " + t );
        
    }
}
