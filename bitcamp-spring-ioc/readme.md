# Spring IoC 컨테이너 사용법

## step01 Spring IoC 컨테이너 기본 사용
### 스프링 IoC 컨테이너는 ApplicationContext를 구현한다.

#### ApplicationContext 구현체 종류
 > 1) XML 파일에 작성된 설정 정보를 읽어서 처리하는 IoC 컨테이너
     1-1) ClassPathXmlApplicationContext (자바 classpath에서 xml 파일을 찾는다)
     1-2) FileSystemXmlApplicationContext (OS 파일시스템에서 xml 파일을 찾는다)
 > 2) 클래스 안에 작성된 애노테이션을 읽어서 처리하는 IoC 컨테이너
     => AnnotationConfigApplicationContext
     
- ClassPathXmlApplicationContext 사용
  => 자바 classpath에서 해당 경로의 XML 파일을 찾는다.
  => 물론 XML 파일은 스프링 규칙에 따라 태그가 작성되어 있다.
  => 설정 파일에 지정된 객체를 자동으로 생성하고 의존 객체를 주입하여 보관한다.

- FileSystemXmlApplicationContext 사용
  => OS 파일시스템에서 지정된 경로의 파일을 찾는다.
  => 파일시스템의 실제 경로를 지정하게 되면 나중에 그 경로가 바뀌면 
     또 소스 코드를 변경해야 하는 문제가 있다. 
     그래서 보통 ClassPathXmlApplicationContext를 많이 사용한다.

- AnnotationConfigApplicationContext 사용
  => 스프링 설정정보를 담고 있는 클래스 정보를 넘긴다.