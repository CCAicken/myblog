package com.example.myblog;

import com.example.myblog.entity.TForum;
import com.example.myblog.util.arrayTools;
import com.example.myblog.util.objtools;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StringUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Map;

@SpringBootTest
class MyblogApplicationTests {

    @Test
    void contextLoads() throws IllegalAccessException {
        TForum tf=   new TForum();
        tf.setHtmltext("6666");

        System.out.println(objtools.objIsNull(tf, new String[]{"title", "userid", "mdtext","forumtype","forumdescribe","htmltext"}));


    }
}
