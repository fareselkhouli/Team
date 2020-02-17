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
            case 'A': add();
		      break; 
            case 'R': remove();
              break;
            case 'P': print();
              break;
            case 'Q': print();
            System.out.print("The team is ready to go!");
            break;
            default: //deal with bad command here 
            System.out.print("Command"+"'"+command+"'"+"not supported!");		
         }
         }  
      }
      //write java code before you terminate the program
   } //run()
   /**
    * This is the method to call the method add in the team class.
    */
   private void add()
   {
      	//must check if the date is valid
	//must call the contains() method to check if a given 
	//team member is in the team already
	   if(!Team.date.isVaild()) {
		   System.out.print(Team.startDate+"is not a vaild date!");
		   return;
	   }
	   if(contains(Team[])==false) {
		   System.out.print(Team.name+Team.startDate+"is already in the team.");
		   return;
	   }
	   cs213.add();
	   
   }
   /**
    * This is the method to calls the remove method in the Team section.
    */
   private void remove()
   {
      //must check if the date is valid
	   if(isVaild(Team.date) == false) {
		   System.out.print(Team.date+"is not a vaild date!");
		   return;
	   }
	   cs213.remove();
   }
   /**
    * This is the method to print out the whole team chart.
    */
   private void print()
   {
      //must check if the team has 0 members. 
	   int count = 0;
	   if(isEmpty(Team) == true) {
		   System.out.print("We have 0 team members!");
	   } else {
		   System.out.print("We have the following team members:");
		   cs213.print();
		   }
		   System.out.print("-- end of the list --");
	   }
   }   
} //ProjectManager
