/*****************************************
* Author : Nathan Nieman
* Date : 11/8/2020
* Assignment: School Class
* Purpose: Responsible for keeping track of
* schools money earned and spent.
******************************************/
import java.util.List;

public class School
{
   public List<Teacher> teachers;
   public List<Student> students;
   public static int totalMoneyEarned;
   public static int totalMoneySpent;
   public static int totalMoney;
   
   /**
    * New school object is created.
    */
   public School(List<Teacher> teachers, List<Student> students) 
   {
      this.teachers = teachers;
      this.students = students;
      totalMoneyEarned = 0;
      totalMoneySpent = 0;
      totalMoney = 0;
   }

   /**
    * Adds the total money earned by the school.
    */
   
   public static void updateTotalMoneyEarned(int moneyEarned)
   {
      totalMoneyEarned = moneyEarned;
   }

   
   /**
    * Update the money that is spent by the school, which
    * is the salary given by the school to the teachers.
    */
    
   public static void updateTotalMoneySpent(int moneySpent)
   {
      totalMoneySpent += moneySpent;
   }

   
   /**
    * Update the total money of the school subtracting teacher
    * salaries and adding student's fees paid.
    */
    
   public static void updateTotalMoney()
   {
      totalMoney = totalMoneyEarned - totalMoneySpent;
   }
}
