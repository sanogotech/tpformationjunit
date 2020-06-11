package com.formation.assertions.assertj;

import org.assertj.core.api.InstanceOfAssertFactories;
import org.assertj.core.data.Index;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class AssertjTest {

    // assert string
    @Test
    void test_string_ok() {

        String name = "I am Souleymane!";

        assertThat(name)
                .as("if failed display this msg!")
                .isEqualTo("I am Souleymane!")
                .isEqualToIgnoringCase("I AM souleymane!")
                .startsWith("I")
                .endsWith("!")
                .containsIgnoringCase("souleymane");

    }

    // assert list
    @Test
    void test_list_ok() {

        List<String> list = Arrays.asList("Java", "Rust", "Clojure");

        assertThat(list)
                .hasSize(3)
                .contains("Java", "Clojure")
                .contains("Java", Index.atIndex(0))
                .contains("Rust", Index.atIndex(1))
                .contains("Clojure", Index.atIndex(2))
                .doesNotContain("Node JS");

    }

    // assert map
    @Test
    void test_map_ok() {

        Map<String, Object> map = new HashMap<>();
        map.put("name", "souleymane");

        assertThat(map)
                .hasSize(1)
                .extractingByKey("name", as(InstanceOfAssertFactories.STRING))
                .isEqualToIgnoringCase("souleymane")
                .startsWith("souleymane");

        assertThat(map).extracting("name")
                .isEqualTo("souleymane");

        Map<String, Object> map2 = new HashMap<>();
        map2.put("number", 999);

        assertThat(map2)
                .hasSize(1)
                .extractingByKey("number", as(InstanceOfAssertFactories.INTEGER))
                .isEqualTo(999);

    }


    // assert exception
    @Test
    void test_exception_ok() {

        assertThatThrownBy(() -> divide(1, 0))
                .isInstanceOf(ArithmeticException.class)
                .hasMessageContaining("zero")
                .hasMessage("/ by zero");

        assertThatThrownBy(() -> {
            List<String> list = Arrays.asList("one", "two");
            list.get(3);
        })
                .isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("3");

    }

    int divide(int input, int divide) {
        return input / divide;
    }

}
