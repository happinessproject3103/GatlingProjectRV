# Simple Gatling performance testing Parabank UI

## Getting Started

* Clone the repository from your fork to this directory
* Open the project using any Java IDE

## Dependencies
* Java Development Kit - 1.8
* Gatling - 3.3.1
* Gatling Mvn Plugin - 3.0.5
* Scala SDK - 2.12.10


##Running the Simulations
This command runs all the simulations
>mvn clean gatling:test


## Observations

UpdateProfile Page(https://parabank.parasoft.com/parabank/updateprofile.htm)

1.Simulating 100 users gives timeouts for AccountUpdate Page.

2.Out of all the requests 38 Request failed.


```shell
performancesimulation reports are in 
target/gatling/<simulation-name>-*/index.html
```
