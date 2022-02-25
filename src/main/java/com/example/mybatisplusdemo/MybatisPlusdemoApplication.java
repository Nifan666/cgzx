package com.example.mybatisplusdemo;

import com.example.mybatisplusdemo.common.configuration.LocalConfig;
import com.example.mybatisplusdemo.common.configuration.LocalConfig1;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)//排除自动配置

@MapperScan("com.example.mybatisplusdemo.mapper")
public class MybatisPlusdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusdemoApplication.class, args);
//        ConfigurableApplicationContext context =  SpringApplication.run(MybatisPlusdemoApplication.class, args);
//        getConfigValueMethod1(context);
//        getConfigValueMethod31(context);
//        getConfigValueMethod32(context);
    }

    /**
     * 希望读取application.properties的方法一
     * 通过Enviroment 获取
     *
     * 参考文章：https://www.cnblogs.com/lql6/p/11792483.html
     * @param context
     */
    public static void getConfigValueMethod1(ConfigurableApplicationContext context ){
        ConfigurableEnvironment environment = context.getEnvironment();
        String ip = environment.getProperty("local.ip.addr");
        System.out.println(ip);
    }

    /**
     * 希望读取application.properties的方法三 - 配置一
     * 通过 ConfigurationProperties 获取，然后通过 context读取配置类相应的数值
     *
     * 参考文章：https://www.cnblogs.com/lql6/p/11792483.html
     * @param context
     */
    public static void getConfigValueMethod31(ConfigurableApplicationContext context ){
        LocalConfig localConfig = context.getBean(LocalConfig.class);
        System.out.println(localConfig);
    }


    /**
     * 希望读取application.properties的方法三 - 配置二
     * 通过 ConfigurationProperties 获取，然后通过 context读取配置类相应的数值
     *
     *  需要在 @Configuration注解修饰的类中汇总，然后读取
     * 参考文章：https://www.cnblogs.com/lql6/p/11792483.html
     * @param context
     */
    public static void getConfigValueMethod32(ConfigurableApplicationContext context ){
        LocalConfig1 localConfig = context.getBean(LocalConfig1.class);
        System.out.println(localConfig);
    }

}
