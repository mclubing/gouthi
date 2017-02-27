package com.gouthi.prop;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.PreDestroy;
import javax.sql.DataSource;

/**
 * Created by Lu.Bing on 2017/2/27.
 * in com.gouthi.prop
 * by Lu.Bing
 * on 2017/2/27
 */
@Configuration
@MapperScan("com.gouthi.dao")
@EnableConfigurationProperties(DataSourceConfigProps.class)
@EnableTransactionManagement
public class GDataSource {
    // mybaits mapper xml搜索路径
    private final static String MAPPERLOCATIONS = "classpath:/mappings/*.xml";
    private final static String CONFIGLOCATION = "classpath:/mybatis-config.xml";

    @Autowired
    private DataSourceConfigProps dataSourceConfigProps;
    private DruidDataSource datasource = null;

    @Bean(destroyMethod = "close")
    public DataSource dataSource() {
        datasource = new DruidDataSource();
        datasource.setUrl(dataSourceConfigProps.getUrl());
        datasource.setDbType(dataSourceConfigProps.getType());
        datasource.setDriverClassName(dataSourceConfigProps.getDriver());
        datasource.setUsername(dataSourceConfigProps.getUsername());
        datasource.setPassword(dataSourceConfigProps.getPassword());
        System.out.println("---------------------------------------------------------\n" + dataSourceConfigProps);
        System.out.println("---------------------------------------------------------");
        return datasource;
    }

    @PreDestroy
    public void close() {
        if (datasource != null) {
            datasource.close();
        }
    }

    @Bean
    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources(MAPPERLOCATIONS));
        sqlSessionFactoryBean.setConfigLocation(resolver.getResource(CONFIGLOCATION));
        sqlSessionFactoryBean.setTypeAliasesPackage("com.gouthi.entity");
        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }
}
