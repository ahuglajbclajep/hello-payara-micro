@echo off
java -version
echo ================
for %%i in (*.jar) do (
java -jar %%i
)
