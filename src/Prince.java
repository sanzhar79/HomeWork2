public class Prince extends King {
    private String title;

    public Prince(String name, int age, String title) {
        super(name, age);
        this.title=title;
    }
    @Override
    public void print(){
        super.print();
        System.out.println("Title: "+ title);
    }
}

