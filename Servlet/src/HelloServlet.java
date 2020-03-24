import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

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
