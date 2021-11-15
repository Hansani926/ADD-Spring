package lk.ijse.spring.bean;

import org.springframework.stereotype.Component;



@Component("a")
public class SpringBean {
   public SpringBean(){
       System.out.println("Spring Bean 1 Instantiated");
   }

   public  void test(){
       System.out.println("Method Test 1 Invoked");
   }
}
//annotaion driven approoach ekt hdapu pojo ekk
//di,loose coupling okkom krnne me bean ek haraha,sampurna prosses ek krnne
//bean akara 2 k thye 1)Xml,2)annotation walin kiynn puluwan
//@Component dnnm one ek dmmoth thmi sprinbean ekk nththm pojo ekk kiyl aeye dnne