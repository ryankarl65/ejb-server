import javax.ejb.Remote;

@Remote
public interface PersonInterface {

     String sayHello();

     void addName(String newName);

     void removeNameFromIndex(int i);

     void removeAll();

     String getName(int i);
}
