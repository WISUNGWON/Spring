package lec01Pjt001;

import operator.CalAdd;
import operator.CalDiv;
import operator.CalMul;
import operator.CalSub;

public class MainClass {

    public static void main(String[] args) {
       
        MyCalculator cal;
        
        cal = new MyCalculator(10, 5, new CalAdd());
        cal.result();
        
        cal = new MyCalculator(10, 5, new CalSub());
        cal.result();
        
        cal = new MyCalculator(10, 5, new CalMul());
        cal.result();
        
        cal = new MyCalculator(10, 5, new CalDiv());
        cal.result();

    }

}
