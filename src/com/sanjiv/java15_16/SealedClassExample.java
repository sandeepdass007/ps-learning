package com.sanjiv.java15_16;
//Sealed classes introduced as preview feature helps in creating a 
// finite and determinable hierarchy of classes in inheritance
public class SealedClassExample {
   public static void main(String[] args) {
      Person manager = new Manager(23, "Robert");
      manager.name = "Robert";
      System.out.println(getId(manager));
   }
   public static int getId(Person person) {
	   //Type test pattern continues to be a preview feature in Java 15 as well
      if (person instanceof Employee emp) {
         return emp.getEmployeeId();
      } 
      else if (person instanceof Manager mgr) {
         return mgr.getManagerId();
      }
      return -1;
   }
}
//Sealed class is declared using "sealed" keyword e.g. below
//Using "permits" keyword it declares which classes to make subclass of it
sealed class Person permits Employee, Manager {
   String name;
   String getName() {
      return name;
   }
}

//A class extending sealed class must be declared as
//either "sealed", "non-sealed" or "final".
final class Employee extends Person {
   String name;
   int id;
   Employee(int id, String name){
      this.id = id;
      this.name = name;
   }
   int getEmployeeId() {
      return id;
   }
}
non-sealed class Manager extends Person {
   int id;
   Manager(int id, String name){
      this.id = id;
      this.name = name;
   }
   int getManagerId() {
      return id;
   }
}
