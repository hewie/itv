@echo off
call mvn -f../persistence-contract/pom.xml clean install
call mvn -f../validator-contract/pom.xml clean install
call mvn -f../parser-contract/pom.xml clean install
call mvn -f../persistence/pom.xml clean install
call mvn -f../validator/pom.xml clean install
call mvn -f../parser/pom.xml clean install
call mvn -f../controller/pom.xml clean install
call mvn -f../main/pom.xml clean install
