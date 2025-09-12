package reviewall.CClass;

public class class1 {

    public static void main(String[] args) {

        String[] studentNames = {"학생1", "학생2"}; //그냥 넣는것보다 좋으나 넣고 빼고 하는것이 여전히 번거로움
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 80};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름:" + studentNames[i] + " 나이:" + studentAges[i] + " 성적:" + studentGrades[i]);
        }

    }
}
