// 의존 객체 주입 자동화 하기 - 셋터에 @AutoWired 애노테이션 붙이기
package bitcamp.cloud.step08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam03 {

    public static void main(String[] args) {
        ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
                "bitcamp/cloud/step08/application-context-03.xml");
        
        System.out.println(iocContainer.getBean("c1"));
    }

}
