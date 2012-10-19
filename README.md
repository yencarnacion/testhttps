testhttps
=========

This is a small grails app that does two things:

1. it echoes the request headers on the index page; and,
2. it showcases an issue (as of October 18, 2012) in Amazon AWS Elastic Beanstalk wherein the instance's reverse proxy rewrites secure https urls into insecure http urls when using the Spring Security REQUIRES_SECURE_CHANNEL setting.  A problem with the rewritten url is that because the app enforces a secure url using the Spring Security REQUIRES_SECURE_CHANNEL setting, clicking on a url that should be secure from http results in a infinite loop.