package org.cds


/**
 * 表示一个表格列
 * @property type 列的类型.
 * @property title 列标题
 * @property valueField 值字段
 * @constructor
 */
data class DataGridColumn(
    val type: String = "text",
    val title: String,
    val valueField: String,

    )

data class DataGrid(
    val columns: List<DataGridColumn>
)
