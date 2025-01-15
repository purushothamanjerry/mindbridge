package Day12;

import java.io.*;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', id=" + id + '}';
    }
}

public class Serialize_Deserialize  {
    public static void main(String[] args) {
        String filename = "employee.ser";

        Employee employee = new Employee("Purushothaman S", 21);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(employee);
            System.out.println("Employee object serialized to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Employee deserializedEmployee = (Employee) ois.readObject();
            System.out.println("Employee object deserialized:");
            System.out.println(deserializedEmployee);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
