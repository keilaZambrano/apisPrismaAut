# How to use Allure reporting

Here we will learn how to install the Allure reporting framework.

## Install the framework

### Linux:

Install it via the package manager of your distro. For example in Ubuntu Linux:

```bash
$ sudo apt-add-repository ppa:qameta/allure
$ sudo apt update
$ sudo apt install allure 
```

### Windows

For Windows, Allure is available from the [Scoop](https://scoop.sh/) command-line installer.
First you must install Scoop as mentioned in the linked page, and then, you must execute in the Powershell:

```cmd
> scoop install allure
```

### Mac OS X

For Mac automated install is provided via [Homebrew](https://brew.sh):

```bash
$ brew install allure 
```

### Manual installation

For manual installation the steps are:

1. Download the latest version as zip archive from Maven

2. Unpack the archive to allure-commandline directory.

3. Navigate to **bin** directory.

4. Use **allure.bat** for Windows or **allure** for other Unix platforms.

5. Add **allure** to system PATH

## Verify installation:

Just run in a terminal:

```bash
allure --version
```

## Environment

You must create a file named ***allure.properties*** inside **src/test/resources**, containing the following line:

***allure.properties***
```
Allure.results.directory = target/allure-results
```
### Working with maven and TestNG

Add the following to ***pom.xml***:

```xml
<properties>
    <aspectj.version>1.8.10</aspectj.version>
</properties>

<dependencies>
    <dependency>
        <groupId>io.qameta.allure</groupId>
        <artifactId>allure-junit4</artifactId>
        <version>LATEST_VERSION</version>
        <scope>test</scope>
    </dependency>
</dependencies>

<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-surefire-plugin</artifactId>
            <version>2.20</version>
            <configuration>
                <testFailureIgnore>false</testFailureIgnore>
                <argLine>
                    -javaagent:"${settings.localRepository}/org/aspectj/aspectjweaver/${aspectj.version}/aspectjweaver-${aspectj.version}.jar"
                </argLine>
                <properties>
                    <property>
                        <name>listener</name>
                        <value>io.qameta.allure.junit4.AllureJunit4</value>
                    </property>
                </properties>
            </configuration>
            <dependencies>
                <dependency>
                    <groupId>org.aspectj</groupId>
                    <artifactId>aspectjweaver</artifactId>
                    <version>${aspectj.version}</version>
                </dependency>
            </dependencies>
        </plugin>
    </plugins>
</build>
...
```
Then, run the tests as usual 
```bash
mvn clean test
```

This will create a folder **target/allure-result**. To generate the html report and automatically open it in a web browser run:

```bash
allure serve target/allure-results
```
