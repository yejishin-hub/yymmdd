package hello.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 이 클래스가 위치한 패키지 (hello.hellospring) 하위에 작성된 컴포넌트에 대해서만 컴포넌트 스캔함
// 스프링은 스프링 컨테이너에 스프링 빈 등록 시, 기본적으로 싱글톤으로 등록함
@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}

}
