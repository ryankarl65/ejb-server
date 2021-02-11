import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class PersonServiceImpl implements PersonInterface {

    private List<String> person = new ArrayList<>();

    @Override
    public String sayHello() {
        return "Hello, I'm the beans on the server ^^ ";
    }

    @Override
    public void addName(String newName) {

        person.add(newName);
    }

    @Override
    public void removeNameFromIndex(int i) {
        person.remove(i);
    }

    @Override
    public void removeAll() {
        person.clear();
    }

    @Override
    public String getName(int i) {
        return person.get(i);
    }

    @Override
    public List<String> getAll() {
        return person;
    }
}
