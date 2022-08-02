package org.cds

/**
 * 此类表示一个实体查询表单
 * @property filters 过滤器
 * @property sorters 排序设置
 * @property offset 数据偏移量
 * @property limit 限制结果行数
 * @constructor
 */
data class EntityQueryForm(

    val offset: Int,
    val limit: Int,
    val filters: List<Filter> = emptyList(),
    val sorters: List<Sorter> = emptyList()
)

data class Filter(val property: String, val operator: String, val value: Any)
data class Sorter(val property: String, val direction: String = "asc")
