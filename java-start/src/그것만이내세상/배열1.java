package 그것만이내세상;

public class 배열1 {

    public static void main(String[] args) {

        int[] students;
        students = new int[5];

        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;



        int total = students[1] + students[2] + students[3] + students[4] + students[0];
        double average = (double) total / 5;

        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
