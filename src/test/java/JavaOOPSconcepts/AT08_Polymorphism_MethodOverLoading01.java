package JavaOOPSconcepts;

import org.junit.Test;

public class AT08_Polymorphism_MethodOverLoading01 {
    @Test
    public void SumOfNum(){
        int i=10;
        int j=20;
        System.out.println("This is SumOfNum First Method value : " + (i+j));
    }
    @Test
    public void SumOfNum(int i){

        int j=20;
        System.out.println("This is SumOfNum First Method value : " + (i+j));
    }

    @Test
    public void SumOfNum(int i,int j){


        System.out.println("This is SumOfNum First Method value : " + (i+j));
    }
}
