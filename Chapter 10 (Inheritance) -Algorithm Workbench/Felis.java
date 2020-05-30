/**
   Basil Farra
   5-31-20
   Algorithm Workbench #2
   Look	at	the	following	code,	which	is	the	first	line	of	a	class	definition: 
   public class Tiger extends Felis  In what order will the class constructors execute?
*/
public class Felis{
   private String diet, location, size;
   private int averageLifespan;
   /**
      The constructor
      @param d, what the animal in the felis genus eats
      @param l, where the animal in the felis genus lives
      @param s, the size of the animal in the felis genus
      @param aL, the averageLifespan of the animal in the felis genus
   */
   public Felis(String d, String l, String s, int aL){
      diet = d;
      location = l;
      size = s;
      averageLifespan = aL;
   }
   //the following methods are getters and setters for te fields
   public String getDiet(){
      return diet;
   }
   public void setDiet(String d){
      diet = d;
   }
   public String getLocation(){
      return location;
   }
   public void setLocation(String l){
      location = l;
   }
   public String getSize(){
      return size;
   }
   public void setSize(String s){
      size = s;
   }
   public int getAverageLifespan(){
      return averageLifespan;
   }
   public void setAverageLifespan(int aL){
      averageLifespan = aL;
   }
}