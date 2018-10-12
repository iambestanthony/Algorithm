package algorithm.selection_sort_using_comparable;

import java.util.Comparator;

/**
 * Created by JayJ on 2018/10/12.
 **/
public class Student implements Comparable<Student>{
    private String name;
    private int score;

    public Student(String name,int score){
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Student that) {
        if (this.score < that.score)
            return -1;
        else if(this.score>that.score)
            return 1;
        else
            //return 0;
            return this.name.compareTo(that.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }


}
