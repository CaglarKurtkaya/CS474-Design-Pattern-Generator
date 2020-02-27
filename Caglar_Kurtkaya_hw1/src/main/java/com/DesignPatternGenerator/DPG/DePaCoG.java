package com.DesignPatternGenerator.DPG;//package CodeGenerator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class DePaCoG{
    private AbstractFactory af;
    private Map<String,String> myMap;
    private static final Logger logger = LoggerFactory.getLogger("DePaCoG");

    public DePaCoG() {
        this.af = new PatternFactory();
        myMap = new HashMap<>();
    }


    public void generateAbstractFactoryPattern(String className, String productType, String productName, String packName){
        myMap.put("desiredClassName", className);
        myMap.put("productType", productType);
        myMap.put("productName", productName);
        myMap.put("packName", packName);
        PatternGenerator pg = af.getPattern("AFDP", myMap);
        logger.info("PatternGenerator is being created with patternName -> {}", "AFDP");
        pg.generateCode();
    }
    public void generateBuilderPattern(String className, String productType, String productName, String packName){
        myMap.put("desiredClassName", className);
        myMap.put("productType", productType);
        myMap.put("productName", productName);
        myMap.put("packName", packName);
        PatternGenerator pg = af.getPattern("BDP", myMap);
        logger.info("PatternGenerator is being created with patternName -> {}", "BDP");
        pg.generateCode();
    }

    public void generateFactoryPattern(String className, String productType, String productName, String packName){
        myMap.put("desiredClassName", className);
        myMap.put("productType", productType);
        myMap.put("productName", productName);
        myMap.put("packName", packName);
        PatternGenerator pg = af.getPattern("FDP", myMap);
        logger.info("PatternGenerator is being created with patternName -> {}", "FDP");
        pg.generateCode();
    }
    public void generateFacadePattern(String className, String packName){
        myMap.put("desiredClassName", className);
        myMap.put("packName", packName);
        PatternGenerator pg = af.getPattern("FCDP", myMap);
        logger.info("PatternGenerator is being created with patternName -> {}", "FCDP");
        pg.generateCode();
    }

    public void generateChainPattern(String className, String packName){
        myMap.put("desiredClassName", className);
        myMap.put("packName", packName);
        PatternGenerator pg = af.getPattern("CDP", myMap);
        logger.info("PatternGenerator is being created with patternName -> {}", "CDP");
        pg.generateCode();
    }
    public void generateMediatorPattern(String className, String packName){
        myMap.put("desiredClassName", className);
        myMap.put("packName", packName);
        PatternGenerator pg = af.getPattern("MDP", myMap);
        logger.info("PatternGenerator is being created with patternName -> {}", "MDP");
        pg.generateCode();
    }

    public void generateVisitorPattern(String className, String packName){
        myMap.put("desiredClassName", className);
        myMap.put("packName", packName);
        PatternGenerator pg = af.getPattern("VDP", myMap);
        logger.info("PatternGenerator is being created with patternName -> {}", "VDP");
        pg.generateCode();
    }

    public void generateTemplatePattern(String className, String packName){
        myMap.put("desiredClassName", className);
        myMap.put("packName", packName);
        PatternGenerator pg = af.getPattern("TDP", myMap);
        logger.info("PatternGenerator is being created with patternName -> {}", "TDP");
        pg.generateCode();
    }


}