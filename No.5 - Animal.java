public class Animal extends Pet {
    private boolean walk, eat;

    public Animal(String name) {
        super(name);
        walk = true;
        eat = false;
    } 
    public void move (){
        System.out.println(this.getName() + " is moving. ");
    }
    public void speak() {
        System.out.println("Speaking...");
    }
}