package lec03Pjt001;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		
//		  TransportationWalk transpotationWalk = new TransportationWalk();
//		  transpotationWalk.move(); 
		
		// 스프링 컨테이너에 접근
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml"); //컨테이너에 접근하기 위한 data type, 컨테이너를 가져옴
		
		TransportationWalk transportationWalk = ctx.getBean("tWalk", TransportationWalk.class);// 컨테이너에 있는 bean을 가져옴 ID와 data type 입력.
		transportationWalk.move();
		
		ctx.close(); //java에서는 외부 리소스 사용 후 반환을 해야함.
		
		
				
		 
		
	}

}
