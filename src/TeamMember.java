/**
 * This class represents the team member object
 * @author Fares Elkhouli
 * @author Zhiyu Feng
 */
public class TeamMember
{
   private String name;
   private Date   startDate;

   /**
    * TeamMember constructor
    * @param nm name of team member
    * @param date start date of team member
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
    * @param obj team member to be compared with anothe member
    * @return Boolean true if name and startdate are the same, false if they are not
    */
   @Override
   public boolean equals(Object obj)
   {
      //name and startDate must be the same
      if(obj == null){
        return false;
      }
      TeamMember currMember = (TeamMember) obj;
      return (currMember.name.equals(this.name) && currMember.getStartDate().equals(this.startDate));
   }

   /**
    * String representation of a teammember
    * @return string representation of a teammember
    */
   @Override
   public String toString()
   {
       //name + " " + startDate;
      return this.name + " " + this.startDate.toString();

   }

   public static void main(String [] args)
   {
      //testbed main; you must include test cases that exercise
      //the constructor and all methods in this class.
      Date testDate = new Date("1/20/2015");
      String testName = "John";

      //test constructor
      TeamMember testMember = new TeamMember(testName,testDate);
      System.out.println(testMember.toString());

      //test getstartdate
      Date getDateTest = testMember.getStartDate();
      System.out.println(getDateTest.toString());

      //test equals
      Date testDate2 = new Date("1/21/2015");
      String testName2 = "John";
      TeamMember testMember2 = new TeamMember(testName2,testDate2);

      boolean checkEquality = testMember.equals(testMember2);
      System.out.println(checkEquality);

      return;
   }
}
