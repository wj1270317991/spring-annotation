package com.annotation.springannotation.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

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
@Configuration
@Import(value = {com.annotation.springannotation.bean.Color.class,MyImportSelector.class,MyImportBeanDefinitionRegistrar.class})
public class ImportConfig {
}
