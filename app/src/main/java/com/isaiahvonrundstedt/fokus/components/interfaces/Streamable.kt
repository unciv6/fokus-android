package com.isaiahvonrundstedt.fokus.components.interfaces

import java.io.File
import java.io.InputStream

interface Streamable {

    fun toJson(): String?

    fun writeToFile(destination: File, name: String): File

    fun parseInputStream(inputStream: InputStream)

    companion object {
        const val ARCHIVE_NAME_GENERIC = "exported.ffs"
        const val FILE_NAME_TASK = "task.json"
        const val FILE_NAME_ATTACHMENT = "attachment.json"
        const val FILE_NAME_SUBJECT = "subject.json"
        const val FILE_NAME_SCHEDULE = "schedule.json"
        const val FILE_NAME_EVENT = "event.json"
        const val FILE_NAME_LOG = "log.json"

        const val FILE_EXTENSION = ".ffs"

        const val MIME_TYPE_ZIP = "application/zip"
    }
}