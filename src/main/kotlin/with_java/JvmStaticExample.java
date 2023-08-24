package with_java;

public class JvmStaticExample {

    public static void main(String[] args) {
        // companion object를 사용하기 위해서는 Companion 키워드를 사용해야 한다.
//        String hello = HelloClass.Companion.hello();

        // object 객체를 사용하기 위해서는 INSTANCE 키워드를 사용해야 한다.
//        String hi = HiObject.INSTANCE.hi();

        // @JvmStatic 어노테이션을 통해 static 메서드 처럼 호출 가능
        String hello = HelloClass.hello();
        String hi = HiObject.hi();
    }

}
