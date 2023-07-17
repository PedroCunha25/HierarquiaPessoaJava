
package hierarquia.pessoa;


public class Pessoa {
      private String nome;
      private char genero;
      private int idade;
      public Pessoa(){

      }
      public Pessoa( String nome, char genero ){
            this.nome = nome;
            this.genero = genero;
      }
      public Pessoa( String nome, char genero, int idade ){
            this.nome = nome;
            this.genero = genero;
            this.idade = idade;
      }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    void falar1(){
            System.out.println( "Eu sou uma pessoa ");
      }
    public void falar(String frase){
         System.out.println(frase);
    }
    void print(){
        System.out.println("O meu nome é : " + nome );
        System.out.println("A minha idade é : " + idade );
        System.out.println("O meu género é : " + genero );
    }
    
}
