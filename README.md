# Data Structures and Algorithms Quesitons and Implementations in Java
### Goal and Description
The goal of this repository is to compile my solutions and implementations of the various DS&A, interview and general software engineering questions. <br>
The project is built in an organized manner so that it is easy to implemet and unit test the quesitons.<br>
Topics in DS&A will be arranged in packages and every question will have a corresponding unit test... well.. to test 🤷‍♂️<br><br>
Iniside the package there will be:
- A concrete class containing all the question where every method will be an implementation of my answer. A comment will state the time and space complexity.
- A static utillity class for the more general implementations of algorithms and data structures (if necessary.. thanks Java).
- A test class which will have a test corresponding to every method in the concrete class to test run. The display names will contatin the question.

### Flow
I'd use this repository as a learning tool. It's easier to develop and practice using an IDE because it supports your thinking. You don't get stuck on rememebering the exact
class or utillity you need.
In case you want to develop without the IDE support your free to use other tools to write your code and then copy paste it to the IDE for testing.
1. The test function will call the corresponding concrete function and test it.
2. Running the test will show in the results the question name and the comparison between the expected and the actual answers.

### Configuration
0. You'll need the prerequisites for Jave developing (JDK8 (1.8))
1. Clone the repository as a maven project.
2. After it's done indexing you're ready!
### Credits
- The Arrays question have been taken from the leetcode.com website. visit it for more information and great tutorials.

### Plans
For now this module is growing to showcase my knowledge and as a log of the questions I've solved before. I don't plan to copy paste into here. 
I won't accept outside contribution for now either. 
I think I'd like to set up the project in a way that the concrete functions are empty so that all the tests fail. As in, when another person clones the project the questions won't be solved and that person can simply start coding. The answers will be in another module called "answers". 
