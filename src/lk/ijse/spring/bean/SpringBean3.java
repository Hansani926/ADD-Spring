package lk.ijse.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringBean3 implements BeanNameAware, BeanFactoryAware , ApplicationContextAware, InitializingBean, DisposableBean {
    public SpringBean3(){
        System.out.println("Spring3 Bean Initilized");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Spring3 Bean name aware");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Spring3 Bean Factory Aware ");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Spring3 Application Context Aware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Spring3 Inizilaizing Bean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Spring3 Dispasable Bean ");
    }
}
