package komine.common.log

interface LoggerAttachment {
    fun shouldLog(level: LogLevel)
    fun log(level: LogLevel, message: String)
}
