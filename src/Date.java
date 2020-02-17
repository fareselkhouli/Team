import java.util.StringTokenizer;

/**
  This class reresents the date Object in mm/dd/yyyy format
 @FaresElkhouli
 @ZhiyuFeng
 */
public class Date
{
   private int  day;
   private int  month;
   private int  year;

   /**creates date object by parsing input string
    * @param input date string in mm/dd/yyyy format
    */
   public Date(String d)
   {
      //use StringTokenizer to parse the String and create a Date object
       StringTokenizer date = new StringTokenizer(d,"/");
       this.month = date.nextToken();
       this.day = date.nextToken();
       this.year = date.nextToken();
   }

   /**
    * Date constructor that creates date object
    * @param date object
    */
   public Date(Date d)
   {
      //this is a constructor
      this.day = d.day;
      this.month = d.month;
      this.year = d.year;
   }

   /**
    * Checks if date class is a valid date.
    * returns false if the date is invalid
    * @return true if date is valid, false if date is invalid
    */
   public boolean isValid()
   {
      //initialize constants
      public static final int dayMax = 31;
      public static final int dayMin = 1;
      public static final int monthMax = 12;
      public static final int monthMin = 1;
      public static final int leapFeb = 29;

      if(day > dayMax || day < dayMin || month > monthMax || month < monthMin){
         return false;
      }

      if(month == Month.JAN || month == Month.MAR || month == Month.MAY || month = Month.JUL
              || month == Month.AUG || month = Month.OCT || month = Month.DEC){
         return day == Month.DAYS_ODD;
      }

      if(month == Month.APR || month == Month.JUN || month = Month.SEP || month = Month.NOV){
         return day == Month.DAYS_EVEN;
      }

      if(month = 2){
         if(isLeapYear(year)){
            return day == leapFeb;
         }
         else{
            return day == Month.DAYS_FEB;
         }
      }

   }

   /**
    * helper method that checks if a year is a leap year or not
    * @param integer year
    * @return true if it is a leap year, false if it is not a leap year
    */
   private boolean isLeapYear(int year){

      if(year % Month.QUADRENNIAL != 0){
         return false;
      }

      if(year % Month.CENTENNIAL != 0){
         return true;
      }

      if(year % Month.QUATERCENTENNIAL != 0){
         return true;
      }

      return false;
   }

   /**
    * converts Date object to a string
    * @return String representation of a Date object
    */
   @Override
   public String toString()
   {
       //use the format "month/day/year"
      return month + "/" + day + "/" year;
   }

   /**
    * Checks if two date objects are equal
    * @param date object
    * @return true if both dates are equal, false if the dates are not equal.
    */
   @Override
   public boolean equals(Object obj)
   {
      if(obj.day = this.day && obj.month = this.month && obj.year == this.year){
         return true;
      }
      else{
         return false;
      }
   }

}
