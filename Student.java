package advance.dev;

public class Student implements Cloneable {
      private String name;
      private int age;
      private String Address;
      private String PhoneNumber;
      private double dtb;
      
      public Student(String name, int age, String Address, String PhoneNumber, double dtb) {
    	  this.name = name;
    	  this.age = age;
    	  this.Address = Address;
    	  this.PhoneNumber = PhoneNumber;
    	  this.dtb = dtb;
      }
      public void getName(String name) {
    	  this.name = name;
      }
      public String setName(String name) {
    	  return this.name = name;
      }
      public void getAge(int age) {
    	  this.age = age;
      }
      public int setAge(int age) {
    	  return this.age = age;
      }
      public void getAddress(String Address) {
    	  this.Address = Address;
      }
      public String setAddress(String Address) {
    	  return this.Address = Address;
      }
      public void getPhoneNumber(String PhoneNumber) {
    	  this.PhoneNumber = PhoneNumber;
      }
      public String setPhoneNumber(String PhoneNumber) {
    	  return this.PhoneNumber = PhoneNumber;
      }
      public void getDtb(double dtb) {
    	  this.dtb = dtb;
      }
      public double setDtb(double dtb) {
    	  return this.dtb = dtb;
      }
      @Override
      public Object clone() throws CloneNotSupportedException {
    	  return super.clone();
      }
      @Override
      public String toString() {
    	  return "name: "+name+"\nage: "+age+"\nAddress: "+Address+"\nPhoneNumber: "+PhoneNumber+"\ndtb: "+dtb;
      }
      public static void main(String[] args) {
    	  
      }
}
