package com.example.mybatisplusdemo.common.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * 希望读取application.properties的方法三 - 配置三
 * 通过 ConfigurationPropertiesScan 获取，然后通过 context读取配置类相应的数值
 *
 * 未实现，通过在ConfigurationPropertiesScan内填入具体路径，扫描文件获取数值
 * 参考文章：https://www.cnblogs.com/lql6/p/11792483.html
 */
//@Configuration
//@ConfigurationPropertiesScan("classpath:config/application.properties")需要恢复
public class Config1 {
//    @Bean需要恢复
//    @ConfigurationProperties(prefix = "myconfig") 需要恢复
//    public LocalConfig1 dp(){需要恢复
//        return new LocalConfig1();
//    }
}
