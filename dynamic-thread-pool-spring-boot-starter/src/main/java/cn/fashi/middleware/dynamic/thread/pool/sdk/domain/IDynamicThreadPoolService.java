package cn.fashi.middleware.dynamic.thread.pool.sdk.domain;

import cn.fashi.middleware.dynamic.thread.pool.sdk.domain.model.entity.ThreadPoolConfigEntity;

import java.util.List;

/**
 * @Author: fashi
 * @CreateTime: 2025-02-08
 * @Description:
 * @Version: 1.0
 */

public interface IDynamicThreadPoolService {

    List<ThreadPoolConfigEntity> queryThreadPoolList();

    ThreadPoolConfigEntity queryThreadPoolConfigByName(String threadPoolName);

    void updateThreadPoolConfig(ThreadPoolConfigEntity threadPoolConfigEntity);
}
