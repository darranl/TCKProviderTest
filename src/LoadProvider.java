import java.security.Policy;

public class LoadProvider {

    public static void main(String[] args) throws Exception {
        ClassLoader classLoader = LoadProvider.class.getClassLoader();

        Object temp = classLoader.loadClass("com.sun.ts.tests.jacc.provider.TSPolicy").newInstance();
        Policy policy = Policy.class.cast(temp);

    }

}
