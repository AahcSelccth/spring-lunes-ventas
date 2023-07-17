package pe.idat.LunesVentas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


// Excluir de sql por ahora_: exclude = DataSourceAutoConfiguration.class
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class LunesVentasApplication {

	public static void main(String[] args) {
		SpringApplication.run(LunesVentasApplication.class, args);
	}

}
