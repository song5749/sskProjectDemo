package com.ssk.spring.boot.demo.config;/**
 * @Auther: shaokun.ssk
 * @Date: 2018/12/9 21:04
 * @Description:
 */

import com.ssk.spring.boot.demo.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: shaokun.ssk
 * @Date: 2018/12/9 21:04
 * @Description: 配置类 ==配置文件
 */
@Configuration  //告诉spring 这是一个配置类
//@ComponentScan(value  = "com.ssk.spring.boot.demo",excludeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Service.class})
//})
@ComponentScan(value  = "com.ssk.spring.boot.demo",includeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})
},useDefaultFilters = false)
/**
 * ComponentScan  value 指定要扫描的包
 *   excludeFilters = Filter[] 指定扫描的时候按照一定的规则 要排除哪些组件
 *
 *    includeFilters = Filter[] 指定扫描的时候只需要包含哪些组件 useDefaultFilters 必须设置为false才可以生效
 *
 */
public class MainConfig {

    //给容器注册一个bean，类型为返回值类型，id 默认是方法名作为ID
    @Bean("person")
    public Person person01(){
        Person person = new Person("ssk",18);
        return person;
    }

}
