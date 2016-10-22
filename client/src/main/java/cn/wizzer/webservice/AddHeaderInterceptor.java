package cn.wizzer.webservice;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.helpers.DOMUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.namespace.QName;
import java.util.List;

/**
 * Created by wsl on 2016/10/3.
 */
public class AddHeaderInterceptor extends AbstractPhaseInterceptor<SoapMessage> {

    private String userId;
    private String userPwd;

    public AddHeaderInterceptor(String userId, String userPwd) {
        super(Phase.PREPARE_SEND);
        this.userId = userId;
        this.userPwd = userPwd;
    }

    @Override
    public void handleMessage(SoapMessage soapMessage) throws Fault {
        List<Header> headers = soapMessage.getHeaders();
        //创建Document对象
        Document doc = DOMUtils.createDocument();
        Element ele = doc.createElement("authHeader");
        //配置服务器端Head信息的用户密码
        Element eleId= doc.createElement("userId");
        eleId.setTextContent(userId);
         Element elePass = doc.createElement("userPwd");
         elePass.setTextContent(userPwd);

         ele.appendChild(eleId);
         ele.appendChild(elePass);
         /**
         * 生成的XML文档
         * <authHeader>
         *      <userId>lzw</userId>
         *      <userPwd>123456</userPass>
         * </authHeader>
         */
        headers.add(new Header(new QName(""), ele));
    }
}
