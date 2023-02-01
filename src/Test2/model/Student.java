package Test2.model;

import test1.model.Score;

import java.util.Scanner;

public class Student {

    Scanner scanner = new Scanner(System.in);
    private String name;
    private int grade;
    private int clas;
    private int num;
    private char gen;
    private double score;

    public Student() {
    }

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

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public char getGen() {
        return gen;
    }

    public void setGen(char gen) {
        this.gen = gen;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getClas() {
        return clas;
    }

    public void setClas(int clas) {
        this.clas = clas;
    }

    public void information() {
        System.out.print("학생이름 :");
        name = scanner.next();
        System.out.print("학년 :");
        grade = scanner.nextInt();
        System.out.print("반 :");
        clas = scanner.nextInt();
        System.out.print("성별 (M/F) :");
        gen= scanner.next().charAt(0);
        System.out.print("점수 :");
        score = scanner.nextDouble();
        System.out.printf(grade + "학년 " +  grade + "반 " + clas + ((gen == 'M')? '남' : '여') + "학생 " + name + "는 성적이 "+ score +"점 입니다." );
    }
}
