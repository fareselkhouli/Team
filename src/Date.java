import java.util.StringTokenizer;

/**
  This class reresents the data Object
 @Fares Elkhouli @Zhiyu Feng
 */
public class Date
{
   private int  day;
   private int  month;
   private int  year;

   //creates date object by parsing input string
   public Date(String d)
   {
      //use StringTokenizer to parse the String and create a Date object
       StringTokenizer date = new StringTokenizer("d");

   }

   public Date(Date d)
   {
      //this is a constructor
   }

   public boolean isValid()
   {

   }

   @Override
   public String toString()
   {
       //use the format "month/day/year"
   }

   @Override
   public boolean equals(Object obj)
   {

   }
}
