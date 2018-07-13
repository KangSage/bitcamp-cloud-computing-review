// 스프링 IoC 컨테이너 사용
package bitcamp.cloud.step02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bitcamp.cloud.BeanUtils;

public class Exam04 {
    public static void main(String[] args) {
        ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
                "bitcamp/cloud/step02/application-context-04.xml");
        
        BeanUtils.printBeanNames(iocContainer);

        BeanUtils.printBeanAliases(iocContainer, "bitcamp.cloud.step02.Car#0");
        BeanUtils.printBeanAliases(iocContainer, "bitcamp.cloud.step02.Car#1");
        BeanUtils.printBeanAliases(iocContainer, "bitcamp.cloud.step02.Car#2");
        BeanUtils.printBeanAliases(iocContainer, "bitcamp.cloud.step02.Car#3");
        
        BeanUtils.printBeanAliases(iocContainer, "bitcamp.cloud.step02.Engine#0");
        BeanUtils.printBeanAliases(iocContainer, "bitcamp.cloud.step02.Engine#1");
        BeanUtils.printBeanAliases(iocContainer, "bitcamp.cloud.step02.Engine#2");
    }
}
