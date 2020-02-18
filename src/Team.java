import java.io.NotActiveException;

/**
 * This class represent the growable team object
 * @author Fares Elkhouli
 * @author Zhiyu Feng
 */
public class Team
{
   private final int NOT_FOUND = -1;
   private final int GROW_SIZE = 4; //initial and grow size
   private TeamMember [] team;
   private int numMembers;

    /**
     * constructor for Team
     */
   public Team()
   {
      //this is the default constructor
      team = new TeamMember[GROW_SIZE];
      numMembers = 0;
   }
   /**
    * Search for the member to be removed
    * @return int index of member if found, -1 for the one can't be found.
    */
   private int find(TeamMember m)
   {
       int i = 0;

       if(numMembers == 0){
           return NOT_FOUND;
       }
       while(i < numMembers) {
    	   if (team[i].equals(m)) {
    		   return i;
    	   }
    	   i++;
       }
       return NOT_FOUND;
   }

   /**
    * doubles team array size and copies over elements
    */
   private void grow()
   {
      //double array size
      int doubler = 2;
      TeamMember[] oldarray = team;
      team = new TeamMember[oldarray.length * doubler];

      //copy over old elements
      for(int i = 0; i < oldarray.length; ++i){
         team[i] = oldarray[i];
      }

   }
   /**
    * If the list is empty, return true, else return false.
    * @return true when the list is empty, returns false when the list is not empty.
    */
   public boolean isEmpty()
   {
       if(numMembers == 0) {
    	   return true;
       } else {
    	   return false;
       }
   }

   /**
    * This method adds a new teammember to the team. It also calls grow() when array is full.
    * @param m teammember to be added
    */
   public void add(TeamMember m)
   {
      if (numMembers == team.length){
         grow();
      }

      team[numMembers] = m;
      numMembers++;
   }

   /**
    *
    * This method removes a teammember from the team. If the find method find the same name
    * and the date it will remove the team member with the last member in the list and set the last
    * member in the list to null.
    * @param m team member to be removed
    * @return false when can't find the member
    */
   public boolean remove(TeamMember m)
   {
	   int memberIndex =find(m);
	   if (memberIndex == NOT_FOUND) {
		   return false;
	   }
	   team[memberIndex] = team[numMembers-1];
	   team[numMembers-1] = null;
	   numMembers--;
	   return true;
   }

   /**
    * If the teammember is already in the team, return false, else return true.
    * @param m team member to be checked
    * @return false when the team member is in the team, returns true when the team member is
    * not in the team.
    */
   public boolean contains(TeamMember m)
   {
       if(numMembers == 0){
           return false;
       }
	     int index = find(m);
	     if(index == -1) {
	    	 return false;
	     }
	      return true;
   }
   /**
    * this method prints out every team members name and start date.
    */
   public void print()
   {
      //set up a for loop and call the toString() method
	   int count = 0;
		   while (count < numMembers) {
			   System.out.println(team[count].toString());
			   count++;
		   }

   }
}
