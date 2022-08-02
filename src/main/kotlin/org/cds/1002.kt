package org.cds


interface CDSForm {


}

/**
 * 表示一个表单项
 * @property type 表单项的类型
 * @property readonly 此表单项是否是只读的
 * @property disabled 此表单项是否被禁用
 * @property defaultValue 此表单项的默认值
 */
interface CDSFormItem {
    val type: String
    val readonly: Boolean
    val disabled: Boolean
    val defaultValue: String?
}

/**
 * 所有提供一组值给用户选择的表单项的基类
 * @property multiable 是否允许选择多项
 * @property label 指示客户端应该如何显示每一项,这通常在可选值不是类字符串类型时有用(比如用户对象),
 *                  它可以是一个模板字符串,使用使用模板变量``it``来表示当的可选值
 * @property options 可选项列表
 */
interface CDSFormSelectable<T> {
    val multiable: Boolean
    val label: String
    val options: List<T>
}

/**
 * 所有文本类表单项的抽象基类
 * @property clearable 是否需要为此文本类表单项中的文本添加快捷清空按钮
 * @property type 表单项的类型
 * @property rows 允许输入的行数
 * @constructor
 */
abstract class CDSBasicTextFormItem : CDSFormItem {
    override val type: String
        get() = "text"

    abstract val clearable: Boolean
    abstract val rows: Int

}

data class CDSSimpleTextFormItem(
    override val readonly: Boolean = false,
    override val disabled: Boolean = false,
    override val clearable: Boolean = true,
    override val rows: Int = 1,
    override val defaultValue: String? = null
) :
    CDSBasicTextFormItem()


abstract class CDSBasicRadioGroupFormItem<T> : CDSFormItem, CDSFormSelectable<T> {
    override val type: String
        get() = "radio-group"

}

abstract class CDSBasicComboboxFormItem<T> : CDSFormItem, CDSFormSelectable<T> {
    override val type: String
        get() = "combobox"

}

abstract class CDSBasicNumberFormItem : CDSFormItem {
    override val type: String
        get() = "number"

    abstract val min: Double
    abstract val max: Double

}

/**
 * 日期时间类选择器的抽象基类
 * @property valueType 值的类型,可选值有[year|month|date|datetime]
 * @property valueFormat 值格式
 * @constructor
 */
abstract class CDSBasicDatetimeFormItem(
    val valueType: String = "datetime",
    val valueFormat: String = "yyyy-MM-dd HH:mm:ss"
) : CDSFormItem {
    override val type: String
        get() = "datetime"

}
