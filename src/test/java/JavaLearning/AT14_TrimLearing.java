package JavaLearning;

import org.junit.Test;

public class AT14_TrimLearing {
    @Test
    public void trimlearn(){
        String  MyName = "        TestLab          ";
        //Before trimming
        System.out.println("MyName : "+MyName);
        //Trim will remove front and back spaces
        System.out.println("MyName : "+MyName.trim());
    }
}
