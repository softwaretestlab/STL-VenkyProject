package LoopsNConditionalStatments;

import org.junit.Test;

    public class AT05_IfElse_Learning {
        @Test
        public void IfElseLoopLearning() {
            String browser = "CHROMEk";
            if (browser.equalsIgnoreCase("chrome")) {
                System.out.println("test case will be executed on chrome");
            }
            else
            {
                System.out.println("test case will not be executed on chrome");
            }
        }
    }