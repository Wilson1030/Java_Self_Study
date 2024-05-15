package 抽象类演示;

public abstract class Person {
   private String name;
   private int age;

   public Person() {}

   public Person(String name, int age) {
    this.age = age;
    this.name = name;
   }
   
    public abstract void work();
    
    public void sleep() {
        System.out.println("睡觉");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
