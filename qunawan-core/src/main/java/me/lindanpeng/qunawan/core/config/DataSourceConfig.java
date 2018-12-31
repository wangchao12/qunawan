package me.lindanpeng.qunawan.core.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    private final static Logger logger= LoggerFactory.getLogger(DataSourceConfig.class);
    @Bean
    @Qualifier("userDataSource")
    @ConfigurationProperties(prefix = "datasource.user")
    public DataSource userDataSource(){
       return new DruidDataSource();
    }
}
