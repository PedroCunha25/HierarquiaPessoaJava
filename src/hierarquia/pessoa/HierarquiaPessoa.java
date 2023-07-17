
package hierarquia.pessoa;
import java.util.Scanner;
public class HierarquiaPessoa {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        Pessoa a = new Aluno();
        Pessoa b = new Professor();
        
        
         a.falar1(); 
        System.out.println("\n");
         b.falar1(); 
        System.out.println("\n");
        
       
         String s;
         System.out.println("A & a (Aluno)");
         System.out.println("P & p (Professor) ");
         System.out.println( "Insira a sua opção: " );
         s = leia.nextLine();
         
         
         s.toLowerCase();
         
         Aluno dd = null;
         Professor pp = null;
         
         if (s.equals("a") ){
             dd = new Aluno (26 ,"F" , "Salvador Ramos" , 'M', 17);
             dd.print();
             dd.falar1();
             System.out.println("\n");
         }     
        else
             if (s.equals("p") ){
                 pp = new Professor ("550", "2", "Leonor Pereira", 'F', 40 );
                 pp.print();
                 pp.falar1();
                 System.out.println("\n");
             }
             else {
                 System.out.println("Diga a opção correta ");
                 System.out.println("\n");
             }
        
        
         Aluno a2 = new Aluno();
         String f;
         System.out.println("O que pretende dizer: ");
         f = leia.nextLine();
         
         a2.falar(f);
    }
}
