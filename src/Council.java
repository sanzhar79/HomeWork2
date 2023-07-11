public class Council extends King{
private int members;


    public Council(String name, int age, int members) {
        super(name, age);
        this.members=members;
    }
    @Override
    public void print(){
        super.print();
        System.out.println("Members: "+ members);
    }
}
