import com.baidu.conf.Config;
import com.baidu.joro.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {

    @Test
    public void Test01(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        User user = ctx.getBean("user",User.class);
        System.out.println(user.getName());
    }
}
