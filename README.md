# Strongloop - rest - connector Example


This is an example for loopback rest connector using [StrongLoop Platform](https://strongloop.com/get-started/). [Loopback](http://loopback.io/getting-started/) rest connector makes a ReSTful service as a datasource.



Refer - http://docs.strongloop.com/display/public/LB/REST+connector to install loopback-connector-rest to make ReSTful service as the datasource. 



## Uses of Strongloop

* [Tools](https://strongloop.com/node-js/arc/) for developing APIs quickly, building, profiling and monitoring Node apps
* To connect with legacy web services
* To scale rest services
* [Graphical and command line tools](https://strongloop.com/node-js/build-deploy-and-scale/) for managing processes, building, deploying, and clustering Node apps



In this example, we have a ReSTful web service which is built in [Spring Boot](https://spring.io/guides/gs/accessing-data-rest/). The restful service is to search patient record by name. The rest service uses hsqldb.


### To setup the restful webservice as a datasource

configure /path/to/server/datasources.json

```javascript
"PatientService": {
    "name": "PatientService",
    "connector": "rest",
    "operations": [
      {
        "template": {
          "method": "GET",
          "url": "http://localhost:8080/people/search/findByLastName{?name}",
          "query": {
              "name": "{name}"
          }
        },
        "functions": {
          "findByLastName": ["name"]  
        }
      }
    ]
  }
```



### add model config for restful web service

in /path/to/server/model-config.json

```
"Patient": {
    "dataSource": "PatientService",
    "public": true
  }
```  



### configure data model definition

* In /path/to/common/models/patient.js
* In /path/to/common/models/patient.json



### To start restful webservice
1. /path/to/DemoBCH>mvnw spring-boot:run

### To start strongloop
1. /path/to/local-server>slc run
2. http://0.0.0.0:3001/explorer - to view the UI

