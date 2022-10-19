public class Cat
{
    private String name;
    private int age;

    public Cat(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String speak()
    {
        int n = (int)(Math.random()*4)+1;
        if (n == 1){
            return "meow";
        }else if (n == 2){
            return "woof";
        }else {
            return "Cats don't talk dummy.";
        }
    }

    public void introduce()
    {
        System.out.println("Hello. My name is " + name + " and I am " + age + " years old. Now, mind your own business.");
    }
}
