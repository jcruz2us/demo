# Getting Started

### Setup
WIP
```bash
brew install cask java # java 13
brew install cask docker # docker for mac


# Start docker app, enable k8s cluster

brew install gradle
brew install skaffold

./start_dev.sh
```


### Dev Environment
Docker images are built using [`jib`](http://github.com/GoogleContainerTools/jib)

Deployed onto a local [`Docker Desktop Kubernetes cluster`](https://docs.docker.com/docker-for-mac/#kubernetes) cluster

Deploys & File watching are handled by [`skaffold`](https://github.com/GoogleContainerTools/skaffold)


### Useful links
https://dev.to/pozo/continuous-development-with-java-and-kubernetes-3d08

https://start.spring.io/


### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.5.RELEASE/gradle-plugin/reference/html/)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.2.5.RELEASE/reference/htmlsingle/#using-boot-devtools)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.2.5.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

