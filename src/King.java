public abstract class King implements Printable {
    private String name;
    private int age;

    public King(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public void print() {
        System.out.println("information: ");
        System.out.println("name: "+name);
        System.out.println("age: "+age);
    }
}
