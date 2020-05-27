/**
 * @author GeYao
 * @create 2020-05-27 - 11:04
 */
import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@WebServlet("/validcode")
public class ValidCode extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        //应当去实现super里头的方法而不是继承他，否则会出错
        //super.service(req, res);

        //图片类，指定了一张图片的长宽高和颜色类型，作为底色图
        BufferedImage image = new BufferedImage(200,100, BufferedImage.TYPE_INT_RGB);
        //2d画板类，可通过画板绘制的方式对图片进行绘制
        Graphics2D g = image.createGraphics();
        //填充一个矩形
        g.setColor(Color.white);
        g.fillRect(0,5,200,90);
        //往里面随机写字，目的在于获取一串随机字符。
        List<Integer> random = new ArrayList<Integer>();
        Random r = new Random();
        for(int i = 0 ; i < 4 ; i++){
            random.add(r.nextInt(10));
        }
        //设置颜色数组，以备随机调用不同颜色的字符
        Color[] colors = new Color[]{Color.gray,Color.black,Color.BLUE,Color.green,Color.CYAN,Color.red,Color.yellow};
        g.setFont(new Font("宋体", Font.BOLD| Font.ITALIC,40));
        for(int i = 0 ; i < random.size() ; i++) {
            g.setColor(colors[r.nextInt(5)]);
            g.drawString(random.get(i).toString(), i*50, r.nextInt(41)+30);
        }
        //输出若干条直线模拟干扰
        for(int i = 0 ; i <= 4 ; i ++) {
            g.setColor(colors[r.nextInt(8)]);
            int x1 = r.nextInt(200);
            int y1 = r.nextInt(100);
            int x2 = r.nextInt(200);
            int y2 = r.nextInt(100);
            g.drawLine(x1, y1, x2, y2);
        }
        //将

        //输出流，输出到页面上
        ServletOutputStream out = res.getOutputStream();
        //图片工具类
        ImageIO.write(image,"JPG",out);
        //随便丢个图片并通过字节流去传输，验证通过servlet来传输图片和jsp直接src指向图片的效果是一样的，都是通过输出流来获得数据
        /*ServletOutputStream os = res.getOutputStream();
        InputStream in = new FileInputStream(new File(getServletContext().getRealPath("images"),"321.png"));
        int index = -1;
        while((index=in.read())!=-1) {
            os.write(index);
        }*/
    }

}
