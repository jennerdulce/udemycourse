# Spring Notes

## Spring MVC

- Model View Controller Framework
  - You make Models, Views, and Controllers
- Spring MVC Is a framework
- Model - handles data
- View - what user sees
- Controller - maps between them
  - Connects Model and View togehter

### Controllers

- Airtraffic controller: "You go over here, you go over here"
- Does not care at all about the actual airplane
- Just tells what to open when based on what is clicked on the webpage

## Spring

- **Spring** is different (dependency injection framework / inversion control)
- Heavyweight Java Framework
- Many layers and difficult classes
- More difficult

## Spring-Boot

- **Spring-Boot** is a lot of stuff
- Simplier, easier, lighterweight than **Spring**
- Streamlined and opinionated
- Convention over configuration: Follow this convention
  - "I'll let you make this web app very quickly"
  - "Follow this convention, name things in certain ways, put things in certain directories, user certain patterns, and I'll give you this giant applicaation."
  - "Follow this convention, and then you don't really need to tell me what to do, and I'll just do it per convention."
  - Gives you a bunch of things by default and the application will be created
  - **Lots of magic happening in the background**
    - Shadow structure
    - When it breaks, It'll be difficult to understand

## Spring Initializr

- Similar to gradle init but with more options and will do more for you

### Sprinig Initializr Steps

1. Project - Gradle
2. Language - Java
3. Spring Boot - 2.5.5
4. Group - Think of a unique domain - 'com.jennerdulce'
5. Artifact - Name of your project
6. Packaging - Jar
7. Java - 11
8. Dependencies
  - Spring Boot Dev Tools: Make changes, built app, and run. Be able to view project while in production
  - Spring Web: Uses Apache Tomcat as defualt embedded container, aids in building (RESTFUL) web applications using Spring MVC
  - Thymeleaf: Templating framework
  - Spring Security:
  - JPA:
  - Postgres:
  - Datadog: Analytics
  - Tomcat: Webserver, server that is actually serving up our webpages
9. Generate - Will create a zip file
10. Create a repository on github and unzip this file into that repo

## General Notes

- EADDR ERROR: Two websites running, close all and restart fresh
- HTML files: Generate quick boilerplate by typiing "!" then pressing tab