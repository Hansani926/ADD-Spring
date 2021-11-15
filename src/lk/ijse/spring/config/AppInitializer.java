package lk.ijse.spring.config;

import lk.ijse.spring.bean.DBConnection;
import lk.ijse.spring.bean.SpringBean;
import lk.ijse.spring.bean.SpringBean2;
import lk.ijse.spring.bean.SpringBean4;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[]args){
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();//containar ek haduwa

      /*  //how to run a hooking prossess on java
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("System is about to shut down");
                ctx.close();
            }
        }));*/

        //how to do it in spring
      ctx.registerShutdownHook();


        ctx.register(Appconfig.class);//configaration class ek registor kra
        ctx.refresh();//context ek refresh  kra

    /* 1 step) SpringBean bean =  ctx.getBean(SpringBean.class);*///@Component object ekk hdla container ekt dagen thynne eke hden object ek gnne meken
       //2 step)
        /*SpringBean bean1 =  ctx.getBean(SpringBean.class);
        SpringBean bean2 =  ctx.getBean(SpringBean.class);
        System.out.println(bean1);
        System.out.println(bean2);*/


      /*  SpringBean springBean =(SpringBean) ctx.getBean("springBean");//id ekk eya identify kragen inne e id ek gnnnm cl
        //class name ek arn first letter ek simple krnn ona
        System.out.println(springBean);*/
       /* SpringBean springBean1 =(SpringBean) ctx.getBean("a");
        SpringBean2 springBean2 =(SpringBean2) ctx.getBean("springBean2");
        System.out.println(springBean1);
       System.out.println(springBean2);*/



        /* 1 step)bean.test();*/
        /*ctx.close();//close the context*/
       /* System.out.println("L"+springBean2);*/

      /*  DBConnection dbConnection =(DBConnection) ctx.getBean("dbConnection");
        System.out.println(dbConnection);*/

        SpringBean4 sb1 =ctx.getBean(SpringBean4.class);
        System.out.println(sb1);
    }
}
//1)ctx ek hdunt passe api mulin krnne configration class ek register krn ek
//2)configeration class ekk kiynne configeration class walin thmi oy bean ekk container
// ekt wtennena ona kohomda kiyla  define kll thyna thana
//3)

