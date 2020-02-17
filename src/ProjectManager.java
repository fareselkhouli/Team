import java.util.StringTokenizer;

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
              String currentName1 = commandTok.nextToken();
              Date currentStartDate1 = new Date(commandTok.nextToken());
              TeamMember currentMember1 = new TeamMember(currentName1,currentStartDate1);
              add(currentMember1);
		          break;
            case 'R':
              String currentName2 = commandTok.nextToken();
              Date currentStartDate2 = new Date(commandTok.nextToken());
              TeamMember currentMember2 = new TeamMember(currentName2,currentStartDate2);
              remove(currentMember2);
              break;
            case 'P':
              print();
              break;
            case 'Q':
              print();
              System.out.print("The team is ready to go!");
              done = true;
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
   private void add(TeamMember inMember)
   {
      	//must check if the date is valid
	//must call the contains() method to check if a given
	//team member is in the team already
	   if(!inMember.getStartDate().isVaild()) {
		   System.out.println(inMember.toString() + " is not a vaild date!");
		   return;
	   }
	   if(cs213.contains(inMember)) {
		   System.out.println(inMember.toString() + " is already in the team.");
		   return;
	   }
	   cs213.add(inMember);
     return;
   }
   /**
    * This is the method to calls the remove method in the Team section.
    */
   private void remove(TeamMember outMember)
   {
      //must check if the date is valid
      if(!outMember.getStartDate().isVaild()) {
 		   System.out.println(outMember.toString() + " is not a vaild date!");
 		   return;
 	   }
	   cs213.remove(outMember);
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
