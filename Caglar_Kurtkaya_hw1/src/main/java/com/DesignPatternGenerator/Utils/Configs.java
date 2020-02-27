package com.DesignPatternGenerator.Utils;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class Configs {
    public static Config config = ConfigFactory.load();


    //Abstract Factory Pattern
    public static String abstractInterfaceName = config.getString("AbstractFactory.interfaceName");
    public static String methodGetName = config.getString("AbstractFactory.methodName1");
    public static String methodCreate= config.getString("AbstractFactory.methodName2");

    //Builder Design Pattern
    public static String variableChildren = config.getString("Builder.variableName1");
    public static String variableChild = config.getString("Builder.variableName2");
    public static String methodAdd = config.getString("Builder.methodName1");
    public static String methodIterator = config.getString("Builder.methodName2");
    public static String methodBuildPartA = config.getString("Builder.methodName3");
    public static String methodGetResult = config.getString("Builder.methodName4");
    public static String interfaceBuilder = config.getString("Builder.interfaceName");
    public static String fieldCo = config.getString("Builder.fieldName");
    public static String classBuilder1 = config.getString("Builder.classBuilder1");

    //Factory
    public static String classCreator = config.getString("Factory.factoryAbstractClassName");
    public static String fieldProduct = config.getString("Factory.fieldProduct");
    public static String methodFactoryMethod = config.getString("Factory.methodName1");
    public static String methodFoperation = config.getString("Factory.methodName2");

    //Facade
    public static String classFacade = config.getString("Facade.facadeAbstractClassName");
    public static String methodFacadeOperation = config.getString("Facade.methodName1");

    //Chain
    public static String classReceiver = config.getString("Chain.className");
    public static int numberOfClass = config.getInt("Chain.numberOfClass");
    public static String fieldSuccessor = config.getString("Chain.field1");
    public static String methodHandleRequest = config.getString("Chain.methodName1");
    public static String methodCanHandle = config.getString("Chain.methodName2");


    //Mediator
    public static String classMediator = config.getString("Mediator.className");
    public static String classColleague = config.getString("Mediator.className2");

    public static String variableColleague = config.getString("Mediator.variableName");
    public static String variableState = config.getString("Mediator.variableName2");
    public static String variableMediator = config.getString("Mediator.variableName3");
    public static String methodMediate = config.getString("Mediator.methodName");
    public static String methodSetColleagues = config.getString("Mediator.methodName2");
    public static String methodGetState = config.getString("Mediator.methodName3");
    public static String methodSetState = config.getString("Mediator.methodName4");
    public static String methodAction = config.getString("Mediator.methodName5");


    //Visitor Pattern
    public static String visitorName = config.getString("Visitor.abstractVisitorName");
    public static String elementName = config.getString("Visitor.abstractElementName");
    public static String variableVisitor = config.getString("Visitor.variableName");
    public static String variableElement = config.getString("Visitor.variableName2");
    public static String methodAccept = config.getString("Visitor.methodName1");
    public static String methodOperation = config.getString("Visitor.methodName2");
    public static String methodVisitElement = config.getString("Visitor.methodName3");
    public static int numberOfVisitorMethods = config.getInt("Visitor.numberOfVisitorMethods");


    //Template Pattern
    public static String templateName = config.getString("Template.abstractTemplateName");
    public static String methodName1 = config.getString("Template.methodName1");
    public static String methodName2 = config.getString("Template.methodName2");
}
