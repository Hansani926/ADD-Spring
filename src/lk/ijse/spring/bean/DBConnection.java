package lk.ijse.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class DBConnection implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public DBConnection(){
        System.out.println("DBConnection Instantiate");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println(" DBConnection Bean name aware");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("DBConnection Bean Factory Aware ");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("DBConnection Application Context Aware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("DBConnection Inizilaizing Bean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DBConnection Dispasable Bean ");
    }

}
