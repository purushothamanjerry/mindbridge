
package Day14;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.File;

public class XMLFileParser {
    public static void main(String[] args) {
        try {
            File xmlFile = new File("D:\\users\\Backend2\\src\\Day14\\college.xml");
            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = builder.parse(xmlFile);

            NodeList students = document.getElementsByTagName("student");
            for (int i = 0; i < students.getLength(); i++) {
                Element student = (Element) students.item(i);

                String id = student.getElementsByTagName("id").item(0).getTextContent();
                String name = student.getElementsByTagName("name").item(0).getTextContent();
                String department = student.getElementsByTagName("department").item(0).getTextContent();
                String grade = student.getElementsByTagName("grade").item(0).getTextContent();

                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Department: " + department);
                System.out.println("Grade: " + grade);
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}