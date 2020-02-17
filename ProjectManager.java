/**
 
 @author  
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
         char ccommand=command.charAt(0)
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
            	if (ccommand != 'A' || ccommand != 'R' || ccommand != 'P'
            	|| ccommand != 'Q') {
            System.out.print("Command"+"'"+command+"'"+"not supported!");		
            	}
         }  
      }
      //write java code before you terminate the program
   } //run()
   
   private void add()
   {
      	//must check if the date is valid
	//must call the contains() method to check if a given 
	//team member is in the team already
	   if(isVaild(Team.date) == false) {
		   System.out.print(Team.startDate+"is not a vaild date!");
		   return;
	   }
	   if(contains(Team[])==false) {
		   System.out.print(Team.name+Team.startDate+"is already in the team.");
		   return;
	   }
	   add(Team[]);
	   
   }
   
   private void remove()
   {
      //must check if the date is valid
	   if(isVaild(Team.date) == false) {
		   System.out.print(Team.date+"is not a vaild date!");
		   return;
	   }
	   remove(Team[]);
   }
   
   private void print()
   {
      //must check if the team has 0 members. 
	   int count = 0;
	   if(isEmpty(Team) == true) {
		   System.out.print("We have 0 team members!");
	   } else {
		   System.out.print("We have the following team members:");
		   while (count <= Team.length) {
			   System.out.print(Team[count].name+Team[count].startDate);
			   count++;
		   }
		   System.out.print("-- end of the list --");
	   }
   }   
} //ProjectManager
