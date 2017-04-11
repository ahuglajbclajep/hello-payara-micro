# hello-payara-micro
## Usage
### Install
```sh
git clone https://github.com/ahuglajbclajep/hello-pyra-micro.git
cd hello-payara-micro
```

### Run
```sh
./gradlew run
```
If you're OS is Windows, please read `./gradlew` as `gradlew.bat`  
Server stop command is `ctrl + c`

### Check
Access to [http://localhost:8080](http://localhost:8080)
```sh
firefox http://localhost:8080 &
```

## UberJar & UberZip
UberJar document is [here](https://payara.gitbooks.io/payara-server/content/documentation/payara-micro/configuring/package-uberjar.html)
### Build
```sh
./gradlew uberJar
```
### Run
```sh
java -jar ./build/libs/hello-payara-micro.jar
```

### Distribute
If you want to distribute this,
```sh
./gradlew uberZip
```
zip file **containing the launcher scripts** will be created in `./build/distributions/`

## Licence
[Apache-2.0](LICENSE)
