// 객체 생성
package bitcamp.cloud.step03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bitcamp.cloud.BeanUtils;

public class Exam01 {
    public static void main(String[] args) {
        ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
                "bitcamp/cloud/step03/application-context-01.xml");
        
        BeanUtils.printBeanList(iocContainer);

    }
}
