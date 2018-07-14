// 프로퍼티 에디터 - String ==> Engine ; 변환기 없이 처리하기
package bitcamp.cloud.step07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bitcamp.cloud.BeanUtils;

public class Exam04 {

    public static void main(String[] args) {
        ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
                "bitcamp/cloud/step07/application-context-04.xml");
        
        System.out.println(iocContainer.getBean("c1"));
        System.out.println("=========================");
        BeanUtils.printBeanNames(iocContainer);
        
    }

}
