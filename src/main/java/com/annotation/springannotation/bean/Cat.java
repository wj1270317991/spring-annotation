package com.annotation.springannotation.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * com.annotation.springannotation.bean
 * <strong>描述：</strong>
 * <strong>功能：</strong>
 * <strong>使用场景：</strong>
 * <strong>注意事项：</strong>
 *
 * @author: wangjun
 * @date: 2019/2/13.
 */

@Component
public class Cat implements InitializingBean,DisposableBean{


    @Override
    public void destroy() throws Exception {
        System.out.println("cat destroy ....");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("cat afterPropertiesSet ...");
    }
}
