/*
 *  _  __               _                  __  __ ____
 * | |/ /___  _ __ ___ (_)_ __   ___      |  \/  |  _ \
 * | ' // _ \| '_ ` _ \| | '_ \ / _ \_____| |\/| | |_) |
 * | . \ (_) | | | | | | | | | |  __/_____| |  | |  __/
 * |_|\_\___/|_| |_| |_|_|_| |_|\___|     |_|  |_|_|
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * @author Komine Team
 * @link https://github.com/komine-mp/
 *
 */

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
