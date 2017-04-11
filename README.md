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
server stop command is `ctrl + c`

### Check
```sh
firefox http://localhost:8080 &
```

## UberJar
### Build
```sh
./gradlew uberJar
```
### Run
```sh
java -jar ./build/libs/ROOT.jar
```

## Licence
[Apache-2.0](LICENSE)
