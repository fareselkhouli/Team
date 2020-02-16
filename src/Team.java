/**
  
 @author  
 */
public class Team 
{
   private final int NOT_FOUND = -1;
   private final int GROW_SIZE = 4; //initial and grow size
   private TeamMember [] team;
   private int numMembers;
   
   public Team()
   {
      //this is the default constructor
   }
   
   private int find(TeamMember m)
   {
       
   }

   /**
    * doubles team array size and copies over elements
    */
   private void grow()
   {
      //double array size
      int doubler = 2;
      old = team;
      team = new TeamMember[old.length * doubler];

      //copy over old elements
      for(int i = 0; i < old.length; ++i){
         team[i] = old[i];
      }

   }
   
   public boolean isEmpty()
   {
       
   }

   /**
    * This method adds a new teammember to the team. It also calls grow() when array is full.
    * @param teammember to be added
    */
   public void add(TeamMember m)
   {
      if (numMembers == team.length){
         grow();
      }

      team[numMembers] = m;
      numMembers++;
   }
   
   public boolean remove(TeamMember m)
   {
       
   } 
   
   public boolean contains(TeamMember m)
   {
      
   } 
   
   public void print()
   {
      //set up a for loop and call the toString() method
   } 
}
