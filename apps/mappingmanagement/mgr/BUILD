COMPILE_DEPS = CORE_DEPS + KRYO + [
    "//apps/mappingmanagement/api:onos-apps-mappingmanagement-api",
    "//core/store/serializers:onos-core-serializers",
]

TEST_DEPS = TEST_ADAPTERS + [
    "//utils/osgi:onlab-osgi-tests",
]

osgi_jar_with_tests(
    test_deps = TEST_DEPS,
    deps = COMPILE_DEPS,
)
