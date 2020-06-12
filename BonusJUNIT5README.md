@RepeatedTest(3)
@Tag("unitaire")
assertTimeout(ofMinutes(2), () -> {
            // Perform task that takes less than 2 minutes
        });

@Order(3)

@ParameterizedTest(name = "#{index} - Run test with args={0}")
@ValueSource(ints = {22,1, 2, 3})
----------------
@Tag("integration")


@Tag("api")


@Tag("ihmselenium")

-----------------

@Tag("slow")


mvn  test -exclude (ihmselenium)