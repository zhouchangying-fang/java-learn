import com.baidu.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void Test01(){
        ApplicationContext ctx = new  ClassPathXmlApplicationContext("bean.xml");
        Person person = ctx.getBean("person",Person.class);
        person.getCat().Call();
        person.getDog().Call();
    }
}
