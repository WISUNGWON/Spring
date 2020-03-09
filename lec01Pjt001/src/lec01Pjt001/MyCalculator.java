package lec01Pjt001;

import operator.Calculator;
public class MyCalculator {

    public int fNum, sNum;
    public Calculator cal;
    
    public MyCalculator(int fNum, int sNum, Calculator cal) {
        this.fNum = fNum;
        this.sNum = sNum;
        this.cal = cal;
    }
    
    public void result() {
        int value = cal.calculator(this.fNum, this.sNum);
        System.out.println("result : " + value);
    }
    
    public Calculator getCalculator() {
        return cal;
    }
    
    public void setCalculator(Calculator cal) {
        this.cal = cal;
    }
    
    public int getfNum() {
        return fNum;
    }
    
    public void setfNum(int fNum) {
        this.fNum = fNum;
    }
}
