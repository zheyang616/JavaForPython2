// package JavaForPython2;

import java.time.LocalDate;

public class Startup {
    public static void main(String[] args) {
      Student student = new Student();
      student.major = Major.COMPUTERSCIENCE;
      student.name = "Zhe";
      student.dateOfBirth = LocalDate.of(1994, 5, 2);
      System.out.println(student);  
      System.out.println(student.getAge());

      Student student2 = new Student();
      student2.major = Major.PSYCHOLOGY;
      student2.name = "Yang";
      System.out.println(student2);
      System.out.println(student2.toString("Yang"));

      if(student.major == Major.COMPUTERSCIENCE){
        System.out.println("Computers are the best");
      }

      Car car1 = new Car();
      car1.setHorsePower(14);
      car1.setCarStyle(CarStyle.SUV);
      car1.setPowerType(PowerType.UNLEADED);

      Car car2 = new Car();

      Car car3 = new Car();
      car3.setHorsePower(195);

      System.out.println(car1.getHorsePower());
      System.out.println(car2.getHorsePower());
      System.out.println(car3.getHorsePower());


      Instructor teacher = new Instructor();
      teacher.email = "zhe.yang@stmartin.edu";
      Instructor teacher2 = new Instructor();
    }
    public static double harmonic(int n){
        int local = 0;
        System.out.println(local);

        for(int i = 0; i < 3; i++){
            int forLoopLocal = 1;
            System.out.println(forLoopLocal);
        }
        return n;
    }
        public static int countVowels(String input){
            input = input.toLowerCase();

            int count = 0;
            for(int i = 0; i < input.length(); i++){
                char ch = input.charAt(i);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    count++;
                }
            
            }
            return count;
        }
        // public static int getVowels(String term){
            
        //     for(int i = 0; i < term.length(); i++){
        //         char letter = term.charAt(i);

        //         if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){

        //         }
        //     }
        // }
        
            
        
    
}
