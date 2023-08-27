package with_java;

public class ExtensionExample {

    public static void main(String[] args) {
        // "ABCD".first();
        // "ABCD".addFirst('Z');

        // 확장함수를 해당 파일명 + Kt의 static 메서드 형태로 호출해야 한다.
        char first = MyExtensionsKt.first("ABCD");
        String addFirst = MyExtensionsKt.addFirst("ABCD", 'Z');

        System.out.println("first = " + first);
        System.out.println("addFirst = " + addFirst);
    }

}
