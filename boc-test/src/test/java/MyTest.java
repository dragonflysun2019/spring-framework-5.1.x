import com.boc.spring.A;
import com.boc.spring.AppConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
	@Test
	public void test1(){
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(AppConfig.class);
		//ac.scan("com.boc.spring");
		ac.refresh();
		ac.getBean(A.class);
	}
}
