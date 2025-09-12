package reviewall.CClass;

public class ClassStart3 {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 18;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 19;
        student2.grade = 100;

        //배열 선언
        Student[] students = new Student[]{student1, student2};

        //for문 적용
        for (int i = 0; i < students.length; i++) { //이전과 다르게 배열에 넣은 것을 반복분의 i를 이용해 출력
            System.out.println("이름:" + students[i].name + " 나이:" + students[i].age + " 성적:" + students[i].grade);
        }
    }
}
