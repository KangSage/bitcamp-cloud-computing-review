package bitcamp.cloud.step13.ex2;

import org.springframework.stereotype.Component;

@Component
public class Y {
    public Y() {
        System.out.println("Y 객체 생성됨");
    }
    
    public void m() {
        System.out.println("Y.m()");
    }
}
