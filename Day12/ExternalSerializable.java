package Day12;


import java.io.*;

class ExternalEmployee implements Externalizable {
    private String name;
    private int id;

    public ExternalEmployee() {
    }

    public ExternalEmployee(String name, int id) {
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
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(name);
        out.writeInt(id);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = in.readUTF();
        id = in.readInt();
    }

    @Override
    public String toString() {
        return "ExternalEmployee{name='" + name + "', id=" + id + '}';
    }
}

public class ExternalSerializable {
    public static void main(String[] args) {
        String filename = "external_employee.ser";
 ExternalEmployee employee = new ExternalEmployee("Purushothaman S", 21);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(employee);
            System.out.println("ExternalEmployee object serialized to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            ExternalEmployee deserializedEmployee = (ExternalEmployee) ois.readObject();
            System.out.println("ExternalEmployee object deserialized:");
            System.out.println(deserializedEmployee);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
