package com.example.gateway;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Consumer;

@Component
public class LogFilter extends AbstractGatewayFilterFactory<LogFilter.Config> {
    @Override
    public GatewayFilter apply(String routeId, Consumer<LogFilter.Config> consumer) {
        return super.apply(routeId, consumer);
    }

    @Override
    public GatewayFilter apply(Consumer<LogFilter.Config> consumer) {
        return super.apply(consumer);
    }

    @Override
    public GatewayFilter apply(LogFilter.Config config) {
        return null;
    }

    @Override
    public GatewayFilter apply(String routeId, LogFilter.Config config) {
        return super.apply(routeId, config);
    }

    @Override
    public String name() {
        return super.name();
    }

    @Override
    public ShortcutType shortcutType() {
        return super.shortcutType();
    }

    @Override
    public List<String> shortcutFieldOrder() {
        return super.shortcutFieldOrder();
    }

    @Override
    public String shortcutFieldPrefix() {
        return super.shortcutFieldPrefix();
    }

    public class Config {
    }
}
