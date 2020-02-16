/**
 This class represents the team member object
 @FaresElkhouli
 @ZhiyuFeng
 */
public class TeamMember 
{
   private String name;
   private Date   startDate;

   /**
    * TeamMember constructor
    * @param String name of team member
    * @param Date start date of team member
    */
   public TeamMember(String nm, Date date)
   {
       this.name = nm;
       this.startDate = date;
   }

   /**
    * Returns the start date of a team member
    * @return Date startdate of teammember
    */
   public Date getStartDate()
   {
      return new Date(startDate);
   }

   /**
    * checks if two teammembers are equal
    * @param teammember object
    * @return true if name and startdate are the same, false if they are not
    */
   @Override
   public boolean equals(Object obj)
   {
      //name and startDate must be the same
      return (obj.name.equals(this.name) && obj.getStartDate.equals(this.starDate));
   }

   /**
    * String representation of a teammember
    * @return string representation of a teammember
    */
   @Override
   public String toString()
   {
       //name + " " + startDate;
      return name + " " + date.toString();

   }

   public static void main(String [] args)
   {
      //testbed main; you must include test cases that exercise 
      //the constructor and all methods in this class.
   }
}