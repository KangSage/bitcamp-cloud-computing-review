// 객체 생성
package bitcamp.cloud.step03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bitcamp.cloud.BeanUtils;

public class Exam03 {
    public static void main(String[] args) {
        ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
                "bitcamp/cloud/step03/application-context-03.xml");
        
        BeanUtils.printBeanList(iocContainer);

    }
}
