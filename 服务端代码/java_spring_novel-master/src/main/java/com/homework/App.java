package com.homework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.net.UnknownHostException;

@SpringBootApplication
@EnableSwagger2
@EnableJpaAuditing
public class App {
    public static void main(String[] args) throws UnknownHostException {
        Logger log = LoggerFactory.getLogger(App.class);
        ConfigurableApplicationContext applicationContext = SpringApplication.run(App.class, args);
        ConfigurableEnvironment env = applicationContext.getEnvironment();
        log.info("\n\n====== \033[31;4m 关注微信公众号: \033[40;32;4m【ITSource每日分享】,一万个IT资源等你发现：项目源码，软件工具，面试面经，学习视频 应有尽有！！！\033[0m ==========================================\n\t" +
                        "\033[31;4m点击下方链接扫码关注 \033[0m: https://mmbiz.qpic.cn/sz_mmbiz_jpg/JfvqwvA8e1vfT6fJAGV0hibeQY1Sia4iaCZ6iaicDl1joUxPsicXoiaeyWuAl8Vhmfiah9j0bjNYVuske8G3ZGopia92RyQ/640 \n" +
                        "=============================================================================================================================================================\n" +
                        "应用程序启动成功! 点击下方链接开始体验吧~:\n\t" +
                        "后端本机地址(该地址不可直接访问,需启动前端项目): \thttp://127.0.0.1:{}\n\t" +
                        "===============================================================================================================================================================\n",
                env.getProperty("server.port")
        );
    }
}
