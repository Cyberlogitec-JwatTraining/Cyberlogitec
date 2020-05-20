package com.cyberlogitec.jwat.springbootmybatis;

import com.cyberlogitec.jwat.springbootmybatis.Mappers.EmployeeMapper;
import com.cyberlogitec.jwat.springbootmybatis.Mappers.StudentMapper;
import org.apache.ibatis.mapping.VendorDatabaseIdProvider;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;

@Configuration
@ComponentScan(basePackages = {"com.cyberlogitec"})
public class AppConfig {

    /**
     * This is datasource for ORACLE database
     *
     * @return dataSource
     * @throws IOException IO Exception
     */
    @Bean
    public DriverManagerDataSource dataSource() throws IOException {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        Properties properties = new Properties();
        InputStream user_props = this.getClass()
                .getResourceAsStream("/application.properties");
        properties.load(user_props);
        dataSource.setDriverClassName(
                properties.getProperty("spring.datasource.driver-class-name"));
        dataSource.setUrl(properties.getProperty("spring.datasource.url"));
        dataSource.setUsername(
                properties.getProperty("spring.datasource.username"));
        dataSource.setPassword(
                properties.getProperty("spring.datasource.password"));
        return dataSource;
    }

    /**
     * This is datasource for MYSQL database
     *
     * @return dataSource
     * @throws IOException IO Exception
     */
    @Bean
    public DriverManagerDataSource dataSource2() throws IOException {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        Properties properties = new Properties();
        InputStream user_props = this.getClass()
                .getResourceAsStream("/application.properties");
        properties.load(user_props);
        dataSource.setDriverClassName(
                properties.getProperty("spring.datasource.driver-class-name2"));
        dataSource.setUrl(properties.getProperty("spring.datasource.url2"));
        dataSource.setUsername(
                properties.getProperty("spring.datasource.username2"));
        dataSource.setPassword(
                properties.getProperty("spring.datasource.password2"));
        return dataSource;
    }

    @Bean
    public VendorDatabaseIdProvider vendorDatabaseIdProvider() {
        Properties vendorProperties = new Properties();
        vendorProperties.setProperty("MySQL", "mysql");
        vendorProperties.setProperty("Oracle", "oracle");
        VendorDatabaseIdProvider dbIdProvider = new VendorDatabaseIdProvider();
        dbIdProvider.setProperties(vendorProperties);
        return dbIdProvider;
    }

    /**
     * SQL Session Factory for ORACLE database
     *
     * @return SQL Session Factory
     * @throws Exception Exception
     */
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
        Resource resource = new ClassPathResource("SqlMapConfig.xml");
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource());
        sqlSessionFactory.setConfigLocation(resource);
        sqlSessionFactory.setDatabaseIdProvider(vendorDatabaseIdProvider());
        return sqlSessionFactory;
    }

    /**
     * SQL Session Factory for ORACLE database
     *
     * @return SQL Session Factory
     * @throws Exception Exception
     */
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory2() throws Exception {
        Resource resource = new ClassPathResource("SqlMapConfig.xml");
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource2());
        sqlSessionFactory.setConfigLocation(resource);
        sqlSessionFactory.setDatabaseIdProvider(vendorDatabaseIdProvider());
        return sqlSessionFactory;
    }

    @Bean
    public EmployeeMapper employeeMapper() throws Exception {
        SqlSessionTemplate sessionTemplate = new SqlSessionTemplate(Objects.requireNonNull(sqlSessionFactory().getObject()));
        return sessionTemplate.getMapper(EmployeeMapper.class);
    }

    /**
     *  Student mapper for ORACLE database
     * @return StudentMapper
     * @throws Exception Exception
     */
    @Bean("Oracle")
    public StudentMapper studentMapper() throws Exception {
        SqlSessionTemplate sessionTemplate = new SqlSessionTemplate(Objects.requireNonNull(sqlSessionFactory().getObject()));
        return sessionTemplate.getMapper(StudentMapper.class);
    }

    /**
     *  Student mapper for MYSQL database
     * @return StudentMapper
     * @throws Exception Exception
     */
    @Bean("MySQL")
    public StudentMapper studentMapper2() throws Exception {
        SqlSessionTemplate sessionTemplate = new SqlSessionTemplate(Objects.requireNonNull(sqlSessionFactory2().getObject()));
        return sessionTemplate.getMapper(StudentMapper.class);
    }
}
