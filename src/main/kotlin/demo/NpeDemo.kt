package demo

import io.quarkus.runtime.QuarkusApplication
import io.quarkus.runtime.annotations.QuarkusMain
import java.sql.DriverManager


@QuarkusMain
class NpeDemo : QuarkusApplication {
    override fun run(vararg args: String): Int {
        Class.forName("org.sqlite.JDBC");
        DriverManager.getConnection("jdbc:sqlite:./temp-db").use { it.createStatement().use { } }
        return 0
    }
}

