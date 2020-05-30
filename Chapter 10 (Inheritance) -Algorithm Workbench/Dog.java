import java.util.Random;
/**
   Basil Farra
   5-31-20
   Algorithm Workbench #1
   Write the first line of the definition for a Poodle class. The class should extend the Dog class.	
*/
public class Dog {
   private int age;
   private String name, size, description, personality; //size would be small medium or large. descirption would explain fur color and length
   /**
      This is the constructor method
      @param a, the dogs age
      @param n, the name of the dog
      @param s, the size of the dog
      @param d, a short description of the dogs appearance
      @param p, how the dog acts
   */
   public Dog(int a, String n, String s, String d, String p){
      age = a;
      name = n;
      size = s;
      description = d;
      personality = p;
   }
   //The following methods are getter and setter methods for the fields
   public int getAge(){
      return age;
   }
   public void setAge(int a){
      age = a;
   }
   public String getName(){
      return name;
   }
   public void setName(String n){
      name = n;
   }
   public String getSize(){
      return size;
   }
   public void setSize(String s){
      size = s;
   }
   public String getDescription(){
      return description;
   }
   public void setDescription(String d){
      description = d;
   }
   public String getPersonality(){
      return personality;
   }
   public void setPersonality(String p){
      personality = p;
   }
   /**
      the doTrickMethod
      when called, a random trick will be printed out
      @return a randomly selected trick that the dog can perform
   */
   public String doTrick(){
      String tricks[] = {" rolled over!", " jumped!", " sat!", " shook hands with you!", " begged!", " played dead :("};
      Random ranNum = new Random();
      int num = ranNum.nextInt(6);
      return tricks[num];
   }
}