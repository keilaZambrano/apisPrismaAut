# Steps to run your own tests

---

- Open configHeader.xml and add the credentials according to the API that you want to use


- Implement new POJO classes to represent the json objects of the API, in the java.pojos Package, remember that each class defines the behaviour of one json object.


- Implement helper classes extending helperBase, with generic requests to your API that the POJOs use


- Implement test classes extending BaseTest for every test suite you need, it's a good practice to group this tests by either request type or POJO


- Implement the dataProvider class if you need to run the same tests with different data


- Implement test suites including your test classes