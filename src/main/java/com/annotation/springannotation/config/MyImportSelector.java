package com.annotation.springannotation.config;

import com.annotation.springannotation.bean.Black;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.ArrayList;
import java.util.List;

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
public class MyImportSelector implements ImportSelector {



    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        final String className = importingClassMetadata.getClassName();
        System.out.println("~~~~~~~~~~~"+ className);
        List<String> list = new ArrayList<>();
        list.add("com.annotation.springannotation.bean.Black");
        list.add("com.annotation.springannotation.bean.White");
        String[] strings = new String[list.size()];
        list.toArray(strings);
        return strings;
    }
}
