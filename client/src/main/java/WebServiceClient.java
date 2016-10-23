import cn.wizzer.webservice.AddHeaderInterceptor;
import cn.wizzer.webservice.HelloWordImplPortType;
/*import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.frontend.ClientProxyFactoryBean;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;*/

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Created by wsl on 2016/10/2.
 */
public class WebServiceClient {
    public static void main(String[] args) throws Exception {

        /*JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        org.apache.cxf.endpoint.WebServiceClient client = dcf.createClient("http://localhost:9090/nutzwk/service/helloWordImpl?wsdl");
        Object[] objects = client.invoke("sayHello", "test");
        System.out.println(objects[0].toString());*/

        long s = new Date().getTime();
        /*String address = "http://localhost:9090/nutzwk/service/helloWordImpl"; //此处最好用系统参数
        JaxWsProxyFactoryBean bean = new JaxWsProxyFactoryBean();
        bean.setAddress(address);
        bean.setServiceClass(HelloWordImplPortType.class);
        HelloWordImplPortType ws = (HelloWordImplPortType) bean.create();
        String rrr = ws.sayHello("Sfaf");*/


       /* HelloWordImpl factory = new HelloWordImpl();
        HelloWordImplPortType helloWordImplPortType = factory.getHelloWordImplPort();
        helloWordImplPortType.sayHello("Wrwrwr");*/


      /*  ClientProxyFactoryBean factory = new ClientProxyFactoryBean();

        factory.setServiceClass(HelloWordImplPortType.class);
        factory.setAddress("http://localhost:9090/nutzwk/service/helloWordImpl");

        // factory.getServiceFactory().setDataBinding(new AegisDatabinding());
        HelloWordImplPortType helloWordImplPortType = (HelloWordImplPortType) factory.create();
        Client client = ClientProxy.getClient(helloWordImplPortType);
        client.getOutInterceptors().add(new AddHeaderInterceptor("lzw", "123456"));
        client.getInInterceptors().add(new LoggingInInterceptor()); // 添加客户端in log拦截器
        client.getOutInterceptors().add(new LoggingOutInterceptor()); // 添加客户端out log拦截器


        String sfs = helloWordImplPortType.sayHello("Sfsf");

        long s1 = new Date().getTime();
        System.out.println(s1 - s);*/




        ///test001fdgdsgegfdsgfsg

        ///sfs/f/sfsfs/s/f/sf/s/




    }
}
