/**
 *This class manage the inputs and outputs in the program
 *@FaresElkhouli
 *@ZhiyuFeng
 */

public class ProjectManager
{
   Scanner stdin;
   Team cs213;
   public void run()
   {

      boolean done = false;
      while ( !done )
      {
         String command = stdin.next();
         StringTokenizer commandTok = new StringTokenizer(command," ");
         char ccommand = commandTok.nextToken().charAt(0);
         switch (ccommand)
         {
            case 'A':
              String name = commandTok.nextToken();
              Date startdate = new Date(commandTok.nextToken());
              TeamMember m = new TeamMember(name,startdate);
              add(m);
		          break;
            case 'R':
              String name = commandTok.nextToken();
              Date startdate = new Date(commandTok.nextToken());
              TeamMember m = new TeamMember(name,startdate);
              remove(m);
              break;
            case 'P':
              print();
              break;
            case 'Q':
              print();
              System.out.print("The team is ready to go!");
              break;
            default: //deal with bad command here
            System.out.print("Command"+"'"+command+"'"+"not supported!");
         }

      }
      //write java code before you terminate the program
   } //run()
   /**
    * This is the method to call the method add in the team class.
    */
   private void add(TeamMember m)
   {
      	//must check if the date is valid
	//must call the contains() method to check if a given
	//team member is in the team already
	   if(!m.startDate.isVaild()) {
		   System.out.println(m.startDate.toString() + " is not a vaild date!");
		   return;
	   }
	   if(cs213.contains(m)) {
		   System.out.println(m.name + m.startDate.toString() + " is already in the team.");
		   return;
	   }
	   cs213.add(m);
     return;
   }
   /**
    * This is the method to calls the remove method in the Team section.
    */
   private void remove(TeamMember m)
   {
      //must check if the date is valid
      if(!m.startDate.isVaild()) {
 		   System.out.println(m.startDate.toString() + " is not a vaild date!");
 		   return;
 	   }
	   cs213.remove(m);
     return;
   }
   /**
    * This is the method to print out the whole team chart.
    */
   private void print()
   {
      //must check if the team has 0 members.
	   int count = 0;
	   if(cs213.isEmpty()) {
		   System.out.println("We have 0 team members!");
	   } else {
		   System.out.println("We have the following team members:");
		   cs213.print();
		   }
		 System.out.println("-- end of the list --");
	 }
} //ProjectManager
