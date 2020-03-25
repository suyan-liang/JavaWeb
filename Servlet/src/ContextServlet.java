import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Author:liang;
 * Date:2020/3/25;
 * Time:10:04;
 * Package Name:${PACKAGE_NAME};
 * 需求：
 * 步骤：
 *
 *
 * 在doGet方法中测试ServletContext的三个作用
 * 1.获取web.xml配置的工程的context-param
 *
 *
 */
public class ContextServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext=getServletConfig().getServletContext();
        /*
         * 一个注意事项就是ServletContext只能获取context-param不能获取init-param
         * ServletConfig只能获取init-param不能获取context-param
         *
         */
        System.out.println("================获取参数测试");
        String name=servletContext.getInitParameter("name");
        String time=servletContext.getInitParameter("time");
        System.out.println("ContextServlet doGet");
        System.out.println(name);
        System.out.println(time);
        System.out.println("================获取工程路径测试");
        String propath=servletContext.getContextPath();
        System.out.println(propath);
        System.out.println("================获取硬盘上绝对路径测试");

        /*
         * 其实这个getRealPath是确定参数中路径在磁盘上部署位置的绝对路径
         * 可以看做获取绝对路径的一个工具
         * 传入/lib时
         * C:\Users\liang\IdeaProjects\JavaWeb\out\artifacts\Servlet_war_exploded\lib
         *
         * /代表工程路径，对应的是idea中的web目录下
         *
         *
         */
        String realpath=servletContext.getRealPath("/");
        System.out.println(realpath);

        servletContext.setAttribute("key1","value1");
        servletContext.setAttribute("key2","value2");
        System.out.println(servletContext.getAttribute("key2"));
    }
}
