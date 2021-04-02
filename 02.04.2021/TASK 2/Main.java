package ivge;

import javax.management.openmbean.KeyAlreadyExistsException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student(new int[]{3, 5, 5});
        Student student2 = new Student(new int[]{1, 2, 5});
        Student student3 = new Student(new int[]{5, 5, 5});
        ArrayList<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);

        System.out.println(students);
        students.sort(Student::compareTo);
        System.out.println(students);


        Pupil pupil1 = new Pupil(new int[]{2, 5, 5});
        Pupil pupil2 = new Pupil(new int[]{1, 2, 5});
        Pupil pupil3 = new Pupil(new int[]{5, 5, 5});

        ArrayList<Pupil> pupils = new ArrayList<>();

        pupils.add(pupil1);
        pupils.add(pupil2);
        pupils.add(pupil3);

        System.out.println(pupils);
        pupils.sort(Pupil::compareTo);
        System.out.println(pupils);


        ArrayList<Humanable> humanities = new ArrayList<>();
        humanities.add(student1);
        humanities.add(student2);
        humanities.add(pupil2);
        humanities.add(student3);
        humanities.add(pupil1);
        humanities.add(pupil3);

        System.out.println(humanities);
        humanities.sort((Humanable::compareTo));
        System.out.println(humanities);

        /*
[Student{marks=[3, 5, 5]}, Student{marks=[1, 2, 5]}, Student{marks=[5, 5, 5]}]
[Student{marks=[1, 2, 5]}, Student{marks=[3, 5, 5]}, Student{marks=[5, 5, 5]}]
[Pupil{marks=[2, 5, 5]}, Pupil{marks=[1, 2, 5]}, Pupil{marks=[5, 5, 5]}]
[Pupil{marks=[1, 2, 5]}, Pupil{marks=[2, 5, 5]}, Pupil{marks=[5, 5, 5]}]
[Student{marks=[3, 5, 5]}, Student{marks=[1, 2, 5]}, Pupil{marks=[1, 2, 5]}, Student{marks=[5, 5, 5]}, Pupil{marks=[2, 5, 5]}, Pupil{marks=[5, 5, 5]}]
[Pupil{marks=[1, 2, 5]}, Pupil{marks=[2, 5, 5]}, Pupil{marks=[5, 5, 5]}, Student{marks=[1, 2, 5]}, Student{marks=[3, 5, 5]}, Student{marks=[5, 5, 5]}]
         */
    }
}