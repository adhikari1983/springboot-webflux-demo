package com.myprojects.springwebflux;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public class MonoFluxTest {

    @Test
    public void testMono() {
        Mono<String> monoString = Mono.just("Kiran Adhikari").log();
        monoString.subscribe(System.out::println);
    }
}