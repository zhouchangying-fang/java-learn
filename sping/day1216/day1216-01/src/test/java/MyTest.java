import com.baidu.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void Test01(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = (UserService) ctx.getBean("user");
        userService.add();
    }

}
