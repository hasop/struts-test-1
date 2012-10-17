# Struts test project

This repository is about testing Java/Struts development.

## Requirements

* Java 1.6+
* [Apache Tomcat 6+](http://tomcat.apache.org/)
* [Struts 1.3.9](http://struts.apache.org/1.x/)
* [Maven 3.x](http://maven.apache.org/docs/3.0.4/release-notes.html)
* (... and having a GitHub account)

## Go for it

1. Fork this repository with your own GitHub account.
2. Implements a login process (see guidelines after). 
3. Once sources are coded and webapp can be runned, commit/push to your GitHub fork. 
4. Submit a pull request from your forked repository to this original one.
5. Go to next steps...

## Implementation guidelines

Running webapp should provide following login process:

![Login process mockup](https://raw.github.com/cchantep/struts-test/master/docs/login-mockup.png)

* It must be possible to compile and package webapp only with Maven: do not add requirements/dependencies to any IDE.
* Login screen must be displayed at webapp root `/`. 
* Authentication check must done against provided class `cchantep.services.MockupSecurityService`.
* Labels/messages must be localized (using struts), at least for french and english.
