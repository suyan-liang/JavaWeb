import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import javax.print.Doc;
import java.util.List;

/**
 * Author:liang;
 * Date:2020/3/24;
 * Time:14:48;
 * Package Name:PACKAGE_NAME;
 * 需求：
 * 步骤：
 */
public class _2Dom4j {

    /**
     * Dom4j的解析
     * 把XML文档解析成一个document对象
     * 步骤
     * 1.创建SAXReader输入流
     * 2.读取到Document对象
     */
    @Test
    public void test_01() throws DocumentException {
        SAXReader saxReader=new SAXReader();
        //在jUnit的测试下，相对路径从模块名开始算
        Document doc=saxReader.read("src\\_1books.xml");
        System.out.println(doc);
    }

    /**
     * 把xml中的数据封装到对应的结果类中
     * 1.   读取document对象
     * 2.   通过document对象获取根元素
     * 3.   利用根元素的elements方法得到子元素list
     * 4.   利用子元素的elementText方法以及attributeValue获取每一个属性值  注意text全是string类型，类型不一致要进行转换
     * 5.   再封装到类中即可
     */
    @Test
    public void test_02() throws Exception{
        SAXReader saxReader=new SAXReader();
        Document document=saxReader.read("src//_1books.xml");
        Element root=document.getRootElement();
        List<Element> list = root.elements();
        for (Element element : list) {
            String name=element.elementText("name");
            String id=element.attributeValue("id");
            double price=Double.parseDouble(element.elementText("price"));
            System.out.println(new Books(id,name,price));
        }

    }
}

