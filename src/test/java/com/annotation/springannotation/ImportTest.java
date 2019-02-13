package com.annotation.springannotation;

import com.annotation.springannotation.config.ImportConfig;
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
 *
 * @author: wangjun
 * @date: 2019/2/13.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class ImportTest {

    private ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ImportConfig.class);

    @Test
    public void test1(){
        final String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).forEach(System.out::println);
    }
}
