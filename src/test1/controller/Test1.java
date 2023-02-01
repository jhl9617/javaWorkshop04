package test1.controller;

import test1.model.Score;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Score score = new Score();
        System.out.print("국어점수 :");
        score.setKor(scanner.nextInt());
        System.out.print("수학점수 :");
        score.setMath(scanner.nextInt());
        System.out.print("영어점수 :");
        score.setEng(scanner.nextInt());

        score.process();

    }
}
