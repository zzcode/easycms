package com.zyd.blog.runner;

import com.zyd.blog.core.schedule.ArticleLookTask;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * 执行保存文章浏览记录任务
 *
 */
@Slf4j
@Component
public class TaskRunner implements ApplicationRunner {

    @Value("${server.port}")
    private int port;
    @Autowired
    private ArticleLookTask articleLookTask;

    @Override
    public void run(ApplicationArguments args) {
        log.info("前台访问地址：http://localhost:" + port);
        articleLookTask.save();
    }
}
