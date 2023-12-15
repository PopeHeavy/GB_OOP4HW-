import java.util.*;

public interface UserView <T extends User>{
    void sendOnConsole(List<T> list);
}