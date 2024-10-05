package com.awa.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: awa
 * @Description: TODO 获取输入流
 * @DateTime: 2024/9/26 19:14
 **/
public interface Resource {

    InputStream getInputStream() throws IOException;

}
