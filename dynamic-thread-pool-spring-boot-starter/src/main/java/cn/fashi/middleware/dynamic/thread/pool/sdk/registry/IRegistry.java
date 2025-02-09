package cn.fashi.middleware.dynamic.thread.pool.sdk.registry;

import cn.fashi.middleware.dynamic.thread.pool.sdk.domain.model.entity.ThreadPoolConfigEntity;

import java.util.List;

/**
 * @Author: fashi
 * @CreateTime: 2025-02-08
 * @Description: 注册中心接口
 * @Version: 1.0
 */

public interface IRegistry {

    // 报告线程池列表
    void reportThreadPool(List<ThreadPoolConfigEntity> threadPoolEntities);

    // 报告线程池参数
    void reportThreadPoolConfigParameter(ThreadPoolConfigEntity threadPoolConfigEntity);

}
