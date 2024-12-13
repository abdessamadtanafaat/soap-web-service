# SOAP Web Service - Project : 
# Project Overview
This project implements a SOAP Web Service using Spring Boot and Spring Web Services (Spring-WS). The service allows the management of country information via several operations such as adding, updating, deleting, and retrieving country details.

## Key Features
SOAP Web Service with operations to manage country data:
AddCountry
UpdateCountry
DeleteCountry
GetAllCountries
SOAP Request and Response formatted with XML based on WSDL (Web Service Definition Language).
Spring Boot is used for easy setup and integration with the Spring ecosystem.
## Technologies Used
Spring Boot (version 3.x)
Spring Web Services (Spring-WS) for creating SOAP-based Web Services.
JAXB (Java Architecture for XML Binding) for XML binding and generating Java classes from XML schema (XSD).
SOAP-UI for testing SOAP requests and responses.
JMeter for performance testing.

## Service Endpoints
The service exposes a WSDL file (Web Service Definition Language) at:
http://localhost:8080/ws/countries.wsdl

## Testing SOAP Web Service
1. Testing with SOAP-UI
Create a new project in SOAP-UI using the WSDL URL: http://localhost:8080/ws/countries.wsdl.
Create requests for each SOAP operation (Add, Update, Delete, GetAll).
Send requests and check the responses for correctness.
Ensure successful responses with appropriate statuses.
2. Testing with JMeter
Set up a thread group in JMeter.
Configure HTTP Request samplers for each SOAP method.
Add listeners to view test results (e.g., View Results Tree, Aggregate Report).
Analyze throughput, response time, and error rates.

## Conclusion
This project demonstrates how to create and test a SOAP Web Service using Spring Boot and Spring Web Services. The service allows you to perform CRUD operations (Create, Read, Update, Delete) on country data and can be tested using tools like SOAP-UI and JMeter.
