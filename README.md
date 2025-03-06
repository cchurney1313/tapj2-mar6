# TAP Java - p2
- Tap Java Webinar 2

- Check correct java version and setup if needed
```
mvn --version
# Should have Java version: 21.0.5
# If not, install java and set Java home
sudo apt update -y
sudo apt install openjdk-21-jdk -y
# check installation
ls -l /usr/lib/jvm/
# based on above java name add lines below
export JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64
export PATH=$JAVA_HOME/bin:$PATH
# To persist add above lines to ~/.bashrc in a codespace VM
code ~/.bashrc
```

- setup java microsoft extension
  - extensions > type java > Choose Microsoft Extension Pack for Java 

- Create new Maven project
  - Ctl+Shift+P > type java
  - Create Java project
  - choose maven > no Archtype > com.[name]

- cd into directory with POM.xml
  ```
  mvn clean package
  ```

- cd to target
  - java -cp [name].jar com.[name].[class name]
  - eg. java -cp demo-1.0-SNAPSHOT.jar com.example.Main
  - java -cp target/td-1.0-SNAPSHOT.jar com.tap.Main 

- add more files
  - add files
    - MyFunctions.java
    - C_ar.java

- Add package name to all the files
  - package com.tap;
