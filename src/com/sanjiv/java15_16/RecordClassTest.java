package com.sanjiv.java15_16;

public class RecordClassTest {
   public static void main(String[] args) {
      StudentRecord student1 = new StudentRecord (1, "Julie", "Red", "VI", 12);
      StudentRecord student2 = new StudentRecord (1, "Julie", "Red", "VI", 12);
      System.out.println(student1.id());
      System.out.println(student1.name());
      System.out.println(student1);
      System.out.println(student1.equals(student2));
      
      Person1 employee = new Employee1(23, "Robert");
      System.out.println(employee.id());
	   System.out.println(employee.name());
   }
}
/* 
 * Have implicit constructor with all the parameters as field variables.
 * Have implicit field getter methods for each field variables.
 * Have implicit field setter methods for each field variables. ?????????????
 * Have implicit sensible implementation of hashCode(), equals() and toString() methods.
 * Java 15, native methods cannot be declared in records.
 * Java 15, implicit fields of record are not final and modification 
 * using reflection will throw IllegalAccessException.
 */
record StudentRecord(int id, 
   String name, 
   String section, 
   String className,
   int age){}

sealed interface Person1 permits Employee1, Manager1 {
	   int id();
	   String name();
	}
//Records are final by default and can extend interfaces
record Employee1(int id, String name) implements Person1 {}
record Manager1(int id, String name) implements Person1 {}