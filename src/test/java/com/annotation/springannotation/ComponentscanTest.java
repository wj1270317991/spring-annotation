package com.annotation.springannotation;

import com.annotation.springannotation.config.MainConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

/**
 * com.annotation.springannotation
 * <strong>描述：</strong>
 * <strong>功能：</strong>
 * <strong>使用场景：</strong>
 * <strong>注意事项：</strong>
 * 扫描测试
 * @author: wangjun
 * @date: 2019/2/13.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ComponentscanTest {

    @Test
    public void test1(){
        //@Configuration
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        System.out.println("---------------------------------");
        System.out.println(Arrays.asList(beanDefinitionNames));
    }

    @Test
    public void test2(){
        //@ComponentScan
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        System.out.println("---------------------------------");
        for (int i=0;i<beanDefinitionNames.length;i++){
            System.out.println("--------->"+ beanDefinitionNames[i]);
        }
    }

}
