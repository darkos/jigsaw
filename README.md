# jigsaw

### examples for learning Java  9 modules

[Original link](http://openjdk.java.net/projects/jigsaw/quick-start)

Reminder for some commands:
```
javac -d mods/com.socket src/com.socket/module-info.java src/com.socket/com/socket/NetworkSocket.java src/com.socket/com/socket/spi/NetworkSocketProvider.java
javac -p mods -d mods/com.greetings src/com.greetings/module-info.java src/com.greetings/com/greetings/Main.java
javac -p mods -d mods/org.fastsocket src/org.fastsocket/module-info.java src/org.fastsocket/org/fastsocket/FastNetworkSocket.java src/org.fastsocket/org/fastsocket/FastNetworkSocketProvider.java


jar --create --file=mlib/com.socket@1.0.jar --module-version=1.0 -C mods/com.socket .
jar --create --file=mlib/org.fastsocket@1.0.jar --module-version=1.0 -C mods/org.fastsocket .
jar --create --file=mlib/com.greetings.jar --main-class=com.greetings.Main -C mods/com.greetings .
```

