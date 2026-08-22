package com.R4ghuveer.thirdPartyPackage.configuration;
import com.R4ghuveer.thirdPartyPackage.beans.AwsJar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AwsFunctions {
    @Bean("awsJar")
    public AwsJar awsFunctions(){
        return new AwsJar();
    }
}
