package lk.ijse.spring.config;

import lk.ijse.spring.bean.DBConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring")
public class Appconfig {

    //another way of spacifying a bean to the container
    //generate bean id from bean method name
    //we can change id as we want by passing a value to bean annotation

    @Bean
    public DBConnection dbConnection(){
        return  new DBConnection();
    }
}
//Spring application ekkt ek configuration class ekk hri thyennm ona