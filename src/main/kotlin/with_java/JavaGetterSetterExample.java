package with_java;

import java.time.LocalDate;

public class JavaGetterSetterExample {

    public static void main(String[] args) {

        Student student = new Student();

        // kotlin에서 var로 선언된 변수는 setter 및 getter 호출이 가능하다.
        student.setName("Janek");
        student.setBirthDate(LocalDate.of(1992, 1, 28));

        System.out.println(student.getName());
        System.out.println(student.getBirthDate());

        // val로 선언된 변수는 getter만 사용 가능하다.
        System.out.println(student.getAge());

        // var로 선언한 변수도 private set을 사용하면 외부에서 값 변경이 불가능하다.
        student.changeGrade("A");
        System.out.println(student.getGrade());

        // @JvmField 사용시 kotlin에서 처럼 프로퍼티로만 접근 가능하다.
        student.jvmValue = "test";
        System.out.println(student.jvmValue);
    }

}
