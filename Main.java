public class Main {
    public static void main(String[] args) {
        TeacherController controller = new TeacherController();
        controller.create("Alex", "Vladimir", "Griggs");
        controller.create("Bob", "Billy", "Tornton");
        controller.create("Cillian", "Jack", "Murphy");
        controller.create("Dick", "Smith", "Chaney");
        controller.sendOnConsole();
        controller.sortByFIO();
        System.out.println();

    }

}