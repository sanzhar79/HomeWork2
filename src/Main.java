public class Main {
    public static void main(String[] args) {
        Printable[] objects = new Printable[3];
        objects[0] = createObject("Prince","Arthas", 22);
        objects[1] = createObject("Council", "Advisers", 66);
        objects[2] = createObject("Servant", "Unnamed", 17);


        for (Printable obj : objects) {
            obj.print();
            System.out.println();
        }
    }

    public static Printable createObject(String className, String name, int age) {
        switch (className) {
            case "Prince":
                return new Prince("Arthas", 22, "Prince");
            case "Council":
                return new Council("Soviet", 66, 15);
            case "Servant":
                return new Servant("UNNAMED", 18, "Domestic");
            default:
                return null;
        }
    }
}