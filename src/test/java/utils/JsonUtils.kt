package utils

import com.google.gson.Gson
import java.io.IOException
import java.io.UncheckedIOException
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

class JsonUtils {
    fun getCurrentWorkingDirectory(): Path {
        return Paths.get(".").toAbsolutePath().normalize()
    }

    fun loadFileAsString(path: Path?): String {
        return if (path == null) {
            throw IllegalArgumentException("Не задан путь к файлу")
        } else if (!path.toFile().exists()) {
            throw IllegalArgumentException("Файл не существует")
        } else {
            try {
                String(Files.readAllBytes(path))
            } catch (var2: IOException) {
                throw UncheckedIOException(var2)
            }
        }
    }

    fun resolveJson(pathToFile: String, className: String): Any {
        return Gson().fromJson(
                loadFileAsString(getCurrentWorkingDirectory()
                        .resolve(pathToFile)),
                Class.forName(className))
    }
}