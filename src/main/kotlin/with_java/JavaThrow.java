package with_java;

import java.io.IOException;

public class JavaThrow {

    public void throwIOException() throws IOException {
        throw new IOException("Checked Exception, IOException occurred");
    }

    public static void main(String[] args) {
        JavaThrow javaThrow = new JavaThrow();

        try {
            javaThrow.throwIOException();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // java에서 사용할지라도 예외 처리를 강제하지 않는다.
        KotlinThrow kotlinThrow = new KotlinThrow();
        kotlinThrow.throwIOException();
    }

}
