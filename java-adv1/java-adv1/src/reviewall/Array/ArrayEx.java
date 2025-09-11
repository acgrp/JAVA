package reviewall.Array;

public class ArrayEx {

    public static void main(String[] args) {
        int [] student1 = {90,80,70,60,50};

        int total = student1[1] + student1[2] + student1[3] + student1[4] + student1[0];
        double average = (double) total / student1.length;
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
