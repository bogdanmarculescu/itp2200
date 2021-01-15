# itp2200
Material for the ITP2200 - Introduction to software testing

Getting stuff up and running - Frequently asked questions.

#### How do I get the code in IntelliJ?
Import the project into IntelliJ using git. 
File -> New -> Project From version control -> Git.
Note: you need to have git installed in order for this to work.

My suggestion is that you clone the entire repository, since that will include the code, the test code, and the slides. 

#### I don't see an option to Run my code. What can I do?
First, you need to setup the Java Development Kit (JDK). Go to "File -> Project Structure -> Project -> Project SDK" and select some Java version. We recommend using either Java 8 or Java 11.

Also, IntelliJ needs to know what files it can expect to run and what not.
Marking files: 
- the /exercises/ folder is "Sources Root Folder"
- the /test/ folder is "Test Root Folder"

This should allow you to run everything (with coverage, too). Also make sure you have the JDK properly setup. 
Note that you should also setup a folder for outputs (complied files and suchlike, that the IDE needs). 
Create a folder called "itp2200/out" and assign it as the output folder going to "File -> Project Structure -> Project -> Project compiler output". Since this contains compiles files, it does not belong on git, so it is not part 
of this repository. 

#### How do I get JUnit to work with my code?

You will need to use JUnit to run the tests you write, and you things like assertions. This is how you accomplish this:
- ProjectStructure (top right corner of IntelliJ) -> Libraries -> Add (plus sign) -> from maven -> junit:junit:4.12

#### I only see coverage data for my test folder (or just not all the test coverage data I would like to see). 

In the Edit Run/Debug configurations dialog -> Edid configuration -> Code coverage -> Packages and classes to include
in coverage data.  

