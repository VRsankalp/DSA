public class OopsDog {
    public class Dog{
        
        String name ;
        String  Breed ;
        int age ;



        void intro(){
            System.out.println("Hi I AM" + name);
        }
        int getAge(){
            return age;
        }
    }
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name ="bruno";   

    }
}
