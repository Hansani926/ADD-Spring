package lk.ijse.spring.bean;

import org.springframework.stereotype.Component;


@Component
public class SpringBean2 {
   public SpringBean2(){
       System.out.println("Spring Bean 2 Instantiated");
   }

   public  void test(){
       System.out.println("Method Test 2 Invoked");
   }
}
//annotaion driven approoach ekt hdapu pojo ekk
//di,loose coupling okkom krnne me bean ek haraha,sampurna prosses ek krnne
//bean akara 2 k thye 1)Xml,2)annotation walin kiynn puluwan
