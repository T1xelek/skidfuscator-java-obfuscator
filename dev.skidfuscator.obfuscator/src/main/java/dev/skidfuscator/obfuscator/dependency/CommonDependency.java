package dev.skidfuscator.obfuscator.dependency;

import dev.skidfuscator.obfuscator.dependency.matcher.DependencyMatcher;

import java.util.List;

public enum CommonDependency {
    BUKKIT("https://github.com/skidfuscatordev/mappings/raw/refs/heads/main/spigot/1.21/paper-1.21.zip", new DependencyMatcher() {
        @Override
        public boolean test(List<String> strings) {
            return strings.stream().anyMatch(e -> e.contains("org/bukkit"));
        }
    });

    private final String url;
    private final DependencyMatcher matcher;

    CommonDependency(String url, DependencyMatcher matcher) {
        this.url = url;
        this.matcher = matcher;
    }

    public String getUrl() {
        return url;
    }

    public DependencyMatcher getMatcher() {
        return matcher;
    }
}
