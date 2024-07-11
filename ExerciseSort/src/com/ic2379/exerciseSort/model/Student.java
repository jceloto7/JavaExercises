//por jceloto7

package com.ic2379.exerciseSort.model;

public class Student implements Comparable<Student> {
    String name;
    int grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public int compareTo(Student student) {
        int gradeComparison = Double.compare(student.getGrade(),this.getGrade());
        if (gradeComparison !=0){
            return gradeComparison;
        } else{
            return this.getName().compareTo(student.getName());
        }
    }
}
