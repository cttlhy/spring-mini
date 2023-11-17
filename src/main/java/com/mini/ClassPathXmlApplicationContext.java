package com.mini;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
public class ClassPathXmlApplicationContext {

    private List<BeanDefinition> beanDefinitions = new ArrayList<>();
    private Map<String, Object> singletons = new HashMap<>();

    public ClassPathXmlApplicationContext(String fileName) throws Exception {
        // 读取配置文件
        this.readXml(fileName);
    }

    private void readXml(String fileName) {
        // TODO 读取配置文件

    }
}
