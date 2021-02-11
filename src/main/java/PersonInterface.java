import javax.ejb.Remote;
import java.util.List;

@Remote
public interface PersonInterface {

    String sayHello();

    void addName(String newName);

    void removeNameFromIndex(int i);

    void removeAll();

    String getName(int i);

    List<String> getAll();
}
