# How to install Maven.
 
 - [Downloading Apache Maven](https://maven.apache.org/download.cgi)
 - [Installing Apache Maven](#installing-apache-maven) 
 - [Verify Maven](#verify-maven)


 For any doubt, check [the official documentation](https://maven.apache.org/) 

## Installing Apache Maven

The installation of Apache Maven is a simple process of extracting the archive and adding the bin folder with the mvn command to the PATH.

Detailed steps are:

  - Ensure JAVA_HOME environment variable is set and points to your JDK installation

  - Extract distribution archive in any directory

<pre><code>unzip apache-maven-3.6.1-bin.zip</pre></code>
or

tar xzvf apache-maven-3.6.1-bin.tar.gz

Alternatively use your preferred archive extraction tool.

- Add the bin directory of the created directory apache-maven-3.6.1 to the PATH environment variable

- Confirm with mvn -v in a new shell. The result should look similar to

<pre><code>
Apache Maven 3.6.1 (d66c9c0b3152b2e69ee9bac180bb8fcc8e6af555; 2019-04-04T21:00:29+02:00)
Maven home: /opt/apache-maven-3.6.1
Java version: 1.8.0_45, vendor: Oracle Corporation
Java home: /Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre
Default locale: en_US, platform encoding: UTF-8
OS name: "mac os x", version: "10.8.5", arch: "x86_64", family: "mac"</pre></code>

## Windows Tips
 - Check environment variable value e.g.
<pre><code> 
echo %JAVA_HOME% 
C:\Program Files\Java\jdk1.7.0_51</pre></code>

- Adding to PATH: Add the unpacked distribution’s bin directory to your user PATH environment variable by opening up the system properties (WinKey + Pause), selecting the “Advanced” tab, and the “Environment Variables” button, then adding or selecting the PATH variable in the user variables with the value C:\Program Files\apache-maven-3.6.1\bin. The same dialog can be used to set JAVA_HOME to the location of your JDK, e.g. C:\Program Files\Java\jdk1.7.0_51

- Open a new command prompt (Winkey + R then type cmd) and run mvn -v to verify the installation.

## Unix-based Operating System (Linux, Solaris and Mac OS X) Tips
- Check environment variable value

<pre><code>echo $JAVA_HOME
/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home</pre></code>
- Adding to PATH

<pre><code>export PATH=/opt/apache-maven-3.6.1/bin:$PATH</pre></code>

## Verify Maven:

- To verify whether maven is installed or not, open the command prompt and write:

<pre><code>mvn -−version</code></pre>


- Now it will display the version of maven and jdk including the maven home and java home.

- Let's see the output:

![Maven Version](imagesDocs/mavendownload4.jpg "Maven Version")



