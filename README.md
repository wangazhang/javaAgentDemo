
# javaAgent Demo
测试javaAgent的一些方法
```
├── README.md
├── agentTest
│   ├── README.md
│   ├── out
│   │   └── production
│   │       └── javaAgent
│   │           ├── META-INF
│   │           │   └── MANIFEST.MF
│   │           └── classes
│   │               └── TransClass.class
│   ├── pom.xml
│   ├── src
│   │   └── main
│   │       ├── java
│   │       │   └── com
│   │       │       └── java
│   │       │           └── agent
│   │       │               ├── AgentTest.java
│   │       │               └── domainClass
│   │       │                   └── TransClass.java
│   │       └── resources
│   └── target
│       ├── classes
│       │   └── com
│       │       └── java
│       │           └── agent
│       │               ├── AgentTest.class
│       │               └── domainClass
│       │                   └── TransClass.class
│       └── generated-sources
│           └── annotations
├── javaAgent
│   ├── javaAgent.iml
│   ├── out
│   │   └── artifacts
│   │       └── javaAgent_jar
│   │           └── javaAgent.jar
│   ├── pom.xml
│   ├── src
│   │   └── main
│   │       ├── java
│   │       │   └── com
│   │       │       └── java
│   │       │           └── agent
│   │       │               ├── agentDemo.java
│   │       │               ├── domainClass
│   │       │               │   ├── TransClass.java
│   │       │               │   └── User.java
│   │       │               └── transformer
│   │       │                   ├── FirstAgent.java
│   │       │                   ├── SecondAgent.java
│   │       │                   └── Transformer.java
│   │       └── resources
│   │           ├── META-INF
│   │           │   └── MANIFEST.MF
│   │           └── classes
│   │               └── TransClass.class
│   └── target
│       ├── classes
│       │   ├── META-INF
│       │   │   └── MANIFEST.MF
│       │   ├── classes
│       │   │   └── TransClass.class
│       │   └── com
│       │       └── java
│       │           └── agent
│       │               ├── agentDemo.class
│       │               ├── domainClass
│       │               │   ├── TransClass.class
│       │               │   └── User.class
│       │               └── transformer
│       │                   ├── FirstAgent.class
│       │                   ├── SecondAgent.class
│       │                   └── Transformer.class
│       └── generated-sources
│           └── annotations
└── pom.xml

 
 
```
# agentTest
启动类启动参数
-javaagent:{jarPath}={args}

exp:
```
-javaagent:${user.home}/IdeaProjects/04_open/02_apm/javaAgentDemo/javaAgent/out/artifacts/javaAgent_jar/javaAgent.jar=hello
```
