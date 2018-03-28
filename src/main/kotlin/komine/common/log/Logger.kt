package komine.common.log

interface Logger {
    fun shouldLog(level: LogLevel): Boolean
    fun send(level: LogLevel, e: Throwable? = null, message: String)
}
