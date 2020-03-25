import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Author:liang;
 * Date:2020/3/25;
 * Time:8:08;
 * Package Name:PACKAGE_NAME;
 * 需求：
 * 步骤：
 */
public class HelloServlet2  extends HttpServlet {
    /**
     * 看Servlet/Servlet_System.png
     * 是Generic中的ServletConfig起作用
     * HttpServlet继承于Generic，初始化的时候必须调用父类的初始化方法进行初始化
     * @param config
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig config) throws ServletException {
        //这里一定要加上super.init(config) 否则会出现空指针异常
        super.init(config);
        System.out.println("HelloServlet2 重写的init方法");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("hello2 的doGet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("hello2 的doPost");
    }

}
