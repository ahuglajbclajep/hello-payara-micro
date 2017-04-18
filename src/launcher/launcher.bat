@echo off
java -version
for %%i in (*.jar) do (
java -jar %%i --logtofile log
)
