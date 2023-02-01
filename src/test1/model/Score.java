package test1.model;

public class Score {
    private int kor;
    private int eng;
    private int math;
    private int tot;
    private double avg;

    public Score() {
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getTot() {
        return tot;
    }

    public void setTot(int tot) {
        this.tot = tot;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Score{" +
                "kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                ", tot=" + tot +
                ", avg=" + avg +
                '}';
    }

    public void process(){
        tot = kor + eng + math;
        avg = (double) tot / 3;
        if(kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
            System.out.printf("합격입니다.");
        }else {
            System.out.printf("불합격입니다.");
        }
    }

}
