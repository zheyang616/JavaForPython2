// package JavaForPython2;

public class Startup {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 5;
        System.out.println("Circle 1s radius " + circle.radius);

        Circle circle2 = new Circle();
        System.out.println("Circle 2s radius " + circle2.radius);

        circle.radius = 10;
        //System.out.println("Circle 2s radius " + circle2.radius);

        int radius = 5;
        System.out.println("radius1 " + radius);
        
        int radius2 = radius;
        System.out.println("radius2 " + radius2);

        radius = 76;
        System.out.println("radius2 " + radius2);

        String name = "Zhe";
        String name1 = "Zhe";

        System.out.println(name.toUpperCase());

        Student student = new Student();
        System.out.println(student);
        System.out.println(student.name);

        student.name = "Zhe";
        System.out.println(student.name);
        //student.GPA = Double.parseFloat("unknown");

        String str = "Introduction";
            int vowelCount = countVowels(str);
            System.out.println("Number of vowels in the string: " + vowelCount); 
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
        public static int getVowels(String term){
            
            for(int i = 0; i < term.length(); i++){
                char letter = term.charAt(i);

                if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){

                }
            }
        }
        
            
        
    
}
