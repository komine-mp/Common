package komine.common.log

inline fun Logger.log(level: LogLevel, e: Throwable? = null, message: () -> String) {
    if (shouldLog(level)) send(level, e, message())
}

inline fun Logger.emergency(e: Throwable? = null, message: () -> String) =
    log(LogLevel.EMERGENCY, e, message)

inline fun Logger.alert(e: Throwable? = null, message: () -> String) =
    log(LogLevel.ALERT, e, message)

inline fun Logger.critical(e: Throwable? = null, message: () -> String) =
    log(LogLevel.CRITICAL, e, message)

inline fun Logger.error(e: Throwable? = null, message: () -> String) =
    log(LogLevel.ERROR, e, message)

inline fun Logger.warn(e: Throwable? = null, message: () -> String) =
    log(LogLevel.WARNING, e, message)

inline fun Logger.notice(e: Throwable? = null, message: () -> String) =
    log(LogLevel.NOTICE, e, message)

inline fun Logger.info(e: Throwable? = null, message: () -> String) =
    log(LogLevel.INFO, e, message)

inline fun Logger.debug(e: Throwable? = null, message: () -> String) =
    log(LogLevel.DEBUG, e, message)
