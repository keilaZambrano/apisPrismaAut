# How to install Java JDK
  
  - [JDK Installation Instructions for Windows](#jdk-installation-instructions-for-windows) 
  - [Installation of the JDK on Linux Platforms](#installation-of-the-jdk-on-linux-platforms) 
  - [Installation of the JDK on macOS](#installation-of-the-jdk-on-macos) 

For any doubt, check [the official documentation](https://docs.oracle.com/en/java/javase/12/install/overview-jdk-installation.html)

## JDK Installation Instructions for Windows

Download and install maven on windows, linux or MAC OS. This guide is to learn how to install maven on windows OS.

- To install java JDK on windows, follow this steps:

    1. Download Java JDK installer and running it
    2. Setting the PATH Environment Variable
    3. Verify Java


## Step 1:
### Download Java JDK: 

- Access [download Java JDK](https://www.oracle.com/technetwork/java/javase/downloads/index.html) page and click Accept License Agreement. Under the Download menu, click the Download link that corresponds to the .exe for your version of Windows.

- Download Java JDK latest version (recommended version 12.0.1)

- For example: jdk-12.0.1_windows-x64_bin.exe

### Running the JDK Installer
You must have administrator privilege to install the JDK on Microsoft Windows.

To run the JDK installer:


1. Start the JDK 12 installer by double-clicking the installer's icon or file name in the download location.

2. Follow the instructions provided by the Installation wizard.


3. After the installation is complete, delete the downloaded file to recover the disk space.


## Step 2
### Setting the PATH Environment Variable:


It is useful to set the PATH variable permanently for JDK 12 so that it is persistent after rebooting.

If you do not set the PATH variable, then you must specify the full path to the executable file every time that you run it. For example:

<pre><code> C:\> "C:\Program Files\Java\jdk-12\bin\javac" MyClass.java</code></pre>
To set the PATH variable permanently, add the full path of the jdk-12\bin directory to the PATH variable. Typically, the full path is:
<pre><code>C:\Program Files\Java\jdk-12\bin</code></pre>
To set the PATH variable on Microsoft Windows:

1. Select Control Panel and then System.
2. Click Advanced and then Environment Variables.
3. Add the location of the bin folder of the JDK installation to the PATH variable in System Variables.

The following is a typical value for the PATH variable:

<pre><code>C:\WINDOWS\system32;C:\WINDOWS;"C:\Program Files\Java\jdk-12\bin"</code></pre>

## Step 4
### Verify Java JDK:

- To verify whether java is installed or not, open the command prompt and write:

<pre><code>java -−version</code></pre>


- Now it will display the version of java jdk.

- Let's see the output:

![Verify Java](imagesDocs/JavaJDK/JavaVersion.PNG "Java Version")


## Installation of the JDK on Linux Platforms
---

### Installing the JDK on Linux from Archive Binaries and RPM Packages
You can install the Java Development Kit (JDK) on a Linux platform from archive binary files or from Red Hat Package Manager (RPM) packages.

Installation can be performed by using one of the following processes:

- [From archive binaries](https://www.oracle.com/technetwork/java/javase/downloads/jdk12-downloads-5295953.html) (.tar.gz): This allows you to install a private version of the JDK for the current user into any location, without affecting other JDK installations. However, it may involve manual steps to get some of the features to work. See the following table for the options available for downloading and installing the JDK from archive binaries.

- [From RPM packages](https://www.oracle.com/technetwork/java/javase/downloads/jdk12-downloads-5295953.html) (.rpm): This allows you to perform a systemwide installation of the JDK for all users, and requires root access. RPM-based Oracle Linux platforms are based on Red Hat and SuSE. See the following table for the options available for downloading and installing the JDK from RPM packages.


### Installing the 64-Bit JDK 12 on Linux Platforms
---

You can install the JDK for 64-bit Linux from an archive binary file (.tar.gz).

To install the 64-bit JDK on a Linux platform:

1. Download the file, jdk-12.interim.update.patch_linux-x64_bin.tar.gz.

    Before you download a file, you must accept the license agreement. Anyone (not only by root users) can install the archive binary in any location having write access.

    The .tar.gz archive file (also called a tarball) is a file that can be uncompressed and extracted in a single step.

2. Change the directory to the location where you want to install the JDK, then move the .tar.gz archive binary to the current directory.

3. Unpack the tarball and install the JDK:
    <pre><code>$ tar zxvf jdk-12.interim.update.patch_linux-x64_bin.tar.gz</code></pre>

    The Java Development Kit files are installed in a directory called jdk-12<i>.interim.update.patch.</i>

4. Delete the .tar.gz file if you want to save disk space.


### Installing the 64-Bit JDK on RPM-Based Linux Platforms
---

You can install the JDK on 64-bit RPM-based Linux platforms, such as Red Hat and SuSE by using an RPM binary file (.rpm) in the system location.

Use the sudo command to run the RPM-based installation as a root user.

To install the 64-bit JDK on an RPM-based Linux platform:

1. Download the file, jdk-12.interim.update.patch_linux-x64_bin.rpm.

   Before you download a file, you must accept the license agreement.

2. Ensure that you have root user access by running the command su and entering the superuser password.

3. Install the package using the following command:
    <pre><code>$ rpm -ivh jdk-12.interim.update.patch_linux-x64_bin.rpm</code></pre>

    Upgrade the package using the following command:

    <pre><code>$ rpm -Uvh jdk-12.interim.update.patch_linux-x64_bin.rpm</code></pre>

4. Delete the .rpm file if you want to save disk space.

5. Exit the root shell.

    It is not required to reboot.

The JDK installation is integrated with the alternatives framework. After installation, the alternatives framework is updated to reflect the binaries from the recently installed JDK. Java commands such as java, javac, javadoc, and javap can be called from the command line.

Using the java -version command, users can confirm the default (recently installed) JDK version.

In addition, users can check which specific RPM package provides the .java files:

<pre><code>$ rpm -q --whatprovides java</code></pre>


## Installation of the JDK on macOS
---
This topic includes the following sections:
 - System Requirements for Installing the JDK on macOS
 - Determining the Default JDK Version on macOS
 - Installing the JDK on macOS

### System Requirements for Installing the JDK on macOS
The following are the system requirements for installing the JDK on macOS:
  - Any Intel-based computer running macOS.
  - Administrator privileges.

    You cannot install Java for a single user. Installing the JDK on macOS is performed on a systemwide basis for all users. Administrator privileges are required to install the JDK on macOS.

### Determining the Default JDK Version on macOS
When starting a Java application through the command line, the system uses the default JDK.

There can be multiple JDKs installed on the macOS system.

You can determine which version of the JDK is the default by entering java -version in a Terminal window. If the installed version is 12 Interim 0, Update 0, and Patch 0, then you see a string that includes the text 12. For example:
<pre><code>$  java -version
java version "12"
Java(TM) SE Runtime Environment (build 12)
Java HotSpot(TM) 64-Bit Server VM (build 23.2-b04, mixed mode)</pre></code>

To run a different version of Java, either specify the full path, or use the java_home tool. For example:

<pre><code>$ /usr/libexec/java_home -v 12 --exec javac -version</pre></code>

### Installing the JDK on macOS

To install the JDK on macOS:

1. Download the JDK .dmg file, jdk-12.interim.update.patch-macosx-x64.dmg.
    
   Before the file can be downloaded, you must accept the license agreement.

2. From either the browser Downloads window or from the file browser, double-click the .dmg file to start it.

    A Finder window appears that contains an icon of an open box and the name of the .pkg file.

3. Double-click the JDK 12.pkg icon to start the installation application.

   The installation application displays the Introduction window.

4. Click Continue.
   
   The Installation Type window appears.

5. Click Install.

    A window appears that displays the message: Installer is trying to install new software. Enter your password to allow this.

6. Enter the Administrator user name and password and click Install Software.

    The software is installed and a confirmation window is displayed.

After the software is installed, you can delete the .dmg file if you want to save disk space.