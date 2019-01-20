package com.ssk.spring.boot.demo;/**
 * @Auther: shaokun.ssk
 * @Date: 2018/12/9 20:52
 * @Description:
 */

import com.ssk.spring.boot.demo.bean.Person;
import com.ssk.spring.boot.demo.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: shaokun.ssk
 * @Date: 2018/12/9 20:52
 * @Description:
 */
public class MainTest {

    public static void main(String[] args) {
//        ApplicationContext applicationContext = new  ClassPathXmlApplicationContext("bean.xml");
//
//       Person person = (Person) applicationContext.getBean("person");
//
//        System.out.println(person);
        /*************已经是配置文件的方式************/


       ApplicationContext applicationContext =  new  AnnotationConfigApplicationContext(MainConfig.class);
       Person person = applicationContext.getBean(Person.class);

        System.out.println(person.toString());

        String[] names = applicationContext.getBeanNamesForType(Person.class);
        for (String name : names) {
            System.out.println(name);
        }
    }
}
