import com.baidu.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void Test01(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        User user = ctx.getBean("user",User.class);
        System.out.println(user.getName());
        System.out.println(user.getAge());
    }
}

