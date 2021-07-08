package com.whj.study.elasticjob;

import org.apache.shardingsphere.elasticjob.api.ShardingContext;
import org.apache.shardingsphere.elasticjob.dataflow.job.DataflowJob;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: whj
 * @time: 2021/7/8 17:43
 */
@Component
public class MyDataflowJob  implements DataflowJob<String> {

    @Override
    public List<String> fetchData(final ShardingContext shardingContext) {
        // fetch data
        List<String> list = new ArrayList<>();
        list.add("data1");
        list.add("data2");
        list.add("data3");
        list.add("data4");
        System.out.println("fetch data");
        return list;
    }

    @Override
    public void processData(final ShardingContext shardingContext, final List<String> data) {
        System.out.println("process data");
    }
}
