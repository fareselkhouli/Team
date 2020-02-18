import java.util.Scanner;

/**
 *This class manage the inputs and outputs in the program
 *@FaresElkhouli
 *@ZhiyuFeng
 */

public class ProjectManager
{
   Scanner stdin;
   Team cs213 = new Team();
   public void run()
   {
      stdin = new Scanner(System.in);
      boolean done = false;
      while ( !done )
      {
          String command = stdin.next();
         switch (command.charAt(0))
         {
            case 'A':
                add();
                break;
            case 'R':
                remove();
                break;
            case 'P':
                print();
                break;
            case 'Q':
                print();
                System.out.println("The team is ready to go!");
                done = true;
                break;
            default: //deal with bad command here
                System.out.println("Command " + "'" + command + "'" + " not supported!");
                stdin.next();
                stdin.next();
                break;
         }
      }
      //write java code before you terminate the program
      return;
   } //run()
   /**
    * This is the method to call the method add in the team class.
    */
   private void add()
   {
      	//must check if the date is valid
	//must call the contains() method to check if a given
	//team member is in the team already
       String inName = stdin.next();
     Date inStartDate = new Date(stdin.next());
     TeamMember inMember = new TeamMember(inName,inStartDate);

	   if(!inStartDate.isValid()) {
		   System.out.println(inStartDate.toString() + " is not a vaild date!");
		   return;
	   }
	   if((cs213 != null) && cs213.contains(inMember)) {
		   System.out.println(inMember.toString() + " is already in the team.");
		   return;
	   }
	   cs213.add(inMember);
	   System.out.println(inMember.toString() + " has joined the team");
     return;
   }
   /**
    * This is the method to calls the remove method in the Team section.
    */
   private void remove()
   {
      //must check if the date is valid
       String outName = stdin.next();
       Date outStartDate = new Date(stdin.next());
       TeamMember outMember = new TeamMember(outName,outStartDate);

      if(!outStartDate.isValid()) {
 		   System.out.println(outStartDate.toString() + " is not a vaild date!");
 		   return;
 	   }
     Boolean successfullyRemoved = cs213.remove(outMember);
	   if (!successfullyRemoved){
	      System.out.println(outMember.toString() + " is not a team member");
       }
	   else{
	       System.out.println(outMember.toString() + " has left the team.");
       }
     return;
   }
   /**
    * This is the method to print out the whole team chart.
    */
   private void print()
   {
      //must check if the team has 0 members.
	   if(cs213.isEmpty()) {
		   System.out.println("We have 0 team members!");
       return;
	   } else {
		   System.out.println("We have the following team members:");
		   cs213.print();
		   }
		 System.out.println("-- end of the list --");
	 }
} //ProjectManager
