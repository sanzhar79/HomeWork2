public class Servant extends King {
    private String occupation;

    public Servant(String name, int age, String occupation) {
        super(name, age);
        this.occupation = occupation;
    }
    @Override
    public void print(){
        super.print();
        System.out.println("Occupation: "+ occupation);
    }
}
