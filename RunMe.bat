set projectLocation=C:\Documents\Edureka\Craftsvilla
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\Jars\*
java org.testng.TestNG %projectLocation%\testng.xml
pause