package com.DesignPatternGenerator.DPG;

import java.util.Map;

public class PatternFactory implements AbstractFactory {
    private PatternGenerator p;



    @Override
    public PatternGenerator getPattern(String patternName, Map<String,String> args)
    {

        //Factory Design Pattern(FCDP)
        //Chain Design Pattern(CDP)
        //Mediator Design Pattern(MDP)
        //Visitor Design Pattern(VDP)
        //Template Design Pattern(TDP)
        if((patternName.equalsIgnoreCase("FCDP"))
            || (patternName.equalsIgnoreCase("CDP"))
                || (patternName.equalsIgnoreCase("MDP"))
                    || (patternName.equalsIgnoreCase("VDP"))
                        || (patternName.equalsIgnoreCase("TDP"))){
            return p = new PatternBuilder.pBuilder(patternName,args.get("desiredClassName"))
                    .withPackName(args.get("packName"))
                    .build();
        }
        else {
            // Abstract Factory Design Pattern(AFDP)
            // Builder Design Pattern(BDP)
            // Factory Design Pattern(FDP)
            return p = new PatternBuilder.pBuilder(patternName, args.get("desiredClassName"))
                    .withProductType(args.get("productType"))
                    .withProductName(args.get("productName"))
                    .withPackName(args.get("packName"))
                    .build();
        }
    }
}
