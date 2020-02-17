/**
 * This class represent the team object
 * @FaresElkhouli
 * @ZhiyuFeng
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
   /**
    * Search for the member to be removed
    * @returns the a for the place the member in, -1 for the one can't be found.
    */
   private int find(TeamMember m)
   {
	   int i = 0;
     int invalid = -1;

       while(i <= team.length) {
    	   if (team[i].equals(m)) {
    		   return i;
    	   }
    	   i++;
       }
       return invalid;
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

   /**
    *
    * This method removes a teammember from the team. If the find method find the same name
    * and the date it will remove the team member with the last member in the list and set the last
    * member in the list to null.
    * @param teammember to be removed
    * @returns false when can't find the member
    */
   public boolean remove(TeamMember m)
   {
	   int memberIndex =find(m);
	   if (memberIndex == -1) {
		   return false;
	   }
	   team[memberIndex] = team[numMembers-1];
	   team[numMembers-1] = null;
	   numMembers--;
	   return true;
   }

   /**
    * If the teammember is already in the team, return false, else return true.
    * @param m
    * @return false when the team member is in the team, returns true when the team member is
    * not in the team.
    */
   public boolean contains(TeamMember m)
   {
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
		   while (count <= team.length) {
			   System.out.print(team[count].toString());
			   count++;
		   }

   }
}
