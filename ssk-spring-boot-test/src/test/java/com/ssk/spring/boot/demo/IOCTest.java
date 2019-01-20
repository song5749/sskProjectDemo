package com.ssk.spring.boot.demo;/**
 * @Auther: shaokun.ssk
 * @Date: 2018/12/9 21:34
 * @Description:
 */

import com.ssk.spring.boot.demo.config.MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther: shaokun.ssk
 * @Date: 2018/12/9 21:34
 * @Description:
 */
public class IOCTest {

    @Test
    public void test(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

    }
}
