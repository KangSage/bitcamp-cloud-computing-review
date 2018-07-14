// 프로퍼티 호출 
package bitcamp.cloud.step06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam01 {

    public static void main(String[] args) {
        
        Car c = CarFactory.create("티코");
        
        ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
                "bitcamp/cloud/step06/application-context-01.xml");
        
        System.out.println(iocContainer.getBean("c1"));
        System.out.println(iocContainer.getBean("c2"));
        System.out.println(iocContainer.getBean("c3"));
    }

}
