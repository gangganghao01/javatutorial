
package com.gangganghao.unittest.persistence.module;

import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.gangganghao.unittest.persistence.module.ModuleMapper;

/**
 * ModuleMapperTest 单元测试
 **/
@RunWith(MockitoJUnitRunner.class)
public class ModuleMapperTest {

    /**
     * Mock对象
     */
    @Mock
    private ModuleMapper moduleMapper;

    /**
     * Mock测试UpdateBatchByPrimaryKey
     */
    @Test
    public void testUpdateBatchByPrimaryKey() {
        int count = 10;
        // 定义Mock对象行为
        Mockito.when(moduleMapper.updateBatchByPrimaryKey(Mockito.anyListOf(Long.class))).thenReturn(count);
        // 准备测试数据
        List<Long> idList = Collections.<Long>emptyList();
        // 执行方法
        int updateCount = moduleMapper.updateBatchByPrimaryKey(idList);
        // 校验结果
        Assert.assertEquals(count, updateCount);
        Mockito.verify(moduleMapper, Mockito.times(1)).updateBatchByPrimaryKey(idList);
    }

}