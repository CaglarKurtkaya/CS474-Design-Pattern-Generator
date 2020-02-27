To run this project use GeneratorDemo class. 
GeneratorDemo instantiates the DePaCoG class
-> DePaCog mygenerator = new DePaCog();

The DePaCoG class has total 8 methods for each design pattern.

1.To generate Abstract Factroy Design pattern call generateAbstractFactoryPattern(String className, String productType, String productName, String packName) method. 
This method takes desired class name, product type, product Name and the package name.
Calling mygenerator.generateAbstractFactoryPattern("MyFactory","Bank","Chase", "Outputs") will generate AbstractFactory.java, Bank.java(productType),
Chase.java(productName) in a directory called Outputs.

2.To generate Builder pattern call generateBuilderPattern(String className, String productType, String productName, String packName)
Example -> mygenerator.generateBuilderPattern("ComplexObject","Computer","Processor", "Outputs");  

3.To generate Factory pattern call generateFactoryPattern(String className, String productType, String productName, String packName)
Example -> mygenerator.generateFactoryPattern("MyFactory","Human","Student", "Outputs");

4.To generate Facade pattern call generateFacadePattern(String className, String packName)
Example -> mygenerator.generateFacadePattern("MyHandler", "Outputs");

5.To generate Chain pattern call generateChainPattern(String className, String packName)
Example -> mygenerator.generateChainPattern("MyHandler", "Outputs");

6.To generate Mediator pattern call generateMediatorPattern(String className, String packName)
Example -> mygenerator.generateMediatorPattern("MyMediator", "Outputs");

7.To generate Visitor pattern call generateVisitorPattern(String className, String packName)
Example -> mygenerator.generateVisitorPattern("MyVisitor", "Outputs");

8.To generate Template call generateTemplatePattern(String className, String packName)
Example -> mygenerator.generateTemplatePattern("MyTemplate", "Outputs");