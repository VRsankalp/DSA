public class OopsDogDemo {
     public class Dog{
        
        String name ;
        String  Breed ;
        int age ;



        void  static intro(){
            System.out.println("Hi I AM" + name);
        }
        int getAge(){
            return age;
        }
    }
    public static void main(String[] args) {
        Dog dq = new Dog();
    }
    
}
