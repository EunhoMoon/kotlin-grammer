package with_java;

public class JvmFieldExample {

    public static void main(String[] args) {
        // Static 메서드와 동일
//        int id = JvmFieldClass.Companion.getId();
//        String name = JvmFieldObject.INSTANCE.getName();

        // @JvmField 어노테이션을 통해 static으로 사용 가능
        int id = JvmFieldClass.id;
        String name = JvmFieldObject.name;

        // const 키워드를 사용할 경우 java static 필드와 동일하게 사용 가능
        int code = JvmFieldClass.CODE;
        String familyName = JvmFieldObject.FAMILY_NAME;
    }

}
