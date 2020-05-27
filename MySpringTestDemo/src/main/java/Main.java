import com.ggyy0851.dosomething.GoClass;
import com.ggyy0851.pojo.Student;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * @author GeYao
 * @create 2020-05-25 - 15:57
 */
public class Main {
    public static void main(String[] args){
        //当不使用web容器时可以用ApplicationContext来获取上下文，来得到相应的Bean,这样做需要手动指定xml配置文件
        //使用web容器后则可以使用webApplicationContext来获得想要的上下文容器，这样做将由tomcat等容器自动去装载spring配置文件，具体设置在web.xml中
        //通过监听器(spring自带的web相应的包)来帮助tomcat得知spring的存在，并指定xml进行装载
        /*即ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        也可用ApplicationContext ac = WebApplicationContextUtils.getRequiredWebApplicationContext(ServletContext sc);
        //需要传入一个ServletContext*/
        //通过IoC的方式将各种bean交给Spring进行加载和新建，而用户只需要通过applicationContext来获取相应的beanid
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
        //测试通过工厂模式获取各类bean
        /*ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        Student student = ac.getBean("good_student", OverCookStudent.class);
        Student student2 = ac.getBean("bad_student", OverCookStudent.class);
        Student student3 = ac.getBean("HenWater_student", HenWaterFactory.class).CreateStudent();
        System.out.println("砸钱的素质教育："+student.getLevel());
        System.out.println("放养的素质教育："+student2.getLevel());
        System.out.println("衡水学生："+student3.getLevel());*/
        //直接获取bean并通过注入属性
        /*ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        Student student4 = ac.getBean("normal_student",Student.class);
        System.out.print(student4.toString());
        System.out.print("sdf");
        String[] sts = ac.getBeanDefinitionNames();
        for(String str:sts){
            System.out.println(str);
        }*/
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        GoClass gc = ac.getBean("gc", GoClass.class);
        gc.setScore("123");
        gc.gotoClass("sdf");
        gc.listen();
        gc.sleep();

    }
}
