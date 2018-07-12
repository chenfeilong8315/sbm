package mvc.common;

import javax.sql.DataSource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * 初始化配置dataSource
 * 单数据源配置
 * @author
 */
@Configuration
@MapperScan(basePackages = "mvc.mapper")
public class DataSourceConfiguration {

    @Bean
    @ConfigurationProperties(prefix = "jdbc.ds")
    public DataSource readDataSource() {
        return new DruidDataSource();
    }
}
