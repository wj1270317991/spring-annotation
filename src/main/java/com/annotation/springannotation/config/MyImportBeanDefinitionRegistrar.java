package com.annotation.springannotation.config;

import com.annotation.springannotation.bean.Yellow;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * com.annotation.springannotation.config
 * <strong>描述：</strong>
 * <strong>功能：</strong>
 * <strong>使用场景：</strong>
 * <strong>注意事项：</strong>
 *
 * @author: wangjun
 * @date: 2019/2/13.
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {


    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        //添加bean
        //String beanName, BeanDefinition beanDefinition
        String beanName = "yellow";
        BeanDefinition beanDefinition = new RootBeanDefinition(Yellow.class);
        registry.registerBeanDefinition(beanName,beanDefinition);
        //删除bean
        registry.removeBeanDefinition("com.annotation.springannotation.bean.Color");

    }
}
