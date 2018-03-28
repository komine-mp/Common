package komine.common.log

interface AttachableLogger : Logger {
    val attachements: Collection<LoggerAttachment>

    fun addAttachment(attachment: LoggerAttachment)
    fun removeAttachment(attachment: LoggerAttachment)
    fun removeAttachments()
}
