package com.DesignPatternGenerator.DPG;

import java.util.Map;

public interface AbstractFactory {
    PatternGenerator getPattern(String patternName, Map<String, String> args);
}
