package ru.practicum.evmstatsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import ru.practicum.statsclient.StatsClientImpl;

@SpringBootApplication
@Import({StatsClientImpl.class})
public class EvmStatsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EvmStatsServiceApplication.class, args);
    }
}