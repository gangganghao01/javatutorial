package com.gangganghao.unittest.persistence.module;

import java.util.Collection;

/**
 * ModuleMapper
 **/
public interface ModuleMapper {

    /**
     * 根据主键批量更新
     *
     * @param keyList 主键 id 集合
     *
     * @return 更新条数
     */
    int updateBatchByPrimaryKey(Collection<Long> keyList);
}
