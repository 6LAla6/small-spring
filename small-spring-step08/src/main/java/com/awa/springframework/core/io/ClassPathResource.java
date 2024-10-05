package com.awa.springframework.core.io;

import cn.hutool.core.lang.Assert;
import com.awa.springframework.util.ClassUtils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: awa
 * @Description: TODO 通过ClassLoader获取ClassPath下文件信息:
 * @Description: TODO classLoader.getResourceAsStream(path)
 * @DateTime: 2024/9/26 19:17
 **/
public class ClassPathResource implements Resource {

    private final String path;
    private ClassLoader classLoader;

    public ClassPathResource(String path) {
        this(path, (ClassLoader) null);
    }

    public ClassPathResource(String path, ClassLoader classLoader) {
        Assert.notNull(path, "path must not be null");
        this.path = path;
        this.classLoader = (null != classLoader ? classLoader : ClassUtils.getDefaultClassLoader());
    }

    @Override
    public InputStream getInputStream() throws IOException {
        InputStream inputStream = classLoader.getResourceAsStream(path);
        if (null == inputStream) {
            throw new FileNotFoundException(
                    this.path + "cannot be opened because it does not exists"
            );
        }
        return inputStream;
    }

}
