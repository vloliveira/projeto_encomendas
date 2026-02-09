package chegouAqui;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;

@Configuration
public class DatabaseNamePrinter {

    @Bean
    CommandLineRunner showTables(DataSource dataSource) {
        return args -> {
            try (Connection conn = dataSource.getConnection()) {
                ResultSet rs = conn.getMetaData().getTables(conn.getCatalog(), null, "%", new String[]{"TABLE"});
                System.out.println("📋 Tabelas encontradas no banco:");
                while (rs.next()) {
                    System.out.println(" - " + rs.getString("TABLE_NAME"));
                }
            } catch (Exception e) {
                System.err.println("❌ Erro ao listar tabelas: " + e.getMessage());
            }
        };
    }
}
