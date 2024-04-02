package advance.dev;

public class MainApp {
   public static void main(String[] args) {
	   Student std1 = new Student("Hậu", 18, "Quảng Trị", "03677737348", 7.6);
	   Student std2 = null;
	   try {
		   std2 = (Student) std1.clone();
	   }catch(CloneNotSupportedException Exception) {
		   Exception.printStackTrace();
	   }
	   System.out.println("Thông tin của std1: "+std1.toString());
	   System.out.println("Thông tin của std2: "+std2.toString());
   }
}
