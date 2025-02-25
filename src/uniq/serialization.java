package uniq;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.Serializable;

 class serialization implements Serializable {
//    private static final long serialVersionUID = 1L;  // This is used for version control

    private String name;
    private int age;

    // Constructor
    public serialization(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Override toString for better output formatting
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
