package ru.skillbranch.devintensive.extensions

fun String.truncate(limit: Int = 16): String {
    val trimmedString = this.trim()
    if (trimmedString.length <= limit - 1) return trimmedString
    val substr = trimmedString.substring(0 until limit).trim()
    return "$substr..."
}
fun String.stripHtml(): String {
    return this
            .replace("""<.*?>""".toRegex(), "")
            .replace("""&(#\d+?|\w+?);""".toRegex(), "")
            .split(""" +""".toRegex()).joinToString(" ")
}
