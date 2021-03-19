package ivge;

import java.util.Arrays;

public class Student{
    private String name = "";
    private Integer number = 1;
    private char letter = 'a';
    private int[] marks = {};

    Student(String name) {
        this(name, 1, 'a');
    }

    Student(String name, Integer number) {
        this(name, number, 'a');
    }

    Student(String name, Integer number, char letter) {

        this(name, number, 'a', new int[]{});
    }

    Student(String name, Integer number, char letter, int[] marks) {
        this.name = name;
        this.number = number;
        this.letter = letter;

        checkMarks(marks);

        this.marks = Arrays.copyOf(marks, marks.length);
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getMarks() {
        return Arrays.copyOf(marks, marks.length);
    }

    public void setMarks(int[] marks) {
        checkMarks(marks);
        this.marks = Arrays.copyOf(marks, marks.length);
    }


    private void checkMarks(int[] marks){
        for(int mark : marks)
            if (!(2 <= mark && mark <= 5))
                throw new IllegalArgumentException();
    }




}
