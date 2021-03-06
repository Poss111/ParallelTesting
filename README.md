# Parallel Testing - PoC
### Maven Libraries being used
~~~    
<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-core -->
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-core</artifactId>
        <version>4.7.1</version>
    </dependency>
    <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java -->
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-java</artifactId>
        <version>4.7.1</version>
    </dependency>
    <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-junit -->
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-junit</artifactId>
        <version>4.7.1</version>
        <scope>test</scope>
    </dependency>
    <!-- https://mvnrepository.com/artifact/com.codeborne/selenide -->
    <dependency>
        <groupId>com.codeborne</groupId>
        <artifactId>selenide</artifactId>
        <version>5.2.7</version>
    </dependency>
    <!-- https://mvnrepository.com/artifact/junit/junit -->
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.12</version>
        <scope>test</scope>
    </dependency>
    <!-- https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-slf4j-impl -->
    <dependency>
        <groupId>org.apache.logging.log4j</groupId>
        <artifactId>log4j-slf4j-impl</artifactId>
        <version>2.12.0</version>
    </dependency>
~~~

### Maven Plugins
~~~
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-surefire-plugin</artifactId>
            <version>3.0.0-M3</version>
            <configuration>
                <parallel>methods</parallel>
                <useUnlimitedThreads>true</useUnlimitedThreads>
                <forkCount>4</forkCount>
                <includes>
                    <include>**/*Runner.java</include>
                </includes>
            </configuration>
        </plugin>
        <plugin>
            <groupId>com.trivago.rta</groupId>
            <artifactId>cluecumber-report-plugin</artifactId>
            <version>2.2.0</version>
            <executions>
                <execution>
                    <id>report</id>
                    <phase>post-integration-test</phase>
                    <goals>
                        <goal>reporting</goal>
                    </goals>
                </execution>
            </executions>
            <configuration>
                <sourceJsonReportDirectory>${project.build.directory}/html-reports/</sourceJsonReportDirectory>
                <generatedHtmlReportDirectory>${project.build.directory}/generated-report</generatedHtmlReportDirectory>
            </configuration>
        </plugin>
    </plugins>
 ~~~
