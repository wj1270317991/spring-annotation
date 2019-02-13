package com.annotation.springannotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

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
@ComponentScan(value = "com.annotation.springannotation",
        includeFilters={
        //@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class),
        @ComponentScan.Filter(type = FilterType.CUSTOM,classes = MyTypeFilter.class)
        },
        useDefaultFilters = false
        )
@Configuration
public class MainConfig {

}
