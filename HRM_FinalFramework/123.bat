echo "HRM automation suite exceution"
cd C:\SelebiunDefault\HRM_FinalFramework 
 
mvn clean test -DsuiteXmlFile=suite.xml
pause