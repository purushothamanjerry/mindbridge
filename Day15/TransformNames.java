package Day15.Lambda;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TransformNames {

    public TransformNames() {
        List<String> studentNames = new ArrayList<>();
        studentNames.add("Vishnu");
        studentNames.add("Priyan");
        studentNames.add("Shan");
        studentNames.add("Pavi");
        studentNames.add("Gogul");
        studentNames.add("Praveen");


        List<String> transformedNames = studentNames.stream()
                .map(name -> "Student: " + name.toUpperCase())
                .collect(Collectors.toList());

        System.out.println("\nTransformed List:");
        transformedNames.forEach(System.out::println);
    }

    public static void main(String[] args) {
        new TransformNames();
    }
}

