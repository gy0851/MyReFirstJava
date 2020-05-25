import com.ggyy0851.factory.HenWaterFactory;
import com.ggyy0851.pojo.OverCookStudent;
import com.ggyy0851.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author GeYao
 * @create 2020-05-25 - 15:57
 */
public class Main {
    public static void main(String[] args){
       /* //各种被管理的类在xml文件加载时就会被创建，而非application被调用时
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        //通过getBean方法来获取具体的类，当不指定具体类时，方法返回的是一个obj
        Student stu = ac.getBean("student",Student.class);
        Object sobj = ac.getBean("student");
        //获取当前被管理的所有类（不指明id时）
        String[] strs = ac.getBeanDefinitionNames();
        for(String s: strs){
            System.out.println(s);
        }*/
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        Student student = ac.getBean("good_student", OverCookStudent.class);
        Student student2 = ac.getBean("bad_student", OverCookStudent.class);
        Student student3 = ac.getBean("HenWater_student", HenWaterFactory.class).CreateStudent();
        System.out.println("砸钱的素质教育："+student.getLevel());
        System.out.println("放养的素质教育："+student2.getLevel());
        System.out.println("衡水学生："+student3.getLevel());
    }
}
