package org.cds

import java.time.LocalDateTime
import java.util.Locale


/**
 * 计算[此时间][this]到[目标时间][compareTo]之前的距离,并返回一个类似于``one hour ago``之类的人类可读化字符串
 * @receiver [LocalDateTime]
 * @param compareTo 比较对象
 * @param locale 地区
 */
fun  LocalDateTime.humanizeDistance(compareTo:LocalDateTime ,locale: Locale = Locale.CHINA){

}


fun main() {
    LocalDateTime.now().humanizeDistance(LocalDateTime.parse("2022-07-11 18:27:03")) //1 分钟前
    LocalDateTime.now().humanizeDistance(LocalDateTime.parse("2022-07-11 17:27:03")) //1 小时前

}
