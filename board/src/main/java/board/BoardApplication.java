package board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration;

@SpringBootApplication(exclude={MultipartAutoConfiguration.class})
public class BoardApplication {
//exclude를 이용하여 첨부파일 관련된 자동 구성을 사용하지 않도록 할 수 있다.
	public static void main(String[] args) {
		SpringApplication.run(BoardApplication.class, args);
	}

}
