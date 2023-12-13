import java.util.*;
class local
{
   String name;
   String hobby;
   char gender;
   
   public local(String name, String hobby, char gender)
   {
      this.name = name;
      this.hobby = hobby;
      this.gender = gender;
   }
   
   public String getName()
   {
      return name;
   }
   public String getHobby()
   {
      return hobby;
   }
   public char getGender()
   {
      return gender;
   }
   public void displayInfo(int line_number) 
   {
        System.out.println("Here Your Details.Thank You So Much");
        System.out.println(line_number + " Name: " + name);
        line_number++;
        System.out.println(line_number + " Hobby: " + hobby);
        line_number++;
        System.out.println(line_number + " Gender: " + gender);
        line_number++;
    }
}
public class hasnext
{
   public static void main(String[] args)
   {
      Scanner vik = new Scanner(System.in);
      int line_number = 1;
      
      System.out.println("Enter your name: ");
      String name = vik.nextLine();
      
      System.out.println("Enter your hobby: ");
      String hobby = vik.nextLine();
      
      System.out.println("Enter your gender(F[Female]/M[Male]): ");
      char gender = vik.next().charAt(0);
      
      System.out.println("Thank you for fill in.");
      System.out.println();
            
      local person = new local(name,hobby,gender);
      
         /*System.out.println(line_number + " " + person.getName() );
         line_number++;
         System.out.println(line_number + " " + person.getHobby());
         line_number ++;
         System.out.println(line_number + " " + person.getGender());
         line_number ++;*/
         person.displayInfo(line_number);
 
       vik.close();
   }
}