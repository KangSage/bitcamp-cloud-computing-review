// 프로퍼티 호출 
package bitcamp.cloud.step05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam02 {

    public static void main(String[] args) {
        ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
                "bitcamp/cloud/step05/application-context-02.xml");
        
        System.out.println(iocContainer.getBean("c1"));
        System.out.println(iocContainer.getBean("c2"));
    }

}
