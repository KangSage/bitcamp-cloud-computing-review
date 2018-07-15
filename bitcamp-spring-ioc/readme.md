# Spring IoC 컨테이너 사용법

## step01. Spring IoC 컨테이너 사용

### 스프링 IoC 컨테이너는 ApplicationContext를 구현한다.

#### ApplicationContext 구현체 종류

##### 1) XML 파일에 작성된 설정 정보를 읽어서 처리하는 IoC 컨테이너
  - ClassPathXmlApplicationContext (자바 classpath에서 xml 파일을 찾는다)
    - 자바 classpath에서 해당 경로의 XML 파일을 찾는다.
    - 물론 XML 파일은 스프링 규칙에 따라 태그가 작성되어 있다.
    - 설정 파일에 지정된 객체를 자동으로 생성하고 의존 객체를 주입하여 보관한다.
    
    ```
    ApplicationContext iocContainer = 
        new ClassPathXmlApplicationContext(
            "bitcamp/cloud/step01/application-context.xml");
    ```

  - FileSystemXmlApplicationContext (OS 파일시스템에서 xml 파일을 찾는다)
    - OS 파일시스템에서 지정된 경로의 파일을 찾는다.
    - 파일시스템의 실제 경로를 지정하게 되면 나중에 그 경로가 바뀌면 또 소스 코드를 변경해야 하는 문제가 있다.<br/>
             그래서 보통 ClassPathXmlApplicationContext를 많이 사용한다.
    
    ```
    ApplicationContext iocContainer = 
        new FileSystemXmlApplicationContext(
            "C:\\Users\\SH KANG\\git\\bitcamp-cloud-computing-review"
                + "\\bitcamp-spring-ioc\\src\\main\\java\\bitcamp\\cloud"
                + "\\step01\\application-context.xml");
    ```
      
##### 2) 클래스 안에 작성된 애노테이션을 읽어서 처리하는 IoC 컨테이너
  - AnnotationConfigApplicationContext
    - 스프링 설정정보를 담고 있는 클래스 정보를 넘긴다.
    
    ```
    ApplicationContext iocContainer = 
        new AnnotationConfigApplicationContext(AppConfig.class);
    ```
    - AppConfig.java 코드
    ```
    package bitcamp.cloud.step01;

    import org.springframework.context.annotation.Bean;

    // AnnotationConfigApplicationContext 에서 사용할 
    // 스프링 설정 정보를 제공하는 클래스이다.

    public class AppConfig {
    
        // IoC 컨테이너는 @Bean으로 지정된 메서드를 호출하여 
        // 그 리턴 값을 보관한다.
        @Bean("c1") public Car getCar() {
            Car c = new Car();
            c.setModel("소나타");
            c.setMaker("비트자동차");
            c.setCc(1980);
            return c;
        }
    }
    ```

## step02. 객체 생성


