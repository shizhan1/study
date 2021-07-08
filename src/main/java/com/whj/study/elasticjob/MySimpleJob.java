package com.whj.study.elasticjob;

import org.apache.shardingsphere.elasticjob.api.ShardingContext;
import org.apache.shardingsphere.elasticjob.simple.job.SimpleJob;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: whj
 * @time: 2021/7/8 17:40
 */
@Component
public class MySimpleJob implements SimpleJob {
    @Override
    public void execute(ShardingContext context) {
        switch (context.getShardingItem()) {
            case 0:
                System.out.println("simple:0");
                break;
            case 1:
                System.out.println("simple:1");
                break;
            case 2:
                System.out.println("simple:2");
                break;
            // case n: ...
        }
    }
}
