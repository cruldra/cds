package org.cds



/**
 * 登录页面模型
 * @property backgroundImg 背景图
 * @property brandLogo 品牌logo
 * @property brandDescription 品牌描述
 * @property firstTitle 登录表单卡片一级标题
 * @property secondTitle 登录表单卡片二级标题
 * @property form 登录表单
 * @property signInWiths 支持的第三方登录服务列表
 * @property showSignupLink 是否显示注册按钮
 * @property showForgotPasswordLink 是否显示忘记密码按钮
 * @property showCopyright 是否显示版权信息
 * @constructor
 */
data class CDSLoginPageModel(

    val backgroundImg: String,
    val brandLogo: String,
    val brandDescription: String,

    val firstTitle: String,
    val secondTitle: String,

    val form: CDSForm,

    val signInWiths: List<String> = listOf("qq", "wechat"),

    val showSignupLink: Boolean = true,
    val showForgotPasswordLink: Boolean = true,
    val showCopyright: Boolean = true
)
