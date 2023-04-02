import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Student s1 = new Student("丁一", 30);
        Student s2 = new Student("李二", 32);
        Student s3 = new Student("王五", 30);
        Student s4 = new Student("鼠鼠", 18);
        Student s5 = new Student("猫猫", 6);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int ju0 = s1.getAge() - s2.getAge();
                int ju1 = ju0 == 0 ? s1.getName().compareTo(s2.getName()) : ju0;
                return ju1;
            }
        });
        for (Student s : list) {
            System.out.println(s.getName() + "," + s.getAge());
            System.out.println("v2");
            System.out.println("unstable");
            System.out.println("master-text");
            System.out.println("unstable-text");
            System.out.println("push-text");
        }

    }
}