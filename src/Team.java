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
	   int a = 0;
       while(a <= team.length) {
    	   if ((team[a].name).equals(m.name) && (team[a].startDate).equals(m.startDate)) {
    		   return a;
    	   }
    	   a++;
       }
       return -1;
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
    * and the date it will remove the team member.
    * @param teammember to be removed
    * @returns false when can't find the member
    */
   public boolean remove(TeamMember m)
   {
	   int a=find(m);
	   if (a == -1) {
		   return false;
	   }
	   TeamMember [] newarray;
       newarray = new TeamMember[numMembers-1];
       int count=0,number=0;
       while(count <= numMembers) {
    	   if(count == a) {
    		   continue;
    	   }
    	   newarray[number] = team[count]; 
    	   count++;
    	   number++;
       }
   } 
   
   /**
    * If the teammember is already in the team, return false, else return true.
    * @param m
    * @return false when the team member is in the team, returns true when the team member is
    * not in the team.
    */
   public boolean contains(TeamMember m)
   {
	      int x=0;
	      while(x <= team.length) {
	   	   if ((team[x].name).equals(m.name) && (team[x].startDate).equals(m.startDate)) {
	   		   return false;
	   		   break;
	   	   }
	   	   x++;
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
			   System.out.print(team[count].name+team[count].startDate.toString());
			   count++;
		   }

   }
