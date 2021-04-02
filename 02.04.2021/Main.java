package ivge;

import javax.management.openmbean.KeyAlreadyExistsException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student(new int[]{3, 2, 5});
        Student student2 = new Student(new int[]{1, 2, 5});
        Student student3 = new Student(new int[]{5, 5, 5});
        ArrayList<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);

        System.out.println(students);
        students.sort(Student::compareTo);
        System.out.println(students);


        Pupil pupil1 = new Pupil(new int[]{3, 2, 5});
        Pupil pupil2 = new Pupil(new int[]{1, 2, 5});
        Pupil pupil3 = new Pupil(new int[]{5, 5, 5});

        ArrayList<Pupil> pupils = new ArrayList<>();

        pupils.add(pupil1);
        pupils.add(pupil2);
        pupils.add(pupil3);

        System.out.println(pupils);
        pupils.sort(Pupil::compareTo);
        System.out.println(pupils);
    }
}