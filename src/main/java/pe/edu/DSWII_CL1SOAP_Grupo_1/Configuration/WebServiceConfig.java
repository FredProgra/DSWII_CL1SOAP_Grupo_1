package pe.edu.DSWII_CL1SOAP_Grupo_1.Configuration;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;
@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {

    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet
            (ApplicationContext applicationContext){
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }



    @Bean(name = "autores")
    public DefaultWsdl11Definition autorWsdl11Definition(XsdSchema autorSchema){
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("AutoresPort");
        wsdl11Definition.setLocationUri("/ws/autores");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(autorSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema autorSchema(){
        return new SimpleXsdSchema(new ClassPathResource("xsd/Autor.xsd"));
    }
    @Bean(name = "estacionamientos")
    public DefaultWsdl11Definition estacionamientoWsdl11Definition(XsdSchema estacionamientoSchema){
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("EstacionamientosPort");
        wsdl11Definition.setLocationUri("/ws/estacionamientos");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(estacionamientoSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema estacionamientoSchema(){
        return new SimpleXsdSchema(new ClassPathResource("xsd/Estacionamiento.xsd"));
    }
}