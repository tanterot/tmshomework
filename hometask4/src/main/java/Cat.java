public class Cat {
    public String name;
    public int age;
    public String breed;

    public Cat(String name,int age,String breed){
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
    public Cat(String name,int age){
        this(name,age,"without breed");
    }
    public void printInfo(){
        System.out.print("name: "+ name);
        System.out.print(" ,age: "+ age);
        System.out.print(" ,breed: "+ breed);
        System.out.println();
    }
    public void newName(String name){
        this.name=name;
        System.out.println("new name cat is: "+this.name);
    }
}
