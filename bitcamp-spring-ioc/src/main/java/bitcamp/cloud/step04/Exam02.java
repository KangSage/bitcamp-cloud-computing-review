// 객체 생성
package bitcamp.cloud.step04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam02 {
    public static void main(String[] args) {
        ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
                "bitcamp/cloud/step04/application-context-02.xml");
        
        System.out.println(iocContainer.getBean("c1"));
        System.out.println("========================");
        System.out.println(iocContainer.getBean("c2"));
    }
}
