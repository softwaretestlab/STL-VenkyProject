package JavaLearning;

import org.junit.Test;

public class AT04_GlobalVariables {
    //global variables
    int i = 10;
    int j = 20;
    String test01 = "Software";
    @Test
    public void test05(){
        //local variables
        int m =30;
        int x = m+i+j;
        System.out.println("M value is : "+ x);
    }

    @Test
    public void test06(){
    //local variables
        int k =i+j;
        System.out.println("k value is : "+k);
        System.out.println("test01 value is : "+test01 );
    }
}
