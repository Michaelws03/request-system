package events;

import org.hibernate.Hibernate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;
import java.sql.DriverManager;

@Configuration
public class DataConfiguration {

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(org.h2.Driver);
        dataSource.setUrl("jdbc:h2:~/test ://localhost:8082/evento);
        dataSource.setUsername("sa");
        dataSource.setPassword("");
        return dataSource
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setDatabase(Database.H2);
        adapter.setShowH2 (true);
        adapter.setGenerateDdl();
        adapter.setDatabasePlatform("com.h2database");
        adapter.setPrepareConnection();
        return adapter;
    }
}
