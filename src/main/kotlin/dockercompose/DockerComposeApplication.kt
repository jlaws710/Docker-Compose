package dockercompose

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DockerComposeApplication

fun main(args: Array<String>) {
	runApplication<DockerComposeApplication>(*args)
}
