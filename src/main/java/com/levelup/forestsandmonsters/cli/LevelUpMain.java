package com.levelup.forestsandmonsters.cli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StringUtils;

@SpringBootApplication
public class LevelUpMain {
    public static void main(String[] args) {
        String[] disabledCommands = {"--spring.shell.command.stacktrace.enabled=false","--spring.shell.command.history.enabled=false","--spring.shell.command.script.enabled=false"}; 
        String[] fullArgs = StringUtils.concatenateStringArrays(args, disabledCommands);
        SpringApplication.run(LevelUpMain.class, fullArgs);
    }
}
