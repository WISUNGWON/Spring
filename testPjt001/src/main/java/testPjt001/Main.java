package testPjt001;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
        
        TransportationWalk transportationWalk = ctx.getBean("tWalk", TransportationWalk.class);
        transportationWalk.move();
        
//      TransportationWalk transpotationWalk = new TransportationWalk();
//      transpotationWalk.move(); 
        
        ctx.close();
        

    }

}
 