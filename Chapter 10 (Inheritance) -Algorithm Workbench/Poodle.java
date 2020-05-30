import java.util.Random;
/**
   Basil farra
   5-31-20
   Algorithm Workbench #1
   Write the first line of the definition for a Poodle class. The class should extend the Dog class.	
*/
public class Poodle extends Dog{
   /**   
      This is the constructor
      @param a, the dogs age
      @param n, the name of the dog
      @param s, the size of the dog
      @param d, a short description of the dogs appearance
      @param p, how the dog acts
   */
   public Poodle(int a, String n, String s, String d, String p){
      super(a, n, s, d, p);
   }
   /**
      the doTrickMethod
      when called, a random trick will be printed out. The poodle has more tricks than the average dog due to being a smarter breed
      @return a randomly selected trick that the dog can perform
   */
   @Override
   public String doTrick(){
      String tricks[] = {" rolled over!", " jumped!", " sat!", " shook hands with you!", " begged!", " played dead :(", " did a hand stand!",
      " danced!"};
      Random ranNum = new Random();
      int num = ranNum.nextInt(6);
      return tricks[num];
   }
}