package com.thinhdo.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.ibatis.mapping.VendorDatabaseIdProvider;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.thinhdo.mapper.StudentMapper;

@Configuration
@ComponentScan(basePackages = { "com.thinhdo.service" })
public class AppConfig {

    @Bean
    @Primary
    public DriverManagerDataSource dataSource_MySql() throws IOException {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        Properties properties = new Properties();
        InputStream user_props = this.getClass()
                .getResourceAsStream("/application.properties");
        properties.load(user_props);
        dataSource.setDriverClassName(
                properties.getProperty("spring.datasource-mysql.driver-class-name"));
        dataSource.setUrl(properties.getProperty("spring.datasource-mysql.url"));
        dataSource.setUsername(
                properties.getProperty("spring.datasource-mysql.username"));
        dataSource.setPassword(
                properties.getProperty("spring.datasource-mysql.password"));
        return dataSource;
    } 
    
    @Bean
    public VendorDatabaseIdProvider databaseIdProvider() {
	    VendorDatabaseIdProvider databaseIdProvider = new VendorDatabaseIdProvider();
	    Properties properties = new Properties();
	    properties.put("MySQL", "mysql");
	    properties.put("SQL Server", "sqlserver");
	    databaseIdProvider.setProperties(properties);
	    return databaseIdProvider;
    } 

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory_MySql() throws Exception {
        Resource resource = new ClassPathResource("SqlMapConfig.xml");
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource_MySql()); // datasourcec
        sqlSessionFactory.setConfigLocation(resource); // mapper location
        sqlSessionFactory.setDatabaseIdProvider(databaseIdProvider());
        return sqlSessionFactory;
    }
    
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory_SqlServer() throws Exception {
        Resource resource = new ClassPathResource("SqlMapConfig.xml");
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource_SqlServer()); // datasourcec
        sqlSessionFactory.setConfigLocation(resource); // mapper location
        sqlSessionFactory.setDatabaseIdProvider(databaseIdProvider());
        return sqlSessionFactory;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer_MySql() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.thinhdo.mapper");
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory_MySql");
        return mapperScannerConfigurer;
    }
    
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer_SqlServer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.thinhdo.mapper");
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory_SqlServer");
        return mapperScannerConfigurer;
    }
    
    /**
     * SQL SERVER: Datasource
     * @return
     * @throws IOException
     */
    @Bean
    public DriverManagerDataSource dataSource_SqlServer() throws IOException {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        Properties properties = new Properties();
        InputStream user_props = this.getClass()
                .getResourceAsStream("/application.properties");
        properties.load(user_props);
        dataSource.setDriverClassName(
                properties.getProperty("spring.datasource-sqlserver.driver-class-name"));
        dataSource.setUrl(properties.getProperty("spring.datasource-sqlserver.url"));
        dataSource.setUsername(
                properties.getProperty("spring.datasource-sqlserver.username"));
        dataSource.setPassword(
                properties.getProperty("spring.datasource-sqlserver.password"));
        return dataSource;
    }
 
    @Bean (name = "studentMapper_MySql")
    public StudentMapper studentMapper1() throws Exception {
        SqlSessionTemplate sessionTemplate = new SqlSessionTemplate(sqlSessionFactory_MySql().getObject());
        return sessionTemplate.getMapper(StudentMapper.class);
    }
    
    @Bean (name = "studentMapper_SqlServer")
    public StudentMapper studentMapper2() throws Exception {
        SqlSessionTemplate sessionTemplate = new SqlSessionTemplate(sqlSessionFactory_SqlServer().getObject());
        return sessionTemplate.getMapper(StudentMapper.class);
    }  
}
