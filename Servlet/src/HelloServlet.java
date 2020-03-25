import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Author:liang;
 * Date:2020/3/24;
 * Time:19:44;
 * Package Name:PACKAGE_NAME;
 * 需求：
 * 步骤：
 */
public class HelloServlet implements Servlet {
    public HelloServlet() {
        System.out.println("1.构造器方法");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("2.init方法");

        //1.    获取类的别名
        System.out.println("类的别名:"+servletConfig.getServletName());

        //2.    获取web.xml中的初始参数
        String username=servletConfig.getInitParameter("username");
        String password=servletConfig.getInitParameter("password");
        System.out.println("初始参数 username="+username+"...password="+password);

        //3.    获取ServletContext对象
        ServletContext servletContext = servletConfig.getServletContext();
        System.out.println(servletContext);
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 实现service方法，处理请求并进行响应
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("3.service==这是我给你的响应");
        HttpServletRequest hsr= (HttpServletRequest) servletRequest;
        String method=hsr.getMethod();
        if (method.equals("GET")){
            doGet();
        }
        else
        {
            doPost();
        }

    }
    public void doGet(){
        System.out.println("get");
        System.out.println("get");
        System.out.println("get");
    }
    public void doPost(){
        System.out.println("post");
        System.out.println("post");
        System.out.println("post");
    }
    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("4.destroy 销毁");
    }
}
