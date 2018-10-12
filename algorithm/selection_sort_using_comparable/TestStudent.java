package algorithm.selection_sort_using_comparable;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by JayJ on 2018/10/12.
 **/
public class TestStudent {
    public static void main(String[] args){
        Student b = new Student("B", 90);
        Student c = new Student("C", 84);
        Student a = new Student("A", 68);
        Student d = new Student("D", 98);
        Student e = new Student("E", 84);
        Student[] stu = new Student[5];
        stu[0] = b;
        stu[1] = c;
        stu[2] = a;
        stu[3] = d;
        stu[4] = e;
        sort(stu);
        for (int i = 0; i < stu.length; i++) {
            System.out.println(stu[i]);
        }
        System.out.println("--------------------------");
        TreeSet<Student> students = new TreeSet<>();
        students.add(a);
        students.add(b);
        students.add(c);
        students.add(d);
        students.add(e);
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void sort(Comparable[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[minIndex].compareTo(arr[j])<0){
                    minIndex = j;
                }
            }
            //把最小的minIndex的对象放到第一个位置
            swap(arr,i,minIndex);
        }
    }

    private static void swap(Object[] arr, int i, int minIndex) {
        Object t = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = t;
    }
}
