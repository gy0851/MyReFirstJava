import com.ggyy0851.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author GeYao
 * @create 2020-05-25 - 15:57
 */
public class Main {
    public static void main(String[] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        //该类在xml文件加载时就会被创建，而非application被调用时
        Student stu = ac.getBean("student",Student.class);
    }
}
