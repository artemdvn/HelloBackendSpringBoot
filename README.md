# HelloBackendSpringBoot
 
REST-service 'hello' with resource /hello/contacts?nameFilter=val

Returns array of contacts in JSON format from the database table 'contacts', except records where 'contacts.name' matches the regular expression (the value of the parameter 'nameFilter').

DBMS MySQL is used, the initial filling of the database is used 'createTables.sql' script.

[![Build Status](https://travis-ci.org/artemdvn/HelloBackendSpringBoot.svg?branch=master)](https://travis-ci.org/artemdvn/HelloBackendSpringBoot)

