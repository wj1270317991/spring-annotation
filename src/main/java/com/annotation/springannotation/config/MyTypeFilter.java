package com.annotation.springannotation.config;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

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
public class MyTypeFilter implements TypeFilter{


    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        ClassMetadata classMetadata = metadataReader.getClassMetadata();

        final Resource resource = metadataReader.getResource();
        final String className = classMetadata.getClassName();
        System.out.println(">>>>>>>>>>>>>>>>"+className);
//        System.out.println("<<<<<<<<<<<<<"+resource.getFile());
        if (className.contains("er")){
            return true;
        }
        return false;
    }
}
