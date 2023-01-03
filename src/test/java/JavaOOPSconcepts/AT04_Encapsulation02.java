package JavaOOPSconcepts;

import org.junit.Test;

public class AT04_Encapsulation02 {
    @Test
    public void envMethod03() {
        AT03_Encapsulation01 obj = new AT03_Encapsulation01();
        // void
        obj.encMethod01(110, 220);



        // here we are using the value from return statement into code
        int c = obj.encMethod02(90,80);
        int z  = c + 40;
        System.out.println("Z value is : "+ z);
    }

    }