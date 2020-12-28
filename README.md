# Template Rest Assured

This is a Guide to install and use the Rest Assured template. This template provide a basic structure to test api rest. 
Using Java, Maven, REST-assured, POJO, TestNG and Allure.
Also, has a GitLab Pipeline configured and a [guide for do it](docs/HowToUsePipeline.md).

Requirements (tools needed)
---
 - Java JDK (recommended version 12.0.1). [How to install Java JDK](docs/HowToInstallJavaJDK.md)
 - Maven (recommended version 3.6.1). [How to install Maven](docs/maveninstall.md)
 - GIT (recommended version 2.21.0). [How to install GIT](https://git-scm.com/downloads)
 - Allure (recommended version 2.12.1). [How to install Allure](docs/StepsToUseAllure.md)

Packages
---
 - **java.pojos:** This package contains the classes that handle the API objects
 - **java.utils:** This package contains the classes that provide the API resources
 - **test.api:** This package contains the classes that implement the tests
 - **test.dataprovider:** This package contains the classes that provide input data to the tests
 - **test.helpers:** This package contains the classes that pojo methods use to make request to the API
 - **test.example:** An example to use the template


Classes
---

**BaseTest:** Here goes the common behavior of the tests


**DataProviderTemplate:** This class will provide different data to test


**UrlResources:** In this interface are defined the resources of the API


**ConfigHeader:** This class reads the configHeader.xml file and use setup the header


**HelperBase:** Here goes the common behavior of the helpers


XML Files
---
**configHeader:** This file contains the api credentials (token, keys), to use the template.


**suiteTest:** This file contains the test suites for testng, it's possible setup groups, browsers and threads.


Guide links
---
 - [Explaining the example](docs/ExplainingTheExample.md)
 - [Steps to use the template](docs/StepsToUseTemplate.md)
 - [Steps to use Allure](docs/StepsToUseAllure.md)


References
---
 - [Testng](https://testng.org/doc/documentation-main.html)
 - [REST-assured](http://rest-assured.io/)
 - [POJO](https://en.wikipedia.org/wiki/Plain_old_Java_object)
 - [Allure](https://docs.qameta.io/allure/)