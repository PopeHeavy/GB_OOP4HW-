import java.util.*;

public class TeacherController implements UserController<User>{
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();
    @Override
    public void create(String firstName, String secondName, String lastName) {
        teacherService.create(firstName, secondName, lastName);
    }

    @Override
    public void sendOnConsole() {
        teacherView.sendOnConsole((List<Teacher>) teacherService.getTeacherList());
    }

    public void sortByFIO(){
        teacherService.getTeacherList().sort(new UserComparator<Teacher>());
    }
}